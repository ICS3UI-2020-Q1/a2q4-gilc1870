import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Get info and calculate
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the amount the customer spent");
    double spent = input.nextDouble();

    if (spent > 120){
      System.out.println("They will receive 40% off " + "they will save $" + spent*.4 + " The new total is $" + (spent-spent*0.4));
      } else if ( spent >= 80.01){
      System.out.println("They will receive 30% off " + "they will save $" + spent*.3 + " The new total is $" + (spent-spent*0.3));
      } else if ( spent >= 40.01){
      System.out.println("They will receive 20% off " + "they will save $" + spent*.2 + " The new total is $" + (spent-spent*0.2));
      } else if ( spent <= 40){
      System.out.println("They will receive 10% off " + "they will save $" + spent*.1 + " The new total is $" + (spent-spent*0.1));
      }
  }
}
