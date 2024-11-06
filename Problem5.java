/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem5;



import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        System.out.println("Before swap, x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap, x = " + x + ", y = " + y);

        scanner.close();
    }
}

