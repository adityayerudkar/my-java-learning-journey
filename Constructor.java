class Person {	
    // Default constructor
    Person() {
        System.out.println("Default Person constructor called.");
    }

    // Parameterized constructor
    Person(String name, float height) {
        System.out.println("Person name = " + name);
        System.out.println("Person height = " + height);
    }
}

// Separate class for demonstrating methods
class MethodDemo {
    void sum() {
        int a = 10, b = 20;
        int result = a + b;
        System.out.println("Sum = " + result);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Using parameterized constructor
        Person p = new Person("Rakesh", 5.10f);

        // Using MethodDemo
        MethodDemo m = new MethodDemo();
        m.sum();
    }
}
