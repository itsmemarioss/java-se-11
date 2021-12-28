package br.com.itsmemario.javase11.programflow;

public class SwitchStatements {

    public static void main(String[] args) {

        byte number = 2; //from -128 to 127

        switch (number) { //switch variable byte, char, short, int, (wrappers), String and enums
            default: //at most one default label
                System.out.println("default");
            case 127:
                System.out.println(127);
            case 5 + 2: //compile time constants
                System.out.println("5 + 2");
                break; //avoid fall-through
        }

    }
}
