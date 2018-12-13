import java.util.Scanner;

class Main {
    static char [][] area;
    static final char X = 'X';
    static final char O = 'O';
    static final char def = '#';
    static int mapSize = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void initArea (int size) {
        area = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                area[i][j] = def;
            }
        }
    }

    static void printArea (){
        System.out.println();
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void playerHit (int size) {
        System.out.println("Сделайте ход. 1 - горизонталь  2 - вертикаль");
        int num1 = scanner.nextInt() ;
        int num2 = scanner.nextInt() ;
        while (num1 > size || num2 > size || area[num1-1][num2-1] == X || area[num1-1][num2-1] == O) {
            System.out.println("Введите правильный диапазон чисел до " + size);
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
        area[num1-1][num2-1] = X;
    }

    static void aiHit (){
        int num1;
        int num2;
        do{
            num1 = (int) (Math.random()*3);
            num2 = (int) (Math.random()*3);
        }while (area[num1][num2] == O || area[num1][num2] == X);
        area[num1][num2] = O;
    }

    static boolean chek(char sym){
        for (int i = 0; i < mapSize; i++) {
            if(area[i][0] == area[i][1] && area[i][0] == area[i][2] && area[i][0] == sym) {
                return true;
            }
            else if(area[0][i] == area[1][i] && area[0][i]== area[2][i] && area[0][i] == sym) {
                return true;
            }
        }
        if (area[0][0] == area[1][1] && area[0][0] == area[2][2] && area[0][0] == sym) {
            return true;
        }
        else if (area[0][2] == area[1][1] && area[0][2] == area[2][0] && area[0][2] == sym) {
            return true;
        }
        return false;
    }

    static boolean areaFull(){
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if(area[i][j] == def) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initArea(mapSize);
        printArea();
        while (true){
            playerHit(mapSize);
            if(chek(X)){
                printArea();
                System.out.println("Победил игрок!");
                break;
            };
            aiHit();
            if (chek(O)){
                printArea();
                System.out.println("Искуственный интелект чудом победил!");
                break;
            };
            printArea();
            if(areaFull()){
                printArea();
                System.out.println("Ничья, некуда ходить");
                break;
            }
        }
        System.out.println("Игра окончена!");
    }
}


