public class ShopPricePrinter {
  public static void main(String[] args) {
    TobysBadmintonShop myShop1 = new TobysBadmintonShop();
    System.out.println("=Tobys Badminton Shop=");
    System.out.println("-" + myShop1.firstItem);
    System.out.println("-" + myShop1.secondItem);
    System.out.println(myShop1.thirdItem + "\n");


    NikeShop myShop2 = new NikeShop();
    System.out.println("=Nike Shop=");
    System.out.println("-" + myShop2.firstItem);
    System.out.println("-" + myShop2.secondItem);
    System.out.println("-" + myShop2.thirdItem + "\n");

    AdidasShop myShop3 = new AdidasShop();
    System.out.println("=Adidas Shop=");
    System.out.println("-" + myShop3.firstItem);
    System.out.println("-" + myShop3.secondItem);
    System.out.println("-" + myShop3.thirdItem);


  }
}
