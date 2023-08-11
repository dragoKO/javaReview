package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        // static method
        Calculate sum = (x, y) -> Calculator.sum(x, y);
        sum.calculate(5, 6);

        Calculate sum2 = Calculator::sum;
        sum2.calculate(5, 6);

        // instance method
        Calculate divide=(x,y)-> new Calculator().divide(x,y);
        divide.calculate(8,4);

        Calculator obj=new Calculator();
        Calculate divide2=obj::divide;
        divide2.calculate(8,4);

        Calculate divide3=new Calculator()::divide;
        divide3.calculate(100,10);
        System.out.println("=================================================================");

        BiFunction<String,Integer,String> returnSubstring=(s,l)->s.substring(l);
        System.out.println(returnSubstring.apply("Java",2));

        BiFunction<String,Integer,String> returnSubstring2=String::substring;
        System.out.println(returnSubstring2.apply("Java",3));

        Consumer<String> print=System.out::println;
        print.accept("Java King");


    }

    ;
}
