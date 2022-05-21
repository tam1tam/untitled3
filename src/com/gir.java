package com;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class gir {
  
    static int b = 1565478321;
    static int a = b;
    //static int a = 1565478321;

    public static int show(int a) throws InterruptedException {
        System.out.println("Раз, два, три...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Integer.toBinaryString(a));
        System.out.println("Представим, что это гирлянда: (1) означает что лампочка горит, (0) - погасла :");
        return a;
    }

    public static int blink(int a) {
        for (int i = 0; i < 10; i++) {
            a = ~a;
            System.out.println(Integer.toBinaryString(a));
        }
        return a;
    }

    public static int isFirstLampOn(int a) {
        a &= 1;
        if (a == 0) {
            System.out.println("не горит");
        } else {
            System.out.println("горит");
        }

        return a;
    }

    public static int run(int a) {
        for (int i = 0; i < 20; i++) {
            a <<= 1;
            System.out.println(Integer.toBinaryString(a));
        }
        return a;
    }

    public static void main(String[] args) throws InterruptedException {
        show(a);
        TimeUnit.SECONDS.sleep(2);


        boolean t;
        while (t=true){
            a=a;
            System.out.println();
            System.out.println();

            welcome();
            Scanner vvod=new Scanner(System.in);
            if (vvod.hasNextInt()){
                int chis= vvod.nextInt();
                switch (chis){
                    case 1:
                        System.out.println(Integer.toBinaryString(a));
                        break;
                    case 2:
                        int o = isFirstLampOn(a);
                        break;
                    case 3:
                        a = blink(a);
                        break;
                    case 4:
                        a = run(a);
                        break;
                    case 5:
                        a=b;
                        System.out.println(Integer.toBinaryString(a));
                        break;
                    default:
                        System.out.println("Вы выполнили неверное действие, повторите");
                        break;
                }

            }else {
                System.out.println("Вы выполнили неверное действие, повторите");
                continue;
            }


        }


    }

    private static void welcome() throws InterruptedException {
        System.out.println("Выберите действие и введите соответствующее число:");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" "+"1. Посмотреть на гирлянду в текущем состоянии");
        System.out.println(" "+"2. Узнать горит ли первая лампа");
        System.out.println(" "+"3. Мигнуть гирляндой");
        System.out.println(" "+"4. Бегущая строка");
        System.out.println(" "+"5. Вернуть в исходное состояние");
    }

}
