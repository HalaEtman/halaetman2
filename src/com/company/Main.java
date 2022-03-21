package com.company;

public class Main {

    public static void main(String[] args) {
        //getting a random number
        int vary = (int) (Math.random() * (100-1));

        //make sure if the number is even or odd using moduls
        if (vary % 2 == 0)
        {
            System.out.println("the random number " + vary + " is even\n");
        }
        else {System.out.println("the random number " + vary + " is odd\n");}
    }
}
