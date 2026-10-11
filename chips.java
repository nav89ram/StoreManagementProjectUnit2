public class chips extends snack {
  // A subclass instance variable
  private boolean isFull;


  /* A no paramterized constructor which sets a 
  default value of the shop item */
  public chips() {
    super();
    this.isFull = false;
  }
  // A parameterized constructor with a super to set values from the superclass variables
  public chips(double price, String size, String color, boolean full) {
    super();
    this.isFull = full;
  }

  // A accessor method for the private instance variable of isFull

  public boolean getFull() {
    return isFull;
  }


  // A mutator method to change the value of the isFull variable
  public void setFull(boolean isFull) {
    this.isFull = isFull;
  }

  /* A method toString to basically allow 
  the details about the object to be instantiated*/
  
  public String toString() {
    return super.toString() + "\nFull: " + isFull;
  }
}