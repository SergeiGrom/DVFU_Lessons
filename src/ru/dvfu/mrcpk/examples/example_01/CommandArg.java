package ru.dvfu.mrcpk.examples.example_01;

public class CommandArg {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + "=" + args[i]);

        }
    }
}
