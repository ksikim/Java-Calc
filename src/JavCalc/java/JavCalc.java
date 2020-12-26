/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavCalc.java;

import java.util.Scanner; //java scanner taking user input and storing in memory

/**
 *
 * @author kseniyakim
 */
public class JavCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0; //first input number
        int num2=0; //second input number
        char operator; //type of operator user would like to use
        double answer = 0.0; // outputting the answer
        
        Scanner scanObj = new Scanner (System.in); /*creating a new scanner to
        store answers in*/
        
        System.out.println("Please enter your first number: "); // asks user for first number
        num1 = scanObj.nextInt(); //stores the first number
        System.out.println("Please enter your second number: "); // asks user for second number
        num2 = scanObj.nextInt(); //stores the second number
        System.out.println("Which operation would you like? (+ / - * )"); //asks user what type of operator they would like to use
        operator = scanObj.next().charAt(0); // stores the operater(?)
        
        switch (operator) { // function to calculate based on operator chosen
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1/num2;
                break;
        }
        
        System.out.println(num1+ " "+operator+" "+num2+" = "+answer); //outputs answer
    }
    
}
