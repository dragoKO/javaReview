import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/*
Getters: Lombok generates getters for all non-static fields in the class.
Setters: Lombok generates setters for all non-final non-static fields in the class.
equals(): Lombok generates an equals() method to compare objects based on their field values.
hashCode(): Lombok generates a hashCode() method based on the fields of the class.
toString(): Lombok generates a toString() method to provide a string representation of the object, including the values of its fields.
 */
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeLombok2 {
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private char gender;
}
