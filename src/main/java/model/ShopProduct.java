package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShopProduct implements ProductInterface {
    private String productName;
    private BigDecimal productPrice;

    public ShopProduct(String productName, BigDecimal productPrice) {
        this.productName = productName;
        this.productPrice = productPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }
}
