package com.demo;

public class DemoApp {

    public static void main(String[] args) {
        
        // 1. Print stars vertically
        System.out.println("Vertical Stars:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(" * ");
        }
        System.out.println();
        
        

        // 2. Print stars horizontally
        System.out.println("Horizontal Stars:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" * ");
        }
        System.out.println("\n");
        
        

        // 3. Print solid box of stars
        System.out.println("Box:");
        for (int r= 1; r<= 5; r++) {
            for (int c= 1; c<= 5; c++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        
        

        // 4. Print hollow box
        System.out.println("Hollow Box:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        
        for (int j = 1; j <= 3; j++) {
            System.out.print(" * ");      
            for (int i = 1; i <= 3; i++) {
                System.out.print("   ");  
            }
            System.out.print(" * ");      
            System.out.println();
        }

        
        for (int i = 1; i <= 5; i++) {
            System.out.print(" * ");
        }
    }
}
