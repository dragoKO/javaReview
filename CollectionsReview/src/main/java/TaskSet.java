import java.util.HashSet;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
        System.out.println(firstRepeatingInAString_1("Java developer"));
        System.out.println(firstRepeatingInAString_1("abc"));
        System.out.println("====================================================");

        Set<Student> set=new HashSet<>();
        set.add(new Student(1, "Oleh"));
        set.add(new Student(2, "Tony"));
        set.add(new Student(3, "Viky"));
        set.add(new Student(4, "Pablo"));
        set.add(new Student(5, "John"));
        set.add(new Student(5, "John"));
        System.out.println(set);


    }

    public static Character firstRepeatingInAString_1(String str){
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (!set.add(ch)){
                return ch;
            }
        }
        return null;
    }


}
