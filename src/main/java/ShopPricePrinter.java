import product.IProduct;
import shop.IShop;
import shopCommand.GetAllProducts;
import shopCommand.GetLeastExpensiveProduct;
import shopCommand.GetMostExpensiveProduct;

import java.util.List;

public class ShopPricePrinter {
  /*
    TODO:
     - ShopPricePrinter accepts any shop and prints ff:
         - Print all their products
         - Print the most expensive product
         - Print the least expensive product
  */

    public void print(IShop shop){

        GetAllProducts getAllProducts = new GetAllProducts();
        GetMostExpensiveProduct getMostExpensiveProduct = new GetMostExpensiveProduct();
        GetLeastExpensiveProduct getLeastExpensiveProduct = new GetLeastExpensiveProduct();

        System.out.println("\nShop: " + shop.getName());

        printProductList(getAllProducts.get(shop));

        System.out.println("\nMost expensive product");
        printProductList(getMostExpensiveProduct.get(shop));

        System.out.println("\nLeast expensive product");
        printProductList(getLeastExpensiveProduct.get(shop));
    }

    private void printProductList(List<IProduct> products){
        for(IProduct product : products){
            System.out.printf("%s \t ₱%.2f \n", product.getName(), product.getPrice());
        }
    }
}
