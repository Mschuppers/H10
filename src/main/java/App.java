public class App {

    public static void main(String[] args) {
        Person p = new Person("Bob", 24, Person.Gender.MALE);
        Android a = new Android();
        Teacher t = new Teacher("Jeremiah", 58, Person.Gender.MALE);
        Employee e = new Employee("Alyssa", 32, Person.Gender.FEMALE);

        a.charging(10);

        System.out.println(p.greet());
        System.out.println(a.greet());
        System.out.println(t.greet());
        System.out.println(e.greet());

    }
}
