package com.bridgelabz;

public class LineComparison
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1 = 5;
        int x2 = 7;
        int y1 = 8;
        int y2 = 89;
        int m1 = 14;
        int m2 = 19;
        int d1 = 5;
        int d2 = 95;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lengthOfLine2 = Math.sqrt((m2 - m1) * (m2 - m1) + (d2 - d1) * (d2 - d1));

        System.out.println(lengthOfLine1);
        System.out.println(lengthOfLine2);

        if(lengthOfLine1>lengthOfLine2)
            System.out.println("Length of Line1 is greater than Length of Line2");
        else if(lengthOfLine1<lengthOfLine2)
            System.out.println("Length of Line1 is lesser than Length of Line2");
        else
            System.out.println("Both lines are Equal");
        }
    }

