import java.util.Objects;

public class Box<S,I,F> {
    private S   value1;
    private I   value2;
    private F   value3;

    public Box(S value1,I value2,F value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public S getValue1() {
        return value1;
    }

    public I getValue2() {
        return value2;
    }

    public F getValue3() {
        return value3;
    }

}
