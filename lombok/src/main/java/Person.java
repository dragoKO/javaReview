import lombok.Builder;
import lombok.Data;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    private Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.age = this.age;
            person.address = this.address;
            person.phoneNumber = this.phoneNumber;
            return person;
        }
    }

        public static void main(String[] args) {
            Person person = new Person.PersonBuilder()
                    .firstName("John")
                    .lastName("Doe")
                    .age(30)
                    .address("123 Main Street")
                    .phoneNumber("555-1234")
                    .build();
            System.out.println(person);
        }


}

