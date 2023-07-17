import java.util.HashMap;
public class Shop {
    public static String shopName;
    public static HashMap<String, Integer> prod = new HashMap<String, Integer>();

    public static void setProd(String product, Integer value){
        prod.put(product, value);
    }
    public static void printAllProd(){
        for (String i : prod.keySet()){
            System.out.println(i);
        }
    }

    public static void setShopName(String name){
        shopName = name;
    }

}
