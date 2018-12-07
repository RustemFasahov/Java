import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(task1(10)));
        System.out.println(Arrays.toString(task2()));
        System.out.println(Arrays.toString(task3()));
        task4(10,10);

        int[] maxNumberMinNumber = task5(10);
        System.out.printf("Максимальный номер в цикле %d, минимальный %d.",maxNumberMinNumber[0], maxNumberMinNumber[1]);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите степень для числа 2");
        int degree = in.nextInt();
        System.out.printf("Число 2 в степени %d, равняется %d.", degree, task6(degree));

        task7(5,5);

        int[] array = {1,2,2,1,2,1,1,6,4,3,1,1,1,3,1,1,1};
        System.out.println(task8(array));

        int[] arrayOnOffset = {1,2,3,4,5,6,7,8};
        int offsetNumber = 2;
        System.out.printf("Смещение массива %s на число %d, приводит к результату %s.",
                          Arrays.toString(array),offsetNumber, Arrays.toString(task9(arrayOnOffset,offsetNumber)));

    }
//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] task1(int number) {
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

//2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static int[] task2() {
        int[] array2 = new int[8];
        int number1 = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i]= number1;
            number1 +=3;
        }
        return array2;
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] task3() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] *= 2;
        }
        return array3;
    }

//4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами;
    public static void task4(int numberX, int numberY) {
        int[][] array4 = new int[numberY][numberX];
        for (int y = 0; y < array4.length; y++) {
            System.out.println();
            for (int x = 0; x < array4[y].length; x++) {
                System.out.print(x == y || x == (array4[y].length - y - 1) ? "[1]" : "[ ]");
            }
        }
    }

//5. ** Задать одномерный массив и найти в нем минимальный и
// максимальный элементы (без помощи интернета);
    public static int[] task5 (int lenghtOfArray) {
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

//5*.(Из презентации) Вывести на экран N степеней двойки. N вводится с консоли.
    public static int task6 (int degree) {
        int numberOfDegree = 2;
        for (int i = 1; i < degree; i++) {
            numberOfDegree *= 2;
        }
        return numberOfDegree;
    }

//3*.(Из презентации) Заполнить таблицу N M числами в соответствии с примером
//   5 5
//   1 2 3 4 5
//   10 9 8 7 6
//   11 12 13 14 15
//   20 19 18 17 16
//   21 22 23 24 25
    public static void task7(int numberX, int numberY) {
        int number1 = 0;
        for (int i = 0; i < numberY; i++) {
            System.out.println();
            for (int j = 0; j < numberX; j++) {
                number1++;
                System.out.printf("%4d", number1);
            }
        }
    }

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
// checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
// граница показана символами ||, эти символы в массив не входят.
    public static boolean task8 (int[] array){
        boolean answer = false;
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        if (sum % 2 == 0){
            int sum1 = 0;
            for(int i = 0; i<array.length; i++){
                sum1 += array[i];
                if (sum1 == sum/2){
                    answer = true;
                }
            }
        }
        return answer;
    }

//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить
// все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static int[] task9 (int[] array, int n){
        int number = n % array.length;
        if (number > 0) {
            for (int i = number; i > 0; i--) {
                int rememberNumber = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = rememberNumber;
            }
        }
        if (number < 0) {
            for (int i = number; i < 0; i++) {
                int rememberNumber = array[0];
                for (int j = 0; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = rememberNumber;
            }
        }
        return array;
    }

//Реализовал смещение массива на указанное положительное число с использованием массива.
    public static int[] task10(int[] array, int n){
            int[] array1 = new int[n];
            if (n > 0) {
                for (int i = array.length, j = array1.length; j > 0; j--, i--) {
                    array1[j - 1] = array[i - 1];
                }
                for (int i = array.length - 1, j = array.length - n; j > 0; j--, i--) {
                    array[i] = array[i - n];
                }
                for (int i = 0; i < array1.length; i++) {
                    array[i] = array1[i];
                }
            }
        return array;
    }
}

