package doubleColonOperator;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Car {
    private String make;
    private int year;
    private String color;

    public Car() {
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }
}
