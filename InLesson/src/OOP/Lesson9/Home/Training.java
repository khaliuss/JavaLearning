package OOP.Lesson9.Home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Training {

    static void main() {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("Andrew");
        names.add("Bob");
        names.add("Cezar");
        names.add("David");
        names.add("Elsa");

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            res.add(numbers.get(i)+" - "+names.get(i));
        }

        System.out.println(res);



        HashSet<String> hNames = new HashSet<>();

        hNames.add("Andrew");
        hNames.add("Bob");
        hNames.add("Cezar");
        hNames.add("David");
        hNames.add("Elsa");

        for (String n : hNames){
            System.out.println(n);
        }

    }

}
