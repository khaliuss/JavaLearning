package OOP.Lesson4;

public class Employee {
    String name;
    String profession;
    double salary;

    public Employee(String name, String profession, double salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Salary: " + salary);
    }
}
