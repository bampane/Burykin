package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

        public static int Min(int a,int b,int c)
        {
            if (a>b && a>c) {
                if (b>c)
                    return c;
                else
                    return b;
            }
            else if (a<b && a<c)
                return a;
            else if (b>c)
                return c;
            else
                return b;
        }
    public static void main(String[] args) {
        System.out.print("Введите 3 целых числа через пробел: ");
        Scanner input = new Scanner(System.in);
        //Проверку на тип вводимых данных не сделал
        System.out.print("Наимееньше из введеных чисел это "+Min(input.nextInt(),input.nextInt(),input.nextInt()));
    }
}

