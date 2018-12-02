public class Main {
    public static void main(String[] args) {
        // Выполнение задания №1
        int [] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i]= (int) (Math.random()*2);
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0; i<array.length; i++){
            if(array[i] == 1) array[i]= 0;
            else if (array[i] == 0) array[i]= 1;
            System.out.print(array[i]);
        }
        System.out.println();

        // Выполнение задания №2
        int [] array2 = new int[8];
        int number = 0;
        for (int i =0; i<array2.length; i++){
            array2[i] = number;
            number +=3;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Выполнение задания №3
        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i<array3.length; i++){
            if(array3[i] < 6) array3[i] *= 2;
            System.out.print(array3[i] + " ");
        }

        // Выполнение задания №4
        int[][] array4 = new int[10][10];
        for(int y=0; y<array4.length; y++){
            System.out.println();
            for (int x=0; x<array4[y].length; x++){
                System.out.print(x==y || x == (array4[y].length - y - 1) ? "[X]" : "[ ]");
            }
        }
        
        //Выполнение задания №5
        int[] array5 = new int[20];
        for (int i=0; i<array5.length; i++){
            array5[i]= (int) (Math.random()*100);
        }
        int maxNumber = 0;
        for (int i=0; i<array5.length; i++){
            if (array5[i]> maxNumber) maxNumber = array5[i];
        }
        int minNumber = maxNumber;
        for (int i=0; i<array5.length; i++){
            if (array5[i]<minNumber) minNumber = array5[i];
        }
        for (int i=0; i<array5.length; i++){
            System.out.print(array5[i] + " ");
        }

        System.out.println("Минимальное число " + minNumber + " Максимальное число " + maxNumber);
    }
}
