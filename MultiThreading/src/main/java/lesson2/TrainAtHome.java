package lesson2;

public class TrainAtHome {

    static void main() {
        withoutConcurrency();
        withConcurrency();
    }


    private static void withoutConcurrency(){
        float [] array = new float[10_000_000];

        for (int i = 0; i < array.length-1; i++) {
            array[i] = 1;
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length-1; i++) {
            array[i] = (float)(array[i]*Math.sin(0.2f + i/5)*Math.cos(0.2f + i/5)*Math.cos(0.4f+i/2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Time of method withoutConcurrency is  "+(end-start));

    }

    private static void withConcurrency(){
        float [] array = new float[10_000_000];
        float [] split1 = new float[array.length/2];
        float [] split2 = new float[array.length/2];

        for (int i = 0; i < array.length-1; i++) {
            array[i] = 1;
        }

        long startTime = System.currentTimeMillis();
        System.arraycopy(array,0,split1,0,array.length/2);
        System.arraycopy(array,array.length/2,split2,0,array.length/2);

       Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < split1.length-1; i++) {
                   split1[i] = (float)(split1[i]*Math.sin(0.2f + i/5)*Math.cos(0.2f + i/5)*Math.cos(0.4f+i/2));
               }
           }
       });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime3 = System.currentTimeMillis();
                for (int i = 0; i < split2.length-1; i++) {
                    split2[i] = (float)(split2[i]*Math.sin(0.2f + i/5)*Math.cos(0.2f + i/5)*Math.cos(0.4f+i/2));
                }
                long endTime3 = System.currentTimeMillis();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.arraycopy(split1,0,array,0,array.length/2);
        System.arraycopy(split2,0,array,array.length/2,array.length/2);

        long endTime = System.currentTimeMillis();

        System.out.println("Time of method withConcurrency is "+(endTime-startTime));


    }

}
