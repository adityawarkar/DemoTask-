package com.demo;


class Robot {
    String OS;
    int price;
    String processor;

    public void moving() {
        System.out.println("The robot is moving...");
    }

    public void fighting() {
        System.out.println("The robot is fighting...");
    }

    public void displayInfo() {
        System.out.println("Robot Details:");
        System.out.println("OS        : " + OS);
        System.out.println("Price     : " + price);
        System.out.println("Processor : " + processor);
    }
}

class StarIndustry {
}

public class StudentApp {
    public static void main(String[] args) {
        
        Robot r1 = new Robot();
        r1.OS = "Mediatek";
        r1.price = 15000;
        r1.processor = "Snapdragon";

        r1.displayInfo();
        r1.moving();
        r1.fighting();
    }
}
