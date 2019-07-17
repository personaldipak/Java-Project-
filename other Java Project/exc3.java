/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;


import java.util.Scanner;
/**
 *
 * @author dm1103
 */
public class exc3 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int computer, user;
     
    System.out.print("Scissor (0), Rock (1), Paper (2): ");
    user = input.nextInt(); 
    computer = (int)(Math.random() * 3);


     if (computer == 0) {
         System.out.print("The computer is Scissor.");
     }
     else if (computer == 1) {
         System.out.println("The computer is Rock.");
     }
     else if (computer == 2) {
         System.out.println("The computer is Paper.");
     }
    
    if ((user == 2) && (computer == 0)||(user == 0) && (computer == 2)) {
        if (user == 0) {
           System.out.println("You are Scissor. You Won");  
        }
        else if (user == 1) {
           System.out.println("you are Rock. You Won");
        }
        else if (user == 2) {
           System.out.println("you are Paper. You Won");
        }

        if(user == computer) {
           System.out.println("You are Scissor. It is a Draw");
        }
        else if (user == 1) {
            System.out.println("You are Rock. It is a Draw");
        }
        else if (user == 2) {
            System.out.println("You are Paper. It is a Draw"); 
        }
      }
    }
  }

