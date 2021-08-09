package com.bridgelabz;
import java.util.Scanner;
public class LineComparison
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates  for x-axis of First Line: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Enter the co-ordinates for y-axis of First Line: ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter the co-ordinates  for x-axis of second Line: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        System.out.println("Enter the co-ordinates for y-axis of second Line: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        LineComparison Compare = new LineComparison();
        double lengthOfLine1 = Compare.findLength(x1, x2, y1, y2);
        System.out.println("The lenth of First Line is :" + lengthOfLine1);
        double lengthOfLine2 = Compare.findLength(m1, m2, d1, d2);
        System.out.println("The lenth second Line is :" + lengthOfLine2);
        Compare.checkEquality(lengthOfLine1, lengthOfLine2);

    }
    public double findLength(int x1, int x2, int y1, int y2) {
        double lengthofline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lengthofline;
    }
    public void checkEquality(double Line1, double Line2) {
        if (Line1 > Line2)
            System.out.println("Length of Line 1 is greater than the Length of Line 2");
        else if (Line1 < Line2)
            System.out.println("Length of Line 1 is lesser than the Length of Line 2");
        else
            System.out.println("Both the lines have equal length");
    }

}
