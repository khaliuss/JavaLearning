package OOP.Lesson8;

public class Main {
    static void main() {
       /* String[] employees = getEmployees();
        String[] newArray = new String[employees.length+1];

        for(int i = 0; i < employees.length;i++){
            newArray[i] = employees[i];
        }

        newArray[newArray.length-1] = "Kiko";
        employees = newArray;
        employees[0] = null;

        String[]  newestArray = new String[employees.length-1];
        for (int i = 0,j=0; i < employees.length; i++) {
            String employer = employees[i];
            if (employer != null){
                newestArray[j] = employer;
                j++;
            }
        }

        employees = newestArray;


        for(String emp : employees){
            System.out.println(emp);
        }




    }

    private static String[] getEmployees(){

        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Karl";
        employees[3] = "Bobby";
        employees[4] = "Lilo";

        return employees;*/

        MyArrayList list = new MyArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println();

        System.out.println(list);

        list.removeAt(2);
        System.out.println(list);

        list.removeAt("8");
        System.out.println(list);


        System.out.println(list.get(5));


    }
}
