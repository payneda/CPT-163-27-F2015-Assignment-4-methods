/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Home pc
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int number;
        int name;
        
        nameIs();
        System.out.println(" Would you like to take a survey\nY to contiune or N to quit.\n");
        answer = keyboard.next();
        //name = answer.length();
        
        //Testing for valid answer.
        if(answer.equalsIgnoreCase("Y")) {
            System.out.println(" Thank you ");
            questionOne();
            questionTwo();
            endingStatement();
            
            
            
        }else{
            if(answer.equalsIgnoreCase("N")) {
                System.out.println("End of program Good Bye.");
            }
        }
            
        
                        
                
      
            
    
    }
    /**
     * This is the start of my program it just ask's the user
     * name.
    */
    public static void nameIs(){
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Please enter you name. ");
        name = keyboard.nextLine();
        //stringSize = name.length();
    }
    /**
     * This part is the first survey question it is a switch statement that asks
     * the user how they like school.
     * 
     */
    public static void questionOne(){
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How do you like school so far on a scale of 1 to 5 ????");
        System.out.println(" 1 It's Great "+" 2 It's Good "+" 3 Okay "+" 4 Not Really "+" 5 Not at all ");
        number = keyboard.nextInt();
        
        switch (number)
        {
            case 1:
                System.out.println("It's Great");
                break;
            case 2:
                System.out.println("It's Good");
                break;
            case 3:
                System.out.println("It's Okay");
                break;
            case 4:
                System.out.println("Not Really");
                break;
            case 5:
                System.out.println("Not at all");
                break;
            default :
                System.out.println(" Not A Valid Answer!!!!. ");
                break;
        }

    }
    /**
     * This part is the first survey question it is a switch statement that asks
     * the user how they like their classes.
     * 
     */ 
    public static void questionTwo(){
        int numberTwo;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How do you like your classes ");
        System.out.println("1 = Very pleased 2 = Neutral 3 = Not happy at all");
        numberTwo = keyboard.nextInt();        
        switch (numberTwo)
        {
            case 1:
                System.out.println("Very pleased");
                break;
            case 2:
                System.out.println("Neutral");
                break;
            case 3:
                System.out.println("Not happy at all");
                break;
            default:
                System.out.println("Still messing with the system ???");
                break;
        
        }
    }
    /**
     * This is suppose to output the answers to the survey.
    */
    public static void endingStatement(){
        System.out.println("Thank you for your time.");
        
        
    }    
                
    
            
        
       
    

 
}

         
    



        
    
