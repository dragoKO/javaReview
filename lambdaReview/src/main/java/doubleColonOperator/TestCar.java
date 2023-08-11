package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestCar {
    public static void main(String[] args) {
        // zeroArg
        Supplier<Car> carSupplier=Car::new; // only works if we do not have arguments
        System.out.println(carSupplier.get());

        // oneArg
        Function<String,Car> car2=make->new Car(make);
        System.out.println(car2.apply("Tesla"));

        Function<String,Car> car3=Car::new;
        System.out.println(car3.apply("BMW"));

        // twoArg
        BiFunction<String,Integer,Car> car4=(m,y)->new Car(m,y);
        System.out.println(car4.apply("Mazda",2023));

        BiFunction<String,Integer,Car> car5=Car::new;
        System.out.println(car5.apply("Audi",2022));
    }
}
