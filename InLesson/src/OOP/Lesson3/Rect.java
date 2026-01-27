package OOP.Lesson3;

public class Rect {
    double length;
    double width;


    void setDimens(int length,int width){
        this.length = length;
        this.width = width;
    }

    double square(){
        return length*width;
    }
}
