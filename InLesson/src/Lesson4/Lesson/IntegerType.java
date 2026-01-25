package Lesson4.Lesson;

public class IntegerType {
    public static void main(String[] args) {
        long speed = 300_000;
        long distance = 365 * 24 * 60 * 60 * speed;
        System.out.println(distance);

        byte b = 10;
        b= (byte) (b+10);
        b++;
        b++;
        System.out.println(b);
    }
}
