import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {        
        Calculator casio = new Calculator();
        Scanner scanNumbers = new Scanner(System.in);
        Scanner scanOperations = new Scanner(System.in);
        Scanner scanReplay = new Scanner(System.in);

        do {
            // int a = 2;
            // String b = "*";
            // int c = 3;
            String exit;


            // casio.setNum1(a);
      
            // casio.setOperation(b);
      
            // casio.setNum2(c);



            System.out.print("Enter first number: ");
            casio.setNum1(scanNumbers.nextInt());
            
            do {
                System.out.print("Enter operation: ");
                casio.setOperation(scanOperations.nextLine());
            } while(casio.getUncorrectOperation());
            
            System.out.print("Enter second number: ");
            casio.setNum2(scanNumbers.nextInt());         
            System.out.println("Result: " + casio.getResult());
            
            do {
                System.out.println("Replay? (yes / no)");
                exit = scanReplay.nextLine();
                casio.setCorrectText(exit);
            } while(casio.getCorrectText());



            casio.setReplay(exit);
        } while(casio.getReplay());
    }
}