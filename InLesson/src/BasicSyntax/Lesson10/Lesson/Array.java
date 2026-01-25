package BasicSyntax.Lesson10.Lesson;

public class Array {

    static void main() {
        String[] namesOfMonths = new String[12];
        namesOfMonths[0] = "January";
        namesOfMonths[1] = "February";
        namesOfMonths [2] = "March";
        namesOfMonths[3] = "April";
        namesOfMonths [4] = "May";
        namesOfMonths [5] = "June";
        namesOfMonths[6] = "July";
        namesOfMonths [7] = "August";
        namesOfMonths[8] = "September";
        namesOfMonths[9] = "October";
        namesOfMonths [10] = "November";
        namesOfMonths[11] = "December";

        System.out.println(namesOfMonths.length);

        for (int i =0; i< namesOfMonths.length; i++){
            System.out.print(namesOfMonths[i]);

            if (i<namesOfMonths.length-1){
                System.out.print(", ");
            }else {
                System.out.print(".");
            }
        }

    }
}
