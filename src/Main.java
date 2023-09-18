import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        /*
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        */
        exercise12();
    }

    public static void exercise1() {
        System.out.println("\"Your time is limited," +
                "\n\t so don’t waste it\n\t\t " +
                "living someone else’s life\"" +
                "\n\t\t\t Steve Jobs");
    }

    public static void exercise2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = in.nextInt();
        System.out.print("percent:");
        double percent = (double) in.nextInt() / 100;
        System.out.println(percent * 100 + "% of " + num + " = " + num * percent);
    }

    public static void exercise3() {
        Scanner in = new Scanner(System.in);
        String num = "";
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter number #" + i + ":");
            num += in.next();
        }
        System.out.println("num is " + num);
        int number = Integer.parseInt(num);
    }

    public static void exercise4() {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a six-digit number: ");
            num = in.nextInt();
            if (num < -999999 || num > 999999 || (-100000 < num && num < 100000)) {
                System.out.println("error, in your number is not a six-digit number");
            }
        } while (num < -999999 || num > 999999 || (-100000 < num && num < 100000));
        char ch = 0;
        if (num < 0) {
            num = -num;
            ch = '-';
        }
        String myNum = valueOf(num);
        String myNewNum = "";
        myNewNum = myNewNum + myNum.charAt(5) + myNum.charAt(4) + myNum.substring(2, 4) + myNum.charAt(1) + myNum.charAt(0);
        System.out.println("new Num = " + myNewNum);
    }

    public static void exercise5() {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter number of month: ");
            num = in.nextInt();
            if (num > 0 && num < 13) {
                if (num == 12 || num < 3) System.out.println("Winter");
                else if (num <= 5) System.out.println("Spring");
                else if (num <= 8) System.out.println("Summer");
                else System.out.println("Autumn");
            } else {
                System.out.println("Error, your number not from 1 to 12");
            }
        } while (num < 0 || num > 12);
    }

    public static void exercise6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter meters: ");
        double meters = in.nextDouble();
        byte choise = 0;
        do {
            System.out.println("choose which units to convert to: 1-miles, 2-inches, 3-yards : ");
            choise = in.nextByte();// как-то необходимо обработать исключения 1- числа больше 1 байта.  2 буквы
        } while (choise < 1 || choise > 3);
        System.out.print(meters + " meters =");
        switch (choise) {
            case 1:
                System.out.println(meters * 1.609344 / 1000 + " miles");
                break;
            case 2:
                System.out.println(meters * 39370.078740157 / 1000 + " inches");
                break;
            case 3:
                System.out.println(meters * 1093.6132983377 / 1000 + " yards");
                break;
        }
    }

    public static void exercise7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = in.nextInt();
        int finish = in.nextInt();
        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }
        System.out.println("start= " + start);
        System.out.println("finish= " + finish);

        for (int i = start % 2 != 0 ? start : start + 1; i <= finish; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void exercise8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range: ");
        int start = in.nextInt();
        int finish = in.nextInt();
        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }
        for (int i = start; i <= finish; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + i * j + "\t");
            }
            System.out.println();
        }

    }

    public static void exercise9() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        int maxElem = 0;
        int minElem = 10; //как использовать предельно большое и малое значение INT?
        int quantityOfZeros = 0;
        int quantityOfPlus = 0;
        int quantityOfMinus = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] < minElem) minElem = arr[i];
            if (arr[i] > maxElem) maxElem = arr[i];

            if (arr[i] == 0) quantityOfZeros++;
            else if (arr[i] > 0) quantityOfPlus++;
            else quantityOfMinus++;
        }
        System.out.println("\nmaxElem = " + maxElem + "\nminElem = " + minElem + "\nquantityOfZeros = " + quantityOfZeros +
                "\nquantityOfPlus = " + quantityOfPlus + "\nquantityOfMinus = " + quantityOfMinus);
    }

    public static void exercise10() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
        byte counterEven = 0;
        byte counterOdd = 0;
        byte counterMinus = 0;
        byte counterPlus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) counterEven++;
                else counterOdd++;

                if (arr[i] > 0) counterPlus++;
                else counterMinus++;
            }
        }
        System.out.println();
        int[] arrOfEven = new int[counterEven];
        int[] arrOfOdd = new int[counterOdd];
        int[] arrOfPositiveNum = new int[counterPlus];
        int[] arrOfNegativeNum = new int[counterMinus];

        int indEven = 0;
        int indOdd = 0;
        int indPos = 0;
        int indNeg = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) arrOfEven[indEven++] = arr[i];
                else arrOfOdd[indOdd++] = arr[i];

                if (arr[i] > 0) arrOfPositiveNum[indPos++] = arr[i];
                else arrOfNegativeNum[indNeg++] = arr[i];
            }
        }
        showArr(arrOfEven);
        showArr(arrOfOdd);
        showArr(arrOfPositiveNum);
        showArr(arrOfNegativeNum);
    }

    public static void showArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void exercise11() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the line: ");
        int length = 0;
        boolean flag;
        do {
            flag = false;
            try {
                length = in.nextInt();
            } catch (Exception ex) {
                System.out.print("Error of input, is not integer - enter again:");
                in.next();
                flag = true;
            }
        } while (flag);

        boolean direction = true; //true - vertical   false - horizontal
        System.out.print("Choose direction: 1 -vertically; 2 (or any symbol) - horizontally ");
        String temp = in.next();
        if (temp.charAt(0) != '1') direction = false;

        char ch;
        System.out.print("Enter symbol: ");
        temp = in.next();
        ch = temp.charAt(0);

        System.out.println("length = " + length + ", direction = " + direction + ", ch = " + ch);

        temp = direction ? "\n" : "";//пропуск строки или нет
        for (int i = 0; i < length; i++) {
            System.out.print(ch + temp);
        }
    }

    public static void exercise12() {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(20);
        }
        boolean toHigh = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a sorting option: 1- from low to high, 2 - from high to low ");
        String temp=in.next();
        if (temp.charAt(0)=='2') toHigh=false;

        int[] aux = Arrays.copyOf(arr, arr.length); // подсобный массив для сортировки;
        // сортируем массив `arr`, используя вспомогательный массив `aux`
        mergesort(arr, aux, 0, arr.length - 1, toHigh); // 0 индекс начала сортировки массива,
        System.out.println(Arrays.toString(arr));
    }

    // Объединяем два отсортированных подмассива `arr[low…mid]` и `arr[mid+1…high]`
    public static void merge(int[] arr, int[] aux, int low, int mid, int high, boolean toHigh) {
        int k = low, i = low, j = mid + 1;
        //пока есть элементы в левом и правом рядах
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {// <= - по возрастанию    >= по убыванию
                aux[k++] = toHigh ? arr[i++] : arr[j++];
            } else {
                aux[k++] = toHigh ? arr[j++] : arr[i++];
            }
        }
        // копируем оставшиеся элементы
        while (i <= mid) {
            aux[k++] = arr[i++];
        }

        // Вторую половину копировать не нужно (поскольку остальные элементы
        // уже находятся на своем правильном месте во вспомогательном массиве)

        // копируем обратно в исходный массив, чтобы отразить порядок сортировки
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }
    }

    public static void mergesort(int[] arr, int[] aux, int low, int high, boolean toHigh) {
        if (high <= low) {
            return;
        }//если размер меньше или равен 1 элементу
        // найти середину
        int mid = (low + ((high - low) >> 1));
        // рекурсивно разделяем прогоны на две половины до тех пор, пока размер прогона не станет <= 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов

        mergesort(arr, aux, low, mid, toHigh);// разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high, toHigh);     // разделить/объединить правую половину
        merge(arr, aux, low, mid, high, toHigh);        // объединяем две половинки

    }

    public static void hello()
    {
        System.out.println("Hello");
    }
}