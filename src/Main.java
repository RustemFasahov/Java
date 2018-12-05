import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lesson1(10))); // Выполнение задания №1
        System.out.println(Arrays.toString(lesson2(8)));//Выполнение задания №2
        System.out.println(Arrays.toString(lesson3()));// Выполнение задания №3
        lesson4(10,10); // Выполнение задания №4

        int[] maxNumberMinNumber = lesson5(10);//Выполнение задания №5
        System.out.println("Максимальный номер в цикле " + maxNumberMinNumber[0] + " ,минимальный номер в цикле " + maxNumberMinNumber[1]);

        Scanner in = new Scanner(System.in); //Задания из презентации №1
        System.out.println("Введите степень для числа 2");
        int degree = in.nextInt();
        System.out.println("Число 2 в степени " + degree + ", равняется " + lesson6(degree));

        lesson7(5,5);//Задания из презентации 2
    }

    public static int[] lesson1(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else if (array[i] == 0) array[i] = 1;
        }
        return array;
    }

    public static int[] lesson2(int number) {
        int[] array2 = new int[number];
        int number1 = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i]= number1;
            number1 +=3;
        }
        return array2;
    }

    public static int[] lesson3() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
        }
        return array3;
    }

    public static void lesson4(int numberX, int numberY) {
        int[][] array4 = new int[numberY][numberX];
        for (int y = 0; y < array4.length; y++) {
            System.out.println();
            for (int x = 0; x < array4[y].length; x++) {
                System.out.print(x == y || x == (array4[y].length - y - 1) ? "[X]" : "[ ]");
            }
        }
    }

    public static int[] lesson5 (int lenghtOfArray) {
        int[] array5 = new int[lenghtOfArray];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random() * 100);
        }
        int maxNumber = array5[0];
        int minNumber = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > maxNumber) maxNumber = array5[i];
            if (array5[i] < minNumber) minNumber = array5[i];
        }
        int[] maxAndMin = {maxNumber,minNumber};
        return maxAndMin;
    }

    public static int lesson6 (int degree) {
        int numberOfDegree = 2;
        for (int i = 1; i < degree; i++) {
            numberOfDegree *= 2;
        }
        return numberOfDegree;
    }

    public static void lesson7(int numberX, int numberY) {
        int number1 = 0;
        for (int i = 0; i < numberY; i++) {
            System.out.println();
            for (int j = 0; j < numberX; j++) {
                number1++;
                System.out.printf("%4d", number1);
            }
        }
    }
}

