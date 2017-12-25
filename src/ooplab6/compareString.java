package ooplab6;

public class compareString {
    public static void main(String[] args) {
//        compare String
        String m="Hello GG";
        String n="Hello";
//        type1(==)
        if (m==n)System.out.println("Yes.");
        else  System.out.println("no.");
//        type2(equal())
        if (m.equals(n)) System.out.println("yes.");
        else  System.out.println("no.");
//        type3(conpareTo())
        if (m.compareTo(n)==0) System.out.println("yes.");
        else if (m.compareTo(n)>=1)
            System.out.println("no. +");
        else System.out.println("no. -");

    }//main
}//class
