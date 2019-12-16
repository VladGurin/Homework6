package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
       int[] array = new int[10];  // создаем массив из 10 целых чисел
       for (int i=0; i < 10; i++) {
           System.out.println(" Input 10 positive digits: ");  // запрашиваем ввод 10 целых чисел с клавиатуры
           Scanner in = new Scanner(System.in);
           array[i] = in.Nextint();
       }

       for (int i = 0; i <= array.length - 1; i++ ) {  // сортируем элементы массива методом Выбора
          int min = i;
           for (int j = i+1; j <= array.length; j++) {
               if (array[j] < array[min]) {
                        min = j;}
           }
       int temp = array[i];
           array[i] = array[min];
           array [min] = temp;
        }

       System.out.println ( "Input number to find: "); //вводим число, которое хотим найти в отсортированном массиве
       Scanner in = new Scanner(System.in);
       int numberToFind = in.Nextint();

        int first = 0;  // значение индекса первого элемента массива
       int la = array.length - 1; // значение индекса последнего элемента массива
while (first < la) {               //
    int midleIndex = (first + la) / 2;
    if (array[midleIndex] == numberToFind)
        System.out.println ( " Number appropreate element is: " + midleIndex );
        else
            if (array[midleIndex] > numberToFind) {
            la = midleIndex - 1;
    }
            else
                first = midleIndex + 1;

/* ищем середину массива, для этого берем длину массива и делим на два
сравниваем элемент с номером "середина минус 1" с заданным числом
если оно больше заданного, то ищем в левой половине массива ( номера элементов от 0 до "середина минус 1"
если меньше
 */
       }
    }
}
