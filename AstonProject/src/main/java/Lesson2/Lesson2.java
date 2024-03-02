package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {

        String fruit1 = "Orange";
        String fruit2 = "Banana";
        String fruit3 = "Apple";
        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 4;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }
    public static void printColor() {

        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value  > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {

        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
