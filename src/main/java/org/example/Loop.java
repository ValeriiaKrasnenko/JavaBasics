package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loop {


    public static void main(String[] args) {
        //for; foreach; do while; while;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
        String[] fruits = {"apple", "banana", "kiwi", "pear"};
        //fruits[0] = apple;
        //fruits[1] = banana;
        //...
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("kiwi")) {
                System.out.println("found it");
                break;
            }
        }

// enhanced for
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);

        }

        for (int i = 20; i <= 40; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
            System.out.println("Sum of even numbers: " + sum);
        }
        //6;

        int number = 6;
        for (int i = 0; i <= 10; i++) {
            System.out.print(i * number + " ");
        }

        // WHILE LOOP
        int i = 10;
        while (i > 0) {
            System.out.println("Hello world!");
            i--;
        }
        int j = 0;
        while (j < 10) {
            System.out.println("Hello World");
            j++;
        }

        //DO WHILE
        int k = 0;
        do {
            System.out.println("Hello World");
            k++;
        } while (k < 10);

        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);


        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Try again!");
            }

        }

        // TODO: Limit guess with 3 times;


        Stream.of(fruits).filter(s -> s.equals("kiwi")).forEach(System.out::println);

        String name = "Nikita";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed = reversed + name.charAt(l);

        }
        System.out.println(reversed);
    }
}
