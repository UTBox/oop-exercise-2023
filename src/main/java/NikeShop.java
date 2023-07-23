public class NikeShop {

  int shoesPrice = 5000;
  int tshirtPrice = 999;
  int capPrice = 799;


  String shoes = "Shoes";
  String tShirt = "Tshirt";
  String cap = "Cap";

  void nikeShopItems() {
    System.out.println(shoes + " " + shoesPrice);
    System.out.println(tShirt + " " + tshirtPrice);
    System.out.println(cap + " " + capPrice);
  }

  void nikeExpensiveItem() {
    System.out.println("The most Expensive item in Nike is " + shoes + " with the price of " + shoesPrice);
  }

  void nikeLeastItem() {
    System.out.println("The Least Expensive item in  Nike is " + cap + " with the price of " + capPrice);

  }


}
