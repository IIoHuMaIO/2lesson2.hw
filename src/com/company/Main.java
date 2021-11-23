package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cat").print();
        createObject("Dog").print();
        createObject("Parrot").print();
    }

    public static Printable createObject (String className){

        Printable printable = null;
        switch (className){
            case "Cat":
                printable  = new Cat("TRex",10);
                break;
            case "Dog":
                printable = new Dog("Justin", 150);
                break;
            case "Parrot":
                printable = new Parrot("Rat", "Rafhat is the Best!");
                break;

        }
        return printable;
    }
    }
