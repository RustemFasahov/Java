import java.util.Scanner;

class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            playGame();
            System.out.println("Желаете играть повторно? да - 1, нет - 0");
        }while (enterNumber()==1);
        System.out.println("<<<<<<<<<<<< Игра окончена >>>>>>>>>>>>");

    }

    public static int randomNumber(){
        return (int)(Math.random()*10);
    }

    public static void playGame(){
        int life = 3;
        int rememberNumber = randomNumber();
        System.out.println();
        System.out.println("<<<<<<<<<<<< Игра началась >>>>>>>>>>>>>");
        System.out.println("Угадайте число от 0 до 9.");
        while (life >0){
            System.out.println("Введите число");
            int number = enterNumber();
            if(rememberNumber == number){
                System.out.println("Угадал!");
                break;
            }
            else {
                if (rememberNumber > number){
                    System.out.println("Загаданное число больше :)");
                }
                else{
                    System.out.println("Загаданное число меньше :(" );
                }
                life--;
                System.out.println("Количество жизней " + life);
            }
        }
        if(life == 0)System.out.println("Вы проиграли ;( (Подслушано, что загаданное число - " + rememberNumber + ")");
        else System.out.println("Вы выиграли :-)");
    }

    public static int enterNumber(){
        int number;
        do {
            number = scanner.nextInt();
        }while (number<0 || number>9);
            return number;
    }
}

