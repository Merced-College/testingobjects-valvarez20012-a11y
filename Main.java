//Victor Alvarez
//Main.java
public class Main {
    public static void main(String[] args) {

        // ----- PART A: Default Object Print -----
        Dog dog1 = new Dog();
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // ----- PART B: Field Defaults -----
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.getName());
        System.out.println("age = " + d1.getAge());
        System.out.println("breed = " + d1.getBreed());

        // ----- PART C: Constructors -----
        Dog d2 = new Dog();
        System.out.println("\nd2 after default constructor:");
        System.out.println(d2);

        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println(d3);

        // ----- PART D: toString() -----
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // ----- PART E: Encapsulation with Setters -----
        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");

        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        // ----- DESTINY 2 CLASS TESTS -----
        System.out.println("\n--- Guardian Class Tests (Destiny 2) ---");

        Guardian g1 = new Guardian();
        System.out.println("Default Guardian: " + g1);

        Guardian g2 = new Guardian("Cayde-7", "Hunter", 1820, true);
        System.out.println("Parameterized Guardian: " + g2);

        g2.setLightLevel(1835);
        g2.setName("Ace");
        g2.setClassType("Hunter");

        System.out.println("After setter updates: " + g2);
        System.out.println("Has Ghost? " + g2.hasGhost());
    }
}
