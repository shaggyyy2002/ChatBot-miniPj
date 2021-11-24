package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        welcome();
        System.out.println("What would You Like to Do??");
        System.out.println("a. calculator " + " " + " b. convertor " + " " + " c. Quiz " + " " + "d. Flashcard" + " " + "e. Tic-Tac-Toe");

        String operation = sc.next();
        X01 tictactoe = new X01();

        switch (operation) {
            case "calculator":
                System.out.println(calculator());
                break;
        }
        switch (operation) {
            case "convertor":
                System.out.println(convertor());
                break;
        }
        switch (operation) {
            case "Quiz":
                Quiz();
                break;
        }
        switch (operation) {
            case "Tic-Tac-Toe":
                tictactoe.X0();
                break;
            default:

        }
    }


    static String welcome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Nickname: ");
        String name = sc.next();
        System.out.println("Welcome" + " " + name);

        System.out.print("Would you like to Enter the Game [Yes(Y)/no(N)]: ");
        char Enter = sc.next().charAt(0);
        if (Enter == 'Y') {
            System.out.println("Welcome to The Game!!");
        } else {
            System.out.println("Sorry, Once Started You cant back off!!");
        }
        return name;
    }


    static double calculator() {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter Operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print(" Enter Two Numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
        return ans;
    }


    static public float convertor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount in rupees to convert:");
        int Rup = sc.nextInt();
        float doll = (Rup / 73.70f);
        System.out.print(" Your amount in dollars : ");
        return doll;
    }


    static public String Quiz() {
        Scanner input = new Scanner(System.in);

        System.out.println("We are going to play a game.");
        System.out.println("I am going to ask you questions.");
        System.out.println("Please answer with the option");
        System.out.println("Let's see how you do!");
        System.out.println("Okay, are you ready?");

        String text = input.nextLine();

        switch (text) {
            case "Yes":
                System.out.println("Alright, let's begin!");
                break;
            case "No":
                System.out.println("Okay, maybe another time");
                break;
        }

        System.out.println("How many legs does a spider have?");

        System.out.println("A: 8");
        System.out.println("B: 7");
        System.out.println("C: 9");
        System.out.println("D: 6");

        int question1 = input.nextInt();

        String response = "A: 8";
        if (question1 == 8) {
            System.out.println("That is correct!");
        } else {
            System.out.println("That is Incorrect");
        }

        System.out.println(" How many colors are in a rainbow?");

        System.out.println("A:8");
        System.out.println("B:9");
        System.out.println("C:6");
        System.out.println("D:7");

        int question2 = input.nextInt();

        String response2 = "D: 7";
        if (question2 == 7) {
            System.out.println("That is correct!");
        } else {
            System.out.println("That is Incorrect");
        }

        System.out.println(" How many years are there in Year?");

        System.out.println("A: 355");
        System.out.println("B: 366");
        System.out.println("C: 345");
        System.out.println("D: 365");

        int question3 = input.nextInt();

        String response3 = "D: 365";
        if (question3 == 365) {
            System.out.println("That is correct!");
        } else {
            System.out.println("That is Incorrect");
        }

        System.out.println("How many sides are there in a triangle? ");

        System.out.println("A: 3");
        System.out.println("B: 4");
        System.out.println("C: 5");
        System.out.println("D: 6");

        int question4 = input.nextInt();

        String response4 = " A : 3";
        if (question4 == 3) {
            System.out.println("That is correct!");
        } else {
            System.out.println("That is Incorrect");
        }
        String n = "Thank-You For Playing. See You Soon!!";
        return n;


    }

}










