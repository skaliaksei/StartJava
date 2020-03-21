public class Wolf {
    
    String sex = "man";
    String name = "Glor";
    float weight = 12.2f;
    int age = 14;
    String color = "White";    

    void move() {
        System.out.println("Wolf moving");
    }

    void sit() {
        System.out.println("Wolf siting");
    }

    void run() {
        System.out.println("Wolf running");
    }

    void say() {
        System.out.println("Wolf howling");
    }

    boolean hunt() {
        return true;
    }
}