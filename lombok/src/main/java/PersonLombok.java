import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;


// Usage

    public static void main(String[] args) {
        PersonLombok person = PersonLombok.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .address("123 Main Street")
                .phoneNumber("555-1234")
                .build();
        System.out.println(person);
    }
}
