package ooplab5;

import java.util.ArrayList;
import java.util.Arrays;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
//        add method
        myList.add("TAN");
        System.out.println(myList);
        myList.add("PLE");
        myList.add("JON");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
       //การเปลี่ยนแปลงข้อมูล
       myList.set(0,"Montatip");
       System.out.println(myList);
       //การลบข้อมูล
       myList.remove("Hello");
        System.out.println(myList);
        //ยากรฅู้ว่าอยู่ตำแหน่งใด
        System.out.println(myList.indexOf(100));

    }//main
}//class
