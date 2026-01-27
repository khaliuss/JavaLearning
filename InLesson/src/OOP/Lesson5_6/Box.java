package OOP.Lesson5_6;

public class Box {

    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    Box increase(){
        return new Box(this.length*2,this.width*2,this.height*2);
    }



    String inform() {
        return length+" "+width+" "+height;
    }

}
