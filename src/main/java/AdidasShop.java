public class AdidasShop {
  int jacketPrice = 1999;
  int shoesPrice = 3999;
  int shortPrice = 649;

  String jacket = "Jacket";
  String shoes = "Shoes";
  String shorts = "Short";

  void adidasItems() {
    System.out.println(jacket + " " + jacketPrice);
    System.out.println(shoes + " " + shoesPrice);
    System.out.println(shorts + " " + shortPrice);
  }

  void adidasExpensiveItem() {
    System.out.println("The most expensive Item in Adidas is " + shoes + " with the price of " + shoesPrice);
  }

  void adidasLeastItem() {
    System.out.println("The Least Expensive Product is " + shorts + " with the Price of " + shortPrice);
  }
}
