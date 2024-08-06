
public class ShopPricePrinter {

    public static void main(String[] args) {

        Shop gadgetShop = new GadgetShop();
        gadgetShop.addProduct(new Product("UltraHD TV", 2500.0));
        gadgetShop.addProduct(new Product("Wireless Earbuds", 125.0));
        gadgetShop.addProduct(new Product("USB-C Cable", 75.0));

        Shop gourmetFoodShop = new GourmetFoodShop();
        gourmetFoodShop.addProduct(new Product("Truffle Oil", 545.0));
        gourmetFoodShop.addProduct(new Product("Organic Honey", 350.0));
        gourmetFoodShop.addProduct(new Product("Artisanal Bread", 15.0));

        Shop fashionBotiqueShop = new FashionBotiqueShop();
        fashionBotiqueShop.addProduct(new Product("Designer Handbag", 4750.0));
        fashionBotiqueShop.addProduct(new Product("Cotton Socks", 50.0));
        fashionBotiqueShop.addProduct(new Product("Silk Scarf", 600.0));

        printShopProductsAndPrices(gadgetShop);
        printShopProductsAndPrices(gourmetFoodShop);
        printShopProductsAndPrices(fashionBotiqueShop);
    }

    public static void printShopProductsAndPrices(Shop shop) {
        System.out.println("All Products:");
        shop.printAllProducts();
        System.out.println("Most Expensive Product:");
        shop.printMostExpensiveProduct();
        System.out.println("Least Expensive Product:");
        shop.printLeastExpensiveProduct();

        System.out.println();
    }
  /*
    TODO:
     - ShopPricePrinter accepts any shop and prints ff:
         - Print all their products
         - Print the most expensive product
         - Print the least expensive product
  */
}
