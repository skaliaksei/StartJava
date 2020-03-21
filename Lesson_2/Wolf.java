public class Wolf {
    
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String color;    

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Uncorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Wolf moving");
    }

    public void sit() {
        System.out.println("Wolf siting");
    }

    public void run() {
        System.out.println("Wolf running");
    }

    public void say() {
        System.out.println("Wolf howling");
    }

    public boolean hunt() {
        return true;
    }
}