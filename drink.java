public class drink extends snack {
  // An instance variable for the string of flavor
  private String flavor;


  /* Two constructors, one is parameterized and the
  other is non paramtererized, allows user customizability
  and uses super to set superclass variables and data */
  public drink() {
    super();
    this.flavor = "Water";
  }
  public drink(double price, String size, String color, String flavor) {
    super();
    this.flavor = flavor;
  }


  /* Accessor and mutator methods, the accessor must have the data type of the instance variable
  so that you can return the variable data and the mutator must have a void because it doesn't actually
  return any data, just modifies it. These are for the String instance variable of flavor */
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }


  /* A method with a String data type to return the information of an 
  object back which prints out the data of an object */
  public String toString() {
    return super.toString() + "\nFlavor: " + flavor;
  }
}