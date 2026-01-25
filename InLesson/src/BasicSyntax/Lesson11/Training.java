package BasicSyntax.Lesson11;

public class Training {
    static void main() {
        int[] integers = new int[100];


        for (int i =0;i<integers.length;i++){
            integers[i] = i+100;

        }

        for(int num : integers){
            System.out.println(num);
        }

    }
}
