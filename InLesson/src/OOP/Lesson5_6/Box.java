package OOP.Lesson5_6;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    Box increase(){
        return new Box(this.length*2,this.width*2,this.height*2);
    }



    public void showInfo() {
        System.out.print( "Length: "+length+" Width: "+width+" Height: "+height+" ");
    }

}
