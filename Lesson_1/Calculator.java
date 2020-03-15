public class Calculator {
    public static void main(String[] args) {
        
        //Введенные значения пользователем:
        int num1 = 9;  
        int operation = '^';
        int num2 = 3;

        //Вычисление:
        int result = 0;
        if (operation == 43) { // Сложение
            result = num1 + num2;
            System.out.println(num1 +" + "+ num2 +" = "+ result);
        }
        else if (operation == 45) { // Вычитание
            result = num1 - num2;
            System.out.println(num1 +" - "+ num2 +" = "+ result);
        }
        else if (operation == 42) { // Умножение
            result = num1 * num2;
            System.out.println(num1 +" * "+ num2 +" = "+ result);
        }
        else if (operation == 47) { // Деление
            result = num1 / num2;
            System.out.println(num1 +" / "+ num2 +" = "+ result);
        }
        else if (operation == 94) { // Возведение в степень
            result = num1;
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
            System.out.println(num1 +" ^ "+ num2 +" = "+ result);
        }
        else if (operation == 37) { // Деление по модулю
            result = num1 % num2;
            System.out.println(num1 +" % "+ num2 +" = "+ result);
        }
        else { // Неизвестная команда вычисления
            System.out.println("Command error");
        }
    }
}