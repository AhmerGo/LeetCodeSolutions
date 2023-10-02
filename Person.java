public class Person { 
    private String name;
    private int age;

    public Person() {
        name = "Unknown Name";
        age = 0;
    }

    public Person(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}