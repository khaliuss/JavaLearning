package Exseptions;

public class Main {

    static void main() {

        int a =0;

        try {
            int c = Integer.parseInt("asd");
            int b = 8/a;
        }catch(ArithmeticException e){
            System.out.println("You can't divide by zero");
        }catch (Exception e){
            System.out.println("Exception is "+e.getClass());
        }

        System.out.println("Hello");


        int[] strings = new int[2];
        try{
            strings[0] = 1;
            strings[1] = 1;
            strings[2] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass() +" : "+ e.getMessage());
        }


    }


}
