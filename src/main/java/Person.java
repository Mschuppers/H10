import com.sun.tools.javac.Main;

public class Person extends Human{

    protected int age;
    protected String universalRights = "All humans are equal";
    protected String name;
    protected Gender gender;
    protected static final int maxAge = 131;

    protected enum Gender {
        MALE,
        FEMALE
    }

    //SETTERS


    //GETTERS
    public int getAge() {return age;}
    public Gender getGender() {
        return gender;
    }

    //CONSTRUCTORS
    public Person(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //MAIN


    public static void main(String[] args) {
        Person p = new Person("Sasha", 35, Gender.FEMALE);
        p.greet();
    }


    @Override
    String greet() {
        return "Hello my name is " + name+". Nice to meet you!";
    }
}






