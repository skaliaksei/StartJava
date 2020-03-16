public class Cycle {
    public static void main(String[] args) {        
        //Цикл от 0 до 20
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        //Цикл от 6 до -6 с шагом 2
        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j -= 2;
        }
        System.out.println("");

        //Сумма нечетных от 10 до 20
        int k = 10;
        int sumOdd = 0;
        System.out.print("Sum of ");
        do {
            if (k % 2 != 0) {
                System.out.print(k + " ");
                summ += k;
            }
            k++;
        } while (k <= 20);
        System.out.println("is " + sumOdd);
    }
}