package org.example;

public class Main {
    public static void main(String[] args) {
        //One-line comment

        /*
        this is
        multi-line comment
         */

        // Primitive data types

        //double floating numbers
        double pi = 3.14;
        System.out.println(pi);

        //float - floating number
        float weight = 70.34f;
        System.out.println (weight);

        //int (integer)
        int populationofLatvia = 1700000;
        System.out.println(populationofLatvia);

        //char
        char myFirstNameChar = `V`;
        System.out.println(myFirstNameChar);

        //byte
        byte age = 28;
        System.out.println(age);

        //boolean is , has
        boolean isSummer = true;
        System.out.println(isSummer);

        boolean isWinter = false;
        System.out.println(isWinter);

        //String
        String name = "Valeriia";
        String surname = "Krasnenko";
        System.out.println(name + " " + surname);
        System.out.printf("% %s", name, surname);
        System.out.println("% %s\n", name, surname);

        System.out.println(String.format(""));

        //Operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d / e;
        System.out.println(f);
        // 10 + 5 - 9.61
        System.out.println(a + b - e);

        int x = 10;
        int y = 10 % 4;
        System.out.println(y);







    }

}