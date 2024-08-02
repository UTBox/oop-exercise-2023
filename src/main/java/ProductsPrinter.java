import product.IProduct;

import java.util.List;

public class ProductsPrinter {
    public void print(List<IProduct> products){
        for(IProduct product : products){
            System.out.printf("%s \t ₱%.2f \n", product.getName(), product.getPrice());
        }
    }
}
