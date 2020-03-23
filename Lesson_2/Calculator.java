public class Calculator {
    
    private int num1;  
    private String operation;
    private int num2;
    private int result;
    private boolean uncorrectOperation;
    private boolean uncorrectText;
    private boolean isReplay;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getOperation() {
         return operation;
    }

    public void setOperation(String operation) {

        this.operation = operation;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }    

    public boolean getUncorrectOperation() { //Метод проверки корректности ввода операции
        uncorrectOperation = false;
        switch(operation) {
            case "+":
                break;
            case "*":
                break;
            case "-":
                break;
            case "/":
                break;
            case "^":
                break;
            case "%":
                break;
            default:
                System.out.println("Command error");
                uncorrectOperation = true;
        }
        return uncorrectOperation;
    }

    public int getResult() {             //Метод вычисления
        if(operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        } else if (operation.equals("^")) {
            result = num1;
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
        } else if (operation.equals("%")) {
            result = num1 % num2;
        } 
        return result;        
    }

    public boolean getUncorrectText() {
        return uncorrectText;
    }

    public void setUncorrectText(String uncorrectText) { //Метод проверки корректности ввода yes/no
        if (uncorrectText.equals("yes")) {
            this.uncorrectText = false;
        } else if (uncorrectText.equals("no")) {
            this.uncorrectText = false;
        } else {
            this.uncorrectText = true;
            System.out.println("Uncorrect command");
        }   
    }


    public boolean getIsReplay() {
        return isReplay;
    }

    public void setIsReplay(String isReplay) { //Метод завершения/продолжения программы
        if (isReplay.equals("yes")) {
            this.isReplay = true;
        } else if (isReplay.equals("no")) {
            this.isReplay = false;
        }   
    }   
}