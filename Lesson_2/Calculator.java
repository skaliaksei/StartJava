public class Calculator {
    
    private int num1;  
    private String operation;
    private int num2;
    private int result;
    private boolean uncorrectOperation;
    private boolean correctText;
    private boolean replay;

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

    // public int getResult() {
    //     //Вычисление:
    //     //int result = 0;
    //     if (operation.equals("+")) {
    //         return num1 + num2;
    //     }
    // }

    public boolean getUncorrectOperation() {
        return uncorrectOperation;
    }

 


    public int getResult() {
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
        } else { 
            System.out.println("Command error"); // Неизвестная команда вычисления
            this.uncorrectOperation = true;
        }
        return result;        
    }

    
//javac Calculator.java CalculatorTest.java
    // public int getResult() {
    //     if(operation.equals("yes")) {
    //         return num1 + num2;
    //     }
    // }

    
    // } else if (operation == '-') { // Вычитание
    //     result = num1 - num2;
    //     System.out.println(num1 + " - " + num2 + " = " + result);
    // } else if (operation == '*') { // Умножение
    //     result = num1 * num2;
    //     System.out.println(num1 + " * " + num2 + " = " + result);
    // } else if (operation == '/') { // Деление
    //     result = num1 / num2;
    //     System.out.println(num1 + " / " + num2 + " = " + result);
    // } else if (operation == '^') { // Возведение в степень
    //     result = num1;
    //     for (int i = 1; i < num2; i++) {
    //         result *= num1;
    //     }
    //     System.out.println(num1 + " ^ " + num2 + " = " + result);
    // } else if (operation == '%') { // Деление по модулю
    //     result = num1 % num2;
    //     System.out.println(num1 + " % " + num2 + " = " + result);
    // } else { 
    //     System.out.println("Command error"); // Неизвестная команда вычисления
    // }
    

    public boolean getCorrectText() {
        return correctText;
    }

    public void setCorrectText(String correctText) {
        if (correctText.equals("yes")) {
            this.correctText = false;
        } else if (correctText.equals("no")) {
            this.correctText = false;
        } else {
            this.correctText = true;
            System.out.println("Uncorrect command");
        }   
    }


    public boolean getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        if (replay.equals("yes")) {
            this.replay = true;
        } else if (replay.equals("no")) {
            this.replay = false;
        }   
    }
    
}