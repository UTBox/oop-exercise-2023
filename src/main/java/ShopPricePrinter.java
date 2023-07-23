public class ShopPricePrinter {
  public static void main(String[] args) {

    PriceItem priceItem = new PriceItem(2500);


    TobysBadmintonShop tobysBadmintonShop = new TobysBadmintonShop();
    System.out.println("=Tobys Badminton Shop=");
    tobysBadmintonShop.tobysBadmintonItem();
    System.out.println("Badminton Racquet Price  " + priceItem.getBadmintonRacquetPrice());
    tobysBadmintonShop.tobysBadmintonShopExpensive();
    tobysBadmintonShop.tobysBadmintonLeastItem();

    NikeShop nikeShop = new NikeShop();
    System.out.println("\n =Nike Shop=");
    nikeShop.nikeShopItems();
    nikeShop.nikeExpensiveItem();
    nikeShop.nikeLeastItem();

    AdidasShop adidasShop = new AdidasShop();
    System.out.println("\n =Adidas Shop=");
    adidasShop.adidasItems();
    adidasShop.adidasExpensiveItem();
    adidasShop.adidasLeastItem();

  }
}
