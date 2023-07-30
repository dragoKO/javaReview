import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        set.add(new Student(1, "Oleh"));
        set.add(new Student(2, "Tony"));
        set.add(new Student(3, "Viky"));
        set.add(new Student(4, "Pablo"));
        set.add(new Student(5, "John"));
        System.out.println(set);


    }




}
