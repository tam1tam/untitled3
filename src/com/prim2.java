package com;

import java.util.Scanner;

public class prim2 {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {

        Scanner chis = new Scanner(System.in);
        System.out.println("Введите целые 3 числа через ENTER");
        if (chis.hasNextInt()) {
            a = chis.nextInt();
            a = (a < 0) ? -a : a;
        } else {
            System.out.println("Вы ввели не целое число");
        }
        if (chis.hasNextInt()) {
            b = chis.nextInt();
            b = (b < 0) ? -b : b;
        } else {
            System.out.println("Вы ввели не целое число");
        }
        if (chis.hasNextInt()) {
            c = chis.nextInt();
            c = (c < 0) ? -c : c;
        } else {
            System.out.println("Вы ввели не целое число");
        }
        int min = (a < b) && (a < c) ? a : (b < c) ? b : c;
        System.out.println("Минимальное число по модулю:" + "" + min);
    }
}
