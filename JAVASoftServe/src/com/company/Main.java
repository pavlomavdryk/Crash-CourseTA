package com.company;
import java.util.Scanner;

public class Main
{
     private static String message(boolean b)
    {
        return "а) " + (b ? "Так," : "Ні,") + "3 " + (b ? "" : "не ") + "входить у оновлене число n.";
    }

    public static void main(String[] args)
    {
        //для того,щоб вводити дані з клавіатури
        Scanner sc = new Scanner(System.in);

        System.out.println("Привіт!");
        System.out.println("Задача №88: ");
        System.out.println("а) Вияснити,чи входить цифра 3 в запис числа n^2");
        System.out.println("б) Змінити порядок чисел n на обернений");
        System.out.println("в) Переставити першу і останню цифри числа n");
        System.out.println("г) Вписати по одиниці на початку і в кінці запису числа n");
        System.out.println();

        System.out.println("Введіть натуральне число n:");
        int d = 2;
        int number = sc.nextInt();

        //підносимо число з клавіатури до квадрату
        String powNumber = String.valueOf((int) Math.pow(number, d));
        System.out.println("Число n в другій степені: " + powNumber);

        //шукаємо цифру 3 в числі n
        char[] array = powNumber.toCharArray();
        char searchThree = '3';
        boolean isFound = false;
        for (int i = 0; i < array.length; ++i)
        {
            if (array[i] == searchThree)
            {
                isFound = true;
                break;
            }
        }
        System.out.println(message(isFound));
        System.out.println();

        //змінюємо порядок числа на обернений
        int number1 = number;
        number1 = Integer.parseInt(new StringBuffer(String.valueOf(number)).reverse().toString());
        System.out.println("б) Змінено порядок числа n на обернений: " + number1);
        System.out.println();

        //переставляємо першу і останню цифри числа n
        int number2 = number;
        String text = String.valueOf(number);
        text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.substring(0, 1);
        number2 = Integer.parseInt(text);
        System.out.println("в) Переставлено першу і останню цифру числа n: " + number2);
        System.out.println();

        //вписуємо по одиниці на початку і в кінці
        String odunuca = "1";
        int number3 = number;
        String od_number3 = "1" + number + "1";
        System.out.println("г) Вписати по одиниці на початку і в кінці запису числа n: " + od_number3);
        System.out.println();

        System.out.println("Готово!");
        System.out.println();

        System.out.println("Задача №56: ");
        System.out.println("Дано дійсні числа а, b, с, х, у.");
        System.out.println("З'ясувати, чи пройде цеглина з ребрами а, b, с в прямокутний");
        System.out.println("отвір зі сторонами х і у. Просовувати цеглу в отвір");
        System.out.println("дозволяється тільки так, щоб кожне з його ребер було паралельно");
        System.out.println("або перпендикулярно до кожної зі сторін отвору.");
        System.out.println();

        System.out.println("Введіть розміри цегли");
        System.out.println("Введіть a: ");
        int a = sc.nextInt();
        System.out.println("Введіть b: ");
        int b = sc.nextInt();
        System.out.println("Введіть c: ");
        int c = sc.nextInt();
        System.out.println("Введіть розміри отвору");
        System.out.println("Введіть x: ");
        int x = sc.nextInt();
        System.out.println("Введіть y: ");
        int y = sc.nextInt();

        //порівнюємо розміра цегли з розмірами отвору
        if((a<=x) && (b<=y) || (b<=x) && (a<=y) || (a<=x) && (c<=y) || (c<=x) && (a<=y) || (c<=x) && (b<=y) || (b<=x) && (c<=y))
        {
            System.out.println("Цегла пройде в отвір");
        }
        else
        {
            System.out.println("Цегла не пройде в отвір");
        }
    }
}