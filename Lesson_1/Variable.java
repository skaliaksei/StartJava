public class Variable {
    public static void main(String[] args) {
        byte core = 4;
        short family = 7;
        long model = 4820;
        float freq = 3.7f;
        double ram = 16.0d;
        char index = 'i';
        boolean isGood = true;

        System.out.println("core " + core + ", " + index + family + "-"+ model +"K, CPU "+ freq +" GHz, RAM "+ ram +" Gb");
        System.out.println(isGood);
    }
}