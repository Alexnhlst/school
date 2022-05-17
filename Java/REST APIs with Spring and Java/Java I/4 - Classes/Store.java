public class Store {
  // Instance field
  String productType;
  int inventoryCount;
  double inventoryPrice;
  double price;

  // Constructor
  // String parameter
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // Constructor 2
  public Store(String product) {
    productType = product;
  }

  // Constructor 3
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // Methods
  public void advertise() {
    System.out.printf("Selling %s!\n", productType);
    System.out.println("Come spend some money!");
  }

  public void greetCustomer(String customer) {
    System.out.printf("Welcome to the store, %s!\n", customer);
  }

  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // return
  public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // toString method
  public String toString() {
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  public static void main(String[] args) {
    // Instance of Store
    // Store lemonadeStand = new Store("lemonade");
    // How the instance is represented
    // System.out.println(lemonadeStand.productType);
    Store cookieShop = new Store("cookies", 12, 3.75);
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.advertise();
    cookieShop.advertise();
    lemonadeStand.greetCustomer("Krisnu");
    Store lemonadeStand2 = new Store("Lemonade", 3.75);
    lemonadeStand2.increasePrice(1.5);
    System.out.println(lemonadeStand2.price);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}