package CRT;

import java.util.Scanner;

public class FlipBits {
    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         int updatedNum = flipBits(num);
         int difference = num - updatedNum;
         System.out.println("Difference between given number and updated number: " + difference);
     }

     public static int flipBits(int num) {
         // flip consecutive bits
         return num ^ 0b10101010101010101010101010101010;
     }
 }