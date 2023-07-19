

public class ShopPricePrinter {

  public static void main(String[] args) {

    ALitteTea aLitteTea = new ALitteTea();

    System.out.println("~Available products from "+ aLitteTea.shopName + "~");
    aLitteTea.getAvailableProducts();
    aLitteTea.getMostExpensiveProduct();
    aLitteTea.getCheapestProduct();

    System.out.println();

    MacauImperial macauImperial = new MacauImperial();

    System.out.println("~Available products from "+ macauImperial.shopName + "~");
    macauImperial.getAvailableProducts();
    macauImperial.getMostExpensiveProduct();
    macauImperial.getCheapestProduct();

    System.out.println();

    GongCha gongCha = new GongCha();

    System.out.println("~Available products from "+ gongCha.shopName + "~");
    gongCha.getAvailableProducts();
    gongCha.getMostExpensiveProduct();
    gongCha.getCheapestProduct();

  }
}
