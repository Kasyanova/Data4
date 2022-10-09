/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:


        1. Выведите максимальный и минимальный элемент массива.

        2. Из максимального и минимального значения выведите наибольшее по модулю
*/

import java.util.Arrays; //для нахождения max и min из массива

public class Main {
    public static void main(String[] args) {

        //заполнить массив из 15 элементов рандомно от -20 до 20
        int[] myArray = new int[15];
        for (int i=0;i<myArray.length;i++) {
            myArray[i]=(int)(-20+(Math.random()*41));
        }

        /* посмотреть массив
        for (int j=0;j<myArray.length;j++) {
            System.out.println(myArray[j]);
        }
        */

        int max = Arrays.stream(myArray).max().getAsInt(); //найти максимальное число из массива
        int min = Arrays.stream(myArray).min().getAsInt(); //найти минимальное число из массива

        /* посмотреть максимальное и минимальное из массива
        System.out.println("Максимальное из массива: "+max);
        System.out.println("Минимальное из массива: "+min);
        */

        int maxModal=Math.abs(max); //найти модуль максимального
        int minModal=Math.abs(min); //найти модуль минимального

        if (maxModal > minModal) System.out.println("Наибольшее по модулю из двух чисел: "+max);
        else System.out.println("Наибольшее по модулю из двух чисел: "+min);
        //как можно сократить запись?
    }
}