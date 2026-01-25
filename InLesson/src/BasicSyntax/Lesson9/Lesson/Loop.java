package BasicSyntax.Lesson9.Lesson;

public class Loop {
    static void main() {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
            if (i == 5){
                break;
            }
        }

        System.out.println("\n--------\n");
        int j = 0;

        while (j<10){
            System.out.println(j);
            j +=2;
        }


        int a =0;
        do {
            System.out.println("Hello");
        }while (a>0);


        for (int k=0;k<10;k++){
            System.out.println("k "+k);
        }

    }
}
