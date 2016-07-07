/*
 *Maryam H
 */
package loopyplanetmh;

import java.util.Scanner; 
import java.lang.*;


public class LoopyPlanetMh {

 
 public static void main(String[] args) {
 

        
        float weightOnEarth;
        int option=0; //variable to store customer selection
        //This line calls the library to store an object of input from user
        Scanner input = new Scanner (System.in) ;
        
              
           
        //Displays planet menu to the user/
        System.out.println("Find Out Your Weight on Other Planets!");
        System.out.println(" Choose a planet ");
        System.out.println("1. Jupiter");
        System.out.println("2. Mars");
        System.out.println("3. Mercury");
        System.out.println("4. Neptune");
        System.out.println("5. Pluto");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Venus");
            
       do{ 
           System.out.print(" Enter the number of the planet: ");
           option= input.nextInt();
           

        //This string is for prompting the user to enter another item
         System.out.print(" Enter your weight on Earth in pounds: ");
        weightOnEarth= input.nextInt(); 
            
            switch (option) {
   
                case 1:
                    System.out.println(" your weight on Jupiter is " + weightOnEarth * 2.45  );
                 break; 
                   
                case 2:
                    System.out.println(" Your weight on Mars is " + weightOnEarth *  0.38 );
                    break;
                case 3:
                    System.out.println(" your weight on Mercury is " + weightOnEarth * 0.37);
                    break;
                case 4:
                    System.out.println(" your weight on Neptune is " + weightOnEarth * 1.12 );
                    break;
                    
                case 5:
                    System.out.println(" your weight on Pluto is " + weightOnEarth * 0.04 );
                    break;
                    
                case 6:
                    System.out.println(" your weight on Saturn is " + weightOnEarth * 1.15 );
                    break;  
                    
                case 7:
                    System.out.println(" your weight on Uranus is " + weightOnEarth * 1.15 );
                    break;
               
                case 8:
                    System.out.println(" your weight on Venus is " + weightOnEarth * 0.88 );
                    break;
                
           
                default:
                    System.out.println(" Please choose a number of the planet between 1 and 8");
                } 
       }   while (option < 1 || option > 8 );          
       
       
        System.out.print("Thank you for your time");
    }   
}





    