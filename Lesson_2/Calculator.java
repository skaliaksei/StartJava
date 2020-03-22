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

   
    

    public boolean getUncorrectOperation() {
        uncorrectOperation = false;
        if(operation.equals("+")) {
            //System.out.println("Command good");
        } else if(operation.equals("-")) {
            //System.out.println("Command good");
        } else if(operation.equals("*")) {
            //System.out.println("Command good");
        } else if(operation.equals("/")) {
           // System.out.println("Command good");
        } else if(operation.equals("^")) {
           // System.out.println("Command good");
        } else if(operation.equals("%")) {
           // System.out.println("Command good");
        } else {
            System.out.println("Command error");
            uncorrectOperation = true;
        }
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
        } 
        return result;        
    }


    

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