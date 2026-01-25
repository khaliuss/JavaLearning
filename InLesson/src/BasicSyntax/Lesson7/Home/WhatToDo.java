package BasicSyntax.Lesson7.Home;

public class WhatToDo {

    static void main() {
        boolean isWhetherGood = false;
        boolean isNight = true;

        if (isNight){
            System.out.println("Sleep");
        }

        if(!isNight && isWhetherGood){
            System.out.println("Go to walk");
        }

        if (!isNight && !isWhetherGood){
            System.out.println("Read a book");
        }
    }

}
