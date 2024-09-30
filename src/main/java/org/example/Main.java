package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 1233155;
        int sumOfDigits = 0;
        while (true){
            sumOfDigits = sumOfDigits + (number%10);
            number = number/10;
            if (number<1){
                break;
            }
        }

        System.out.println("sum of digits of number is : "+sumOfDigits);

        area(120, 541);

    }

    public static void area(int n1,int n2){
        System.out.println("number 1 is " + n1 + "and number 2 is : "+ n2);
    }

    public static void area(int n3){
        System.out.println("number 3 is : "+n3);
    }

}