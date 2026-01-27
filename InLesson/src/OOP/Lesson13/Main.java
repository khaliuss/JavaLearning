package OOP.Lesson13;

public class Main {

    static void main() {


        Programmer programmer = new Programmer();
        Chef chef = new Chef();
        Director director = new Director();

        director.force(programmer);
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Working ");
            }
        });

        Client client = new Client();

        client.makeOrder(new WaiterOld(),"Pizza");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Brings "+dish);
            }
        }, "Hamburger");



    }

}
