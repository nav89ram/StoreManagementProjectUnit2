public class snack {
  // Three private instance variables declared, information about the sizes
  private double price;
  private String size;
  private String color;
  
  

// No paramter constructor with base values
  public snack() {
    this(2.0,"Small", "brown");
  }

  // Paramterized constructor so the user can make their own choices
  public snack(double price, String size, String color) {
    this.price = price;
    this.size = size;
    this.color = color;
  }
/* Acessor methods with the data type of the isntacne variable
  to return the values */
  public double getPrice() {
    return price;
  }

  public String getSize() {
    return size;
  }
  public String getColor() {
    return color;
  }



  /* Mutator method with void data type
  since they don't return anything */
  public void setPrice(double i) {
    this.price = i;
  }
  public void setSize(String e) {
    this.size = e;
  }
  public void setColor(String k) {
    this.color = color;
  }


  // Prints the object with the toString method using the data type of String to return a statement
  public String toString() {
    return "Price: " + price +"\nSize: " + size + "\nColor: " + color;
  }
}