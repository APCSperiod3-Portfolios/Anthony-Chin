/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

import java.util.*;
public class PalindromeReplace
{
   public void run(){
       System.out.print('\u000C');
       String original, reverse = "";
           
           Scanner in = new Scanner(System.in);
           
           System.out.println("Enter a statement to check if it is a palindrome");
           original = in.nextLine(); //creates the oppurtunity for user input
           
           original = original.toLowerCase();
           String Cleaner = original.replace(" ", "");//defining cleaner to become the clean part of the code to translate to palindrome
           Cleaner = Cleaner.replaceAll("\\W", "");
           Cleaner = Cleaner.replace(",", "");
           
           int length = Cleaner.length(); //defines the length of the original for the program to compare
           
           
           for (int i = length - 1; i>=0; i--)
           reverse = reverse + Cleaner.charAt(i); //creates reverse order of the statement
           
           if(Cleaner.equals(reverse))//states whether or not it is a palindrome if the original equals or does not equal the result
           System.out.println("The statement is a palindrome.");
           else
           System.out.println("The statement is not a palindrome");
        
       
    }
}