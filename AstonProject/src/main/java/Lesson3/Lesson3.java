package Lesson3;
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        printNumberSign();
        checkNumberSign();
        printLineNTimes();
        defineLeapYear();
        replaceNumber();
        fillInArray();
        multiplyByTwo();
        defineArrDiagonal();


    }


    public static class MyClass {
        int a;
        int b;

        private static boolean countSum(int a, int b) {
            int c = a + b;
            return c >= 10 && c <= 20;
        }
    }

    //--------------task2----------------
    public static void printNumberSign() {
        int a = 3;

        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }


    //--------------task3----------------
    public static void checkNumberSign() {
        int a = 3;
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    //--------------task4----------------
// Написать метод, которому в качестве аргументов
// передается строка и число, метод должен отпечатать в консоль
// указанную строку, указанное количество раз;
    private static void printLineNTimes() {
        String str = "line";
        int n = 6;
        for (int i = n; i > 0; i--, n++) {
            System.out.println(str);
        }

    }

    //-----------------task5-------------------------

    public static void defineLeapYear() {
        int year = 1730;

        if (year % 4 == 0 | year % 400 == 0) {
            System.out.println("true");
        } else if (year % 100 == 0) {
            System.out.println("false");
        } else {
            System.out.println("false");
        }
    }


    //-----------------task6-------------------------
//Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void replaceNumber() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        for (int element : arr) {

            System.out.println(element);
        }


    }

    //-----------------task7-------------------------
    //Задать пустой целочисленный массив длиной 100. С помощью
    // цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    public static void fillInArray() {

        int[] arr = new int[100];
        int val = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val;
            val += 1;
            System.out.println(arr[i]);
        }
    }

    //-----------------task8-------------------------
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiplyByTwo() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    //-----------------task9-------------------------
// Создать квадратный двумерный целочисленный массив (количество
// строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить
// его диагональные элементы единицами (можно только одну из
// диагоналей, если обе сложно). Определить элементы одной из
// диагоналей можно по следующему принципу: индексы таких элементов
// равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    public static void defineArrDiagonal() {

        int size = 6;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //-----------------task10-------------------------
    //Написать метод, принимающий на вход два аргумента:
    // len и initialValue, и возвращающий одномерный массив типа int
    // длиной len, каждая ячейка которого равна initialValue.

    public static int[] createArray(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}













