//Victor Alvarez
//Dog.java
public class Dog {

    // Fields
    private String name;
    private int age;
    private String breed;

    // No-arg constructor
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    // Parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;   // validation
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    // toString override
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
