package OOP.Lesson10;

import OOP.Lesson5_6.Box;

public class WeightBox extends Box {

    private double weight;

    public WeightBox(double length, double width, double height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public WeightBox(int weight) {
        this.weight = weight;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(" Weight: " + weight + "\n");
    }
}
