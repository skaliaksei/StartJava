public class WolfTest {    
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("man");
        wolfOne.setName("Glor");
        wolfOne.setWeight(12.2f);
        wolfOne.setAge(5);
        wolfOne.setColor("White");

        System.out.println("Name = " + wolfOne.getName() + ", age = " + wolfOne.getAge() + ", color = " + wolfOne.getColor() + ", weight = " + wolfOne.getWeight());
        if(wolfOne.hunt()) {
            System.out.println("Wolf hunting");
        } else {
            wolfOne.move();
        }
    }
}