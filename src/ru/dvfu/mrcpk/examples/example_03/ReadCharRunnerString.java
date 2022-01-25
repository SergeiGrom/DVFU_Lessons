package ru.dvfu.mrcpk.examples.example_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharRunnerString {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        try {
            System.out.println("Enter Your name and press <Enter>:");
            String name = bis.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.err.print("error " + e);

        }
    }
}
