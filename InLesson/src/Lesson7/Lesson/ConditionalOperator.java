package Lesson7.Lesson;

public class ConditionalOperator {
    static void main() {
        int temp = 27;
        boolean hot = temp > 25;
        boolean cold = temp < 22;

        int time = 23;
        boolean isNight = time>22 || time<6;



        if (hot && !isNight){
            System.out.println("The AC is on.");
        } else if (cold){
            System.out.println("The AC is off.");
        }else {
            System.out.println("It’s not doing anything.");
        }
    }
}
