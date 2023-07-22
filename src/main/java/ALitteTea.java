import java.util.Collections;
import java.util.HashMap;

public class ALitteTea {

    HashMap<String, Integer> products = new HashMap<String, Integer>();
    String shopName = "A Litte Tea";

    public ALitteTea(){

            products.put("Black Sugar Milk Tea", 110);
            products.put("Mouse Matcha", 125);
            products.put("Red Bean Milk Tea", 130);
            products.put("Coffee Milk Tea", 145);
    }

    public void getMostExpensiveProduct(){
        String mostExpensiveProduct =   Collections.max(products.keySet());
        int productPrice = Collections.max(products.values());

        System.out.println("The most expensive product of " +shopName+ " is "+ mostExpensiveProduct + " which is " + productPrice + " pesos.");
    }

    public void getCheapestProduct(){
        String cheapestProduct =   Collections.min(products.keySet());
        int productPrice = Collections.min(products.values());

        System.out.println("The cheaepest product of " +shopName+ " is "+ cheapestProduct + " which is " + productPrice + " pesos.");
    }

    public void getAvailableProducts(){

        for(String product: products.keySet()){
            System.out.println(product + ": " + products.get(product));
        }
    }
}