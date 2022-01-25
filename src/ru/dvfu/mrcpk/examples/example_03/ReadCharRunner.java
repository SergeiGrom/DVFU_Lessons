package ru.dvfu.mrcpk.examples.example_03;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Kod simvola: " + c + " = " + x);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
