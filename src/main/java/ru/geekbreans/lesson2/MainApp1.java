package ru.geekbreans.lesson2;

public class MainApp1 {
    public static void main(String args[]) {
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr = { 1, 0, 1, 1 };
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i]==1) {
                System.out.println(arr [i] = 0);
                // } else if (i == 1) {
                //    System.out.println(arr[i] = 1);
            } else {
                System.out.println(arr [i] = 1);
            }
        }
    }
}
