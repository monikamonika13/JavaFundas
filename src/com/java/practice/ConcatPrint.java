package com.java.practice;

//Simple print of scanner input without error checks
import java.util.Scanner;

public class ConcatPrint {

    private static void concatPrint (String name, int age, String profession) {
        System.out.println("Your name is " + name +
        ", your age is " + age + ", you are a/an " + profession + ".");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your profession: ");
        String profession = sc.nextLine();
        sc.close();
        
        concatPrint(name, age, profession);
    }
}


