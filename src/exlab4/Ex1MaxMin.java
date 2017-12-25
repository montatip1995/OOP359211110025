package exlab4;

import java.util.Scanner;

public class Ex1MaxMin {
    public static void main(String[] args) {
        int num1,num2,num3,max,min;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number1 : ");num1=kb.nextInt();
        System.out.println("Enter number2 : ");num2=kb.nextInt();
        System.out.println("Enter number3 : ");num3=kb.nextInt();
        max=findMax(num1,num2,num3);
        System.out.println("The FindMax is : "+max);
        min=findMin(num1,num2,num3);
        System.out.println("The FindMin is : "+min);
    }//main
        public static int findMax(int a, int b,int c) {
        if (a>b)
            if (a>c)
                return a;
            else
                return c;
        else
            if (b>c)
                return b;
            else
                return c;
        }//Max
    public static int findMin(int a, int b,int c) {
        if (a<b)
            if (a<c)
                return a;
            else
                return c;
        else
        if (b<c)
            return b;
        else
            return c;
    }//Max
}//class
