package ru.dvfu.mrcpk.examples.example_05;

public class IntegerPack {
    public static void main(String[] args) {

    //Integer i = new Integer(10);
        Integer  i= Integer.valueOf(10);
        System.out.println("In main - Before call function: i=" + i);
        changeInteger(i);
        System.out.println("In main - After call function: i=" + i);
    }

    public static void changeInteger(Integer x) {
        System.out.println("In changeInteger - Before call function: x=" + x);
        x = Integer.valueOf(20);
        System.out.println("In changeInteger - After call function: x=" + x);
    }
}
