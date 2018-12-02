import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        byte a1 = 10;
        short b1 = 15022;
        int c1 = 2000000;
        long d1 = 4089853;
        float e = 3483902.0f;
        double g = 48938439.0;
        char h = 'H';
        boolean k = true;

        System.out.println(result(10,54,34,2));
        System.out.println(answer(120,6) ? "Входит в предел" : "Не лежит в пределе");

        // Задания из методички.
        int a=5, b=6, c=3, d= 4;
        System.out.println("Результат сложения " + decision(a,b,c,d));
        System.out.println("Лежит ли число в интервале? " + interval(15));
        System.out.println("Передаваемое число 60 " + positiveOrNegative(60));
        System.out.println("Предаваемое число -30 " + negativeNumber(-30));
        printName("Рустем");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемый год: ");
        System.out.println(yearAnswer(scanner.nextInt()));

    }

    public static int result (int a, int b, int c, int d){           // Домашнее из презентации
        return a*(b+(c/d));
    }

    static boolean answer (int number1, int number2){                // Домашнее из презентации
        return (number1 + number2 >= 10 && number1 + number2 <= 20);
    }

    public static int decision (int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean interval (int number){
        return (number >= 10 && number <= 20);
    }

    public static String positiveOrNegative (int number){
        return (number >= 0) ? "Позитивное число" : "Негативное число";
    }

    public static String negativeNumber (int number){
        return (number < 0) ? "Число негативное" : "Число позитивное";
    }

    public static void printName (String name){
        System.out.println(name);
    }

    public static String yearAnswer (int year){
        String answer = "";
        if (year % 4 == 0){
            if (year % 100 != 0 || year % 400 == 0)
                answer = "Год высокосный";
            else if (year % 100 == 0){
                answer = "Год не высокосный";
            }
        }
        else if (year % 4 != 0) {
            answer = "Год не высокосный";
        }
        return answer;
    }
}

