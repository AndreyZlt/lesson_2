package ru.geekbreans.lesson1;

public class MainApp {
    public static void invertArray() {
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr = {1, 0, 1, 1, 0};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(arr[i] = 0);
            } else {
                System.out.println(arr[i] = 1);
            }
        }
    }


    public static void fillArray() {
        // Задать пустой целочисленный массив размером 8.
        // Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int result = -2;
        for (int i = 0; i < 8; i++) {
            System.out.print(result += 3);
        }
    }


    public static void changeArray() {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] <= 6) {
                System.out.print(w[i] * 2 + ", ");
            }
        }
    }
}