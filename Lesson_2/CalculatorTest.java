import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {        
        Calculator casio = new Calculator();
        Scanner scanNumbers = new Scanner(System.in);
        Scanner scanOperations = new Scanner(System.in);
        Scanner scanReplay = new Scanner(System.in);

        do {
            String isExit; // переменная хранения yes/no 
            System.out.print("Enter first number: ");
            casio.setNum1(scanNumbers.nextInt());
            
            do {
                System.out.print("Enter operation: ");
                casio.setOperation(scanOperations.nextLine());
            } while(casio.getUncorrectOperation()); //повторять пока true (неккоректный символ операции)
            
            System.out.print("Enter second number: ");
            casio.setNum2(scanNumbers.nextInt());         
            System.out.println("Result: " + casio.getResult());
            
            do {
                System.out.println("Replay? (yes / no)");
                isExit = scanReplay.nextLine();
                casio.setUncorrectText(isExit);
            } while(casio.getUncorrectText()); //повторять пока true. (неккоректный текст команды)

            casio.setIsReplay(isExit);
        } while(casio.getIsReplay()); //повторять пока true (команда yes)
    }
}