import lombok.*;
import lombok.experimental.Accessors;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Accessors(fluent = true)
//@RequiredArgsConstructor -> we can initialize final fields
public class EmployeeLombok {
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private char gender;

    public static void main(String[] args) {
        EmployeeLombok el=new EmployeeLombok();
        // @Accessors(fluent = true)
        el.firstName("Oleh").lastName("Kochetkov").email("philly@gmail.com").gender('M').salary(150_000);
        System.out.println(el);
    }
}
