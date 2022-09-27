package com.nest.hotel;

import java.util.Scanner;

public class Bill {
    static int total=0;
    public static void main(String[] args) {
        int x,y;
        Fooditems fooditems = new Fooditems(10, 15, 30, 30, 35);
        Fooditems takeawayfooditems = new Fooditems(10, 20, 30, 30, 35);
        Scanner s = new Scanner(System.in);
       outer: while(true)
        {
            System.out.println("1.Dinning");
            System.out.println("2.Takeaway");
            System.out.println("3.exit");
            x=s.nextInt();
            switch (x)
            {
                case 1:
                    while(true) {

                        System.out.println("enter the choice");
                        System.out.println("1.Tea 10$");
                        System.out.println("2.juice 30$");
                        System.out.println("3.cake 30$");
                        System.out.println("4.coffee 15$");
                        System.out.println("5.ice cream 35$");
                        System.out.println("6.Bill");
                        System.out.println("7.exit");

                        y = s.nextInt();
                        switch (y) {

                            case 1:
                                System.out.println("howmany quantity:");
                                int m = s.nextInt();
                                total = total + (fooditems.getTea() * m);
                                break;
                            case 2:
                                System.out.println("howmany quantity:");
                                int n = s.nextInt();
                                total = total + (fooditems.getJuice() * n);
                                break;
                            case 3:
                                System.out.println("howmany quantity:");
                                int o = s.nextInt();
                                total = total + (fooditems.getCake() * o);
                                break;
                            case 4:
                                System.out.println("howmany quantity");
                                int l = s.nextInt();
                                total = total + (fooditems.getCoffee() * l);
                                break;
                            case 5:
                                System.out.println("how many quantity");
                                int p = s.nextInt();
                                total = total + (fooditems.getIcecream() * p);
                                break;
                            case 6:
                                System.out.println("total bill =" + total);
                                break;
                            case 7:
                                continue outer;
                            default:
                                System.out.println("invalid input");

                        }
                    }


                case 2:
                    while(true) {

                        System.out.println("enter the choice");
                        System.out.println("1.Tea 10$");
                        System.out.println("2.juice 30$");
                        System.out.println("3.cake 30$");
                        System.out.println("4.coffee 15$");
                        System.out.println("5.ice cream 35$");
                        System.out.println("6.Bill");
                        System.out.println("7.exit");

                        y = s.nextInt();
                        switch (y) {

                            case 1:
                                System.out.println("howmany quantity:");
                                int m = s.nextInt();
                                total = total + (takeawayfooditems.getTea() * m);
                                break;
                            case 2:
                                System.out.println("howmany quantity:");
                                int n = s.nextInt();
                                total = total + (takeawayfooditems.getJuice() * n);
                                break;
                            case 3:
                                System.out.println("howmany quantity:");
                                int o = s.nextInt();
                                total = total + (takeawayfooditems.getCake() * o);
                                break;
                            case 4:
                                System.out.println("howmany quantity");
                                int l = s.nextInt();
                                total = total + (takeawayfooditems.getCoffee() * l);
                                break;
                            case 5:
                                System.out.println("how many quantity");
                                int p = s.nextInt();
                                total = total + (takeawayfooditems.getIcecream() * p);
                                break;
                            case 6:
                                System.out.println("total bill =" + total);
                                break;
                            case 7:
                                continue outer;
                            default:
                                System.out.println("invalid input");
                        }
                    }
                case 3:
                    System.exit(0);





            }
        }
    }
}
