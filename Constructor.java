class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        System.out.println("Person 1:");
        person1.displayDetails();

        Person person2 = new Person("Alice", 30);
        System.out.println("\nPerson 2:");
        person2.displayDetails();
    }
}
