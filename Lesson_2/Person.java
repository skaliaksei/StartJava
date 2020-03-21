public class Person {
    int age = 20;
    String name = "Aliaksei";
    String sex = "man";
    int height = 170;
    float weight = 65.3f;

    void move() {
        System.out.println("Вы идете");
    }

    void sit() {
        System.out.println("Вы сидите");
    }

    void run() {
        System.out.println("Вы бежите");
    }

    boolean speak() {
        System.out.println("Вы говорите");
        return true;
    }

    boolean learnJava() {
        System.out.println("Вы учите Java");
        return true;
    }
}