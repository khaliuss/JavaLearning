package OOP.Lesson10;

public class CatFamily {

    private int legs;

    private int eyes;

    private boolean canEatAHuman;

    /*public CatFamily() {
        this.legs = 4;
        this.eyes = 2;
        this.canEatAHuman = true;
    }*/

    public CatFamily(int legs, int eyes, boolean canEatAHuman) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatAHuman = canEatAHuman;
    }

    public void eat(){
        System.out.print("Eating ");
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatAHuman() {
        return canEatAHuman;
    }
}

