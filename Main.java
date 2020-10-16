import java.util.Scanner;

class Main {
 
  public static void main(String[] args) {
    Scanner scores = new Scanner(System.in);
    System.out.println("Enter the score:");


    // Enter the score: The game point system only goes up to 20 
    
    int s = scores.nextInt();
    
    System.out.println(s);
    
    if (s > 1 && s <= 10 ){
     
      System.out.println("Game lost!");
    }
     else if (s >= 11 && s< 20){
     
      System.out.println("Game won!");

    // If you have less than 11 points at the end of the game you lose

    } else {
      
      System.out.println("The score you entered is not applicable");
     
      //For people who try to cheat and put scores that cannot count 
    } 
  }
}