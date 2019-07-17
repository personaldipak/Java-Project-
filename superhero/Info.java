/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superhero;

import java.util.*; //import all the util libary such as Scanner or List.

public class Info {

    final static int First = 1;
    final static int Next = 2;
    final static int Prev = 3;
    final static int Last = 4;
    final static int Sort = 5; 
    final static int Title = 6; 
    final static int Height = 7;
    final static int Speed = 8; 
    final static int Fightingskill = 9; 

    final static int Back = 0; 
    private static int index;
   
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        HeroData h = new HeroData();
        LinkedList<SuperHero> data = h.addData();
        
        int choice = 0;

        do {
            System.out.println("\n-----------------------------------------"
                    + "\nFirst............"+First
                    + "\nNext............."+Next
                    + "\nPrevious........."+Prev
                    + "\nLast............."+Last
                    + "\n\nSort............."+Sort
                    + "\n\nExit.............0"
                    + "\n-----------------------------------------");

            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();
            
            if (choice >5){
                System.out.println("Erorr Unvalid Option, Please Try again one of those options.");
                //when more than 5 is pressed, user will get an error message. 
            }
       
            processchoice(choice, data);
              
        } while (choice != 0 && choice != 10);
   System.out.println("System will Terminate");  //when "0" is pressed, the programm will exit. 
    }

    private static void processchoice(int c, LinkedList<SuperHero> data) {

        switch (c) {
            case First:
                    System.out.println(
                 "------------------------------------------------------------------------------"+
                   "\nThis is First Element"); 
           System.out.println(data.getFirst());
       
            //Get first data from the list. 
                break;
            case Next:
                index = index + 1;
                if (index >= 29) {
                                     System.out.println(
                 "------------------------------------------------------------------------------"+
                   "\nThis is Last Element"); 
                
                    index = 29;
                }
                System.out.println(data.get(index).toString());

                break;
            case Prev:
                index = index - 1;
                if (index <= 0) {
                    index = 0;
                     System.out.println(
                 "------------------------------------------------------------------------------"+
                   "\nThis is First Element"); 
                } 
                System.out.println(data.get(index).toString());
                break;
                
            case Last:
                                  System.out.println(
                 "------------------------------------------------------------------------------"+
                   "\nThis is last Element"); 
                                  index = 29; 
                 System.out.println(data.get(data.size() -1)); //get last data from the list. 
                break;
             
            case Sort: 
           sortMenu(data);
                break;
        }
    }


    private static void sortMenu(LinkedList<SuperHero> data ){
        
        int choice = - 1;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("\n-----------------------------------------"
                    + "\nTitle.............."+Title
                    + "\nHeight............."+Height
                    + "\nSpeed.............."+Speed
                    + "\nFighting..........."+Fightingskill
                    + "\n\nBack..............."+Back
                    + "\n-----------------------------------------");

            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();
            
        }while (choice > 10);
        
   if (choice == Title){
       data.sort(new TitleComparator());
  //System.out.println(getSortbyTitle(data));
        }
   else if (choice == Height){
       data.sort(new Height());
     //System.out.println(getSortbyHeight(data));
   }
    else if (choice == Speed){
        data.sort(new Speed());
   // System.out.println(getSortbySpeed(data));
   }
    else if (choice == Fightingskill){
        data.sort(new FightingSkillsComparator());
    // System.out.println(getSortByFightingSkills(data));
   }
    else if (choice == Back){
     }    
    } 

  /*    public static LinkedList<SuperHero> getSortbyTitle(LinkedList<SuperHero> data) {
        Collections.sort(data, new TitleComparator());
        return data;
    }
    
       public static LinkedList<SuperHero> getSortbyHeight(LinkedList<SuperHero> data) {
        Collections.sort(data, new HeightComparator()); 
        return data;
    }
       
       public static LinkedList<SuperHero> getSortbySpeed(LinkedList<SuperHero> data) {
        Collections.sort(data, new SpeedComparator());
        return data;
    }
      
      public static LinkedList<SuperHero> getSortByFightingSkills(LinkedList<SuperHero> data) {
        Collections.sort(data, new FightingSkillsComparator());
        return data;
    }*/


} 

