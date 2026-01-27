package OOP.Lesson12.Home;

import java.util.ArrayList;

public class Main {

    static void main() {
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        Programmer programmer = new Programmer();
        Chef chef = new Chef();
        Director director = new Director();



        workers.add(programmer);
        workers.add(chef);
        workers.add(director);

        drivers.add(programmer);
        drivers.add(chef);

        for(Worker worker : workers){
            worker.work();
        }

        for(Driver driver : drivers){
            driver.drive();
        }


    }

}
