package com.nest.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        int choice;
        String empName;
        ArrayList<String> empList=new ArrayList<String>();

        while(true)
        {
            System.out.println("1.Add employee");
            System.out.println("2.View employee");
            System.out.println("3.Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("1.Add employee");
                    empName=scanner.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0)
                    {
                        System.out.println("no employess added");
                    }
                    else
                    {
                        System.out.println(empList);
                    }
                    System.out.println(empList);
                    break;
                case 3:
                    System.exit(0);
                    break;

            }



        }
    }
}
