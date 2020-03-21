public class WolfTest {    
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Name = " + wolfOne.name + ", age = " + wolfOne.age + ", color = " + wolfOne.color + ", weight = " + wolfOne.weight);
        if(wolfOne.hunt()) {
            System.out.println("Wolf hunting");
        } else {
            wolfOne.move();
        }
    }
}