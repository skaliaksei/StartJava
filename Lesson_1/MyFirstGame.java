public class MyFirstGame {
    public static void main(String[] args) {
        int askNum = 8; //Загаданное число
        int answerNum = 15; //Первый ответ пользователя
        
        System.out.println("Comp: Guess my number, please");
        do {
            System.out.println("User: " + answerNum);
            if (answerNum < askNum) {
                System.out.println("Comp: No, my number is bigger. Let's again");
                answerNum++;
            } else if (answerNum > askNum) {
                System.out.println("Comp: No, my number is smaller. Let's again");
                answerNum--;
            }
        } while(answerNum != askNum);
        System.out.println("User: " + answerNum);
        System.out.println("Comp: Yes! It's true");
    }
}