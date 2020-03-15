public class MyFirstGame {
    public static void main(String[] args) {
        boolean result = true; //index цикла
        int question = 8; //Загаданное число
        int question = 8; //Загаданное число
        int answer = 15; //Первый ответ пользователя
        System.out.println("Comp: Guess my number, please");
        do {
            System.out.println("User: " + answer);
            if (answer < question) {
                System.out.println("Comp: No, my number is bigger. Let's again");
                answer++;
                result = false;
            }
            else if (answer > question) {
                System.out.println("Comp: No, my number is smaller. Let's again");
                answer--;
                result = false;
            }
            else {
                System.out.println("Comp: Yes! It's true");
                result = true;
            }
        } while(result == false); //Продолжать цикл, пока результат false
    }
}