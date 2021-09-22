public class Employee extends Person{
    public Employee(String name, int age, Person.Gender gender) {
        super(name, age, gender);
    }

    @Override
    String greet() {
        return "I'm tired of working, this is inhuman!";
    }








}
