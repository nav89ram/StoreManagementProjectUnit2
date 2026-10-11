import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /* Example snacks to be printed to be displayed. 
       For the "shop" this is sort of like a menu */
    snack mango = new snack();
    snack strawberries = new snack(6.0,"Medium","Red");
    chips lays = new chips(2.0,"Small","Beige",false);
    drink coke = new drink(3.9, "Small", "Red", "Cherry");

    /* Introduces the shop and the items sold
      Uses \n to go to a new line just to make it visually appealing */
    System.out.println("Hello, welcome to the Navneet Snack Store! \n Here are some types of products we sell... ");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(mango);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(strawberries);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(lays);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(coke);
    System.out.println("\n");


    /* Here the scanner object is then used so we can get user input
      to create a snack */
    System.out.println("Create your own snack, Enter the price you would want to spend: ");
    double p = input.nextDouble();
    /* I implmented a next line here because before
    it ignored the size and returned a null string for size, so it asks for user input */
    input.nextLine();
    System.out.println("Now the size of the snack: ");
    String s = input.nextLine();
    System.out.println("What color snack would you want: ");
    String c = input.next();
    snack user = new snack(p,s,c);
    System.out.println("Here is your snack! \n" + user);

    





    // Closes the Scanner object
    input.close();
    
  }
}