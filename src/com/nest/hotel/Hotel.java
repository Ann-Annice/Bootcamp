package com.nest.hotel;

import java.util.Scanner;

public class Hotel {
    static int total=0;
    public static void main(String[] args) {
        int y;
        Fooditems fooditems=new Fooditems(10,15,30,30,35);
        Fooditems takeawayfooditems=new Fooditems(10,20,30,30,35);
        Scanner s=new Scanner(System.in);
        while (true)
        {
            System.out.println("enter the choice");
            System.out.println("1.Tea 10$");
            System.out.println("2.juice 30$");
            System.out.println("3.cake 30$");
            System.out.println("4.coffee 15$");
            System.out.println("5.ice cream 35$");
            System.out.println("6.Bill");
            System.out.println("7.exit");
            y=s.nextInt();
            switch (y){
                case 1:
                    System.out.println("howmany quantity:");
                    int m=s.nextInt();
                    total=total+(fooditems.getTea());
                    break;
                case 2:
                    System.out.println("howmany quantity:");
                    int n=s.nextInt();
                    total=(30*n)+total;
                    break;
                case 3:
                    System.out.println("howmany quantity:");
                    int o=s.nextInt();
                    total=(10*o)+total;
                    break;
                case 4:
                    System.out.println("howmany quantity");
                    int l=s.nextInt();
                    total=(15*l)+total;
                    break;
                case 5:
                    System.out.println("how many quantity");
                    int p=s.nextInt();
                    total=(35*p)+total;
                    break;
                case 6:
                    System.out.println("total bill ="+total);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");



            }

        }
    }
}
