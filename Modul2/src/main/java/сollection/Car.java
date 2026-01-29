package сollection;

import java.util.Objects;

public class Car {

    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand,number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;

        return number == car.number && Objects.equals(brand,car.brand);
    }

}
