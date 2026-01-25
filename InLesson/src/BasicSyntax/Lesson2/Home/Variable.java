package BasicSyntax.Lesson2.Home;

public class Variable {
    public static void main() {
        int days = 10000;
        int years = days/365;
        int months = days%365/30;
        int day = days%365%30;

        StringBuilder result = new StringBuilder("years: "+years+" months: "+months+" days: "+day);
        System.out.println(result);
    }
}
