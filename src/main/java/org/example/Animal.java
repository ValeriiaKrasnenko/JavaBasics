package org.example;

public class Animal {

    private int age;
    private double weight;
    private String color;
    private Enum size;
    private String name;
    private boolean isMammal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(int age, double weight, String color, Enum size, String name) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.name = name;
    }

    public Animal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';

        public void speak () {
            if (energy <= 0) {
                System.out.println("I am speaking with you");
                getEnergy();
            } else {
                System.out.println("I am speakin with you");
            }
            energy--;

    }

    public void feed(String foodName){
            if(energy == MAX_ENERGY) {
                System.out.println("I am full! Lets go speak!");
            } else {
            System.out.println("I am eating:" + foodName);}
            energy++;
        }

        public Animal(int age, String name){
            this.age = age;
            this.name = name;

        }
}