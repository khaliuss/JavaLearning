package BasicSyntax.Lesson11;

public class ForEach {
    static void main() {
        String[] names = {
          "Helen",
          "Max",
          "John",
          "Piter"
        };

        for (String name : names){
            System.out.println(name);
        }
    }
}
