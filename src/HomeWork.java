public class HomeWork {

    public static void main(String[] args) {
        byte a = 10;
        short b = 15022;
        int c = 2000000;
        long d = 4089853;
        float e = 3483902.0f;
        double g = 48938439.0;
        char h = 'H';
        boolean k = true;

        System.out.println(result(10,54,34,2));
        System.out.println(answer(17,6) ? "Входит в предел" : "Не лежит в пределе");

    }

    static int result (int a, int b, int c, int d){
        int number = a*(b+(c/d));
        return number;
    }

    static boolean answer (int number1, int number2){
        int addition = number1 + number2;
        boolean answer;
        return answer = (addition >= 10 && addition <= 20) ? true : false;

    }
}

