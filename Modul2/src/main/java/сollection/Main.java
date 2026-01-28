package сollection;

public class Main {

    static void main() {
        CarArrayList carArrayList = new CarArrayList();
        carArrayList.add(new Car("Car 1",1));
        carArrayList.add(new Car("Car 2",2));
        carArrayList.add(new Car("Car 3",3));
        carArrayList.add(new Car("Car 4",4));
        carArrayList.add(new Car("Car 5",5));
        carArrayList.add(new Car("Car 6",6));

        System.out.println("The car is -> "+carArrayList.get(5).getBrand());

        carArrayList.add(new Car("Car 10",10),2);
        System.out.println("The car10 in -> "+carArrayList.get(2).getBrand());
        System.out.println("The car is -> "+carArrayList.get(5).getBrand());
        System.out.println("The car is -> "+carArrayList.get(6).getBrand());

        System.out.println("------------------------");

        carArrayList.add(new Car("Car 155",155),5);
        System.out.println("The car10 in -> "+carArrayList.get(2).getBrand());
        System.out.println("The car is -> "+carArrayList.get(5).getBrand());
        System.out.println("The car is -> "+carArrayList.get(6).getBrand());
        System.out.println("The car is -> "+carArrayList.get(7).getBrand());
        System.out.println("The car is -> "+carArrayList.get(8).getBrand());



    }



}
