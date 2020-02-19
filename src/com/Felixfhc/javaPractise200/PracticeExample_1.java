package com.Felixfhc.javaPractise200;

import java.util.Scanner;

/**
 * author:Felixfhc
 * date: 2020/2/9 23:23:38
 * description:1.input a number(year)
 *             2.judge whether it is leapyear
 **/
public class PracticeExample_1
    {
    public static void main(String[] args)
        {
          Scanner scan = new Scanner(System.in);
          System.out.println("Please input a number(year)");
          long year = scan.nextLong();
          System.out.println("11111");
          PracticeExample_1.testDebugOne();
          testDebugTwo();
          if (year % 4 ==0 && year % 100 !=0 || year % 400 == 0)
              {
                 System.out.println(year+" is leapyear");
              }
          else
              {
                 System.out.println(year+" is not leapyear");
              }

          System.out.println("2222");
        }

       public static void testDebugOne()
        {

        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");


        }

    public static void testDebugTwo()
        {

        System.out.println("test4");
        System.out.println("test5");
        System.out.println("test6");


        }




    }
