package org.example;

public class ObjectExample {

    public static void main(String[] args) {
        Animal barsik =  new Animal();

        Animal barsik = new Animal();
        String catName = barsik.getName();

        // name = null;
        System.out.println(catName);
        System.out.println(barsik);


        // name = Barsikfzftw
        barsik.setName("Barsikzftw");
        System.out.println(barsik);

        // age = 5;
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is: " + barsik.getAge() + " years old.");

        // Create getter and setter for weight, color, size;
        // Set data using setters;

        barsik.setWeight(17.60);
        barsik.setColor("gray");
        barsik.setSize(XL);

        System.out.println(barsik);


        Animal ballzik = new Animal(13, "Ballzik");
        // My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d old.\n", ballzik.getName(), ballzik.getAge());
        System.out.println("My name is " + ballzik.getName() + ". I am " + ballzik.getAge() + " years old.");

        Animal zhorik = new Animal (age: 5, weight: 6.54, color: "pure - yellow, XXL, name "Zhorik Vartanoff", isMammal: true );
                System.out.println(zhorik);
        zhorik.feed(foodname: "bulka");

        zhorik.speak();
        zhorik.speak();
        zhorik.speak();
        zhorik.speak();


    }
    }
}

