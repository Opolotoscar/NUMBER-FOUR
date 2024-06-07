
package com.mycompany.number4;

/**
 *
 * @author NYARUP
 */
 import java.util.Random;
import java.util.Scanner;
public class Number4 {

    public static void main(String[] args) {
        
    
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate two random single-digit integers (0-9)
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        
        // Ensure number1 >= number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // Prompt the student with the subtraction question
        System.out.printf("What is %d - %d? ", number1, number2);
        
        // Create a Scanner object to read the student's answer
        Scanner scanner = new Scanner(System.in);
        int studentAnswer = scanner.nextInt();
        
        // Calculate the correct answer
        int correctAnswer = number1 - number2;
        
        // Check if the student's answer is correct and display a message
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect. The correct answer is %d.%n", correctAnswer);
        }
        
        // Close the scanner
        scanner.close();
    }
}

