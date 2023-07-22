import java.util.Collections;
import java.util.HashMap;

public class GongCha {

    HashMap<String, Integer> products = new HashMap<String, Integer>();
    String shopName = "GongCha";

    public GongCha(){

        products.put("Cheescake and Pearl Milk Tea", 140);
        products.put("Chestnut Cream Tea", 125);
        products.put("Cream Cheese Uji Matcha", 135);
        products.put("Blark Pearl Milk Tea", 110);
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