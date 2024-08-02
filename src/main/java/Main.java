import product.Appliance;
import product.Food;
import product.Helmet;
import shop.ApplianceCenter;
import shop.HelmetShop;
import shop.Restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopPricePrinter shopPricePrinter = new ShopPricePrinter();

        Restaurant restaurant = createRestaurant();
        HelmetShop helmetShop = createHelmetShop();
        ApplianceCenter applianceCenter = createApplianceCenter();

        shopPricePrinter.print(restaurant);
        shopPricePrinter.print(helmetShop);
        shopPricePrinter.print(applianceCenter);
    }

    private static Restaurant createRestaurant() {
        return new Restaurant("Strays of Tisa", List.of(
                new Food("Siomew", 20),
                new Food("Siorat", 5),
                new Food("Siodog", 9)
        ));
    }

    private static HelmetShop createHelmetShop() {
        return new HelmetShop("Beavis and Butthead Head Protection Shop", List.of(
                new Helmet("Helmet of Redemption", 10090),
                new Helmet("Helm of Immortality", 1231),
                new Helmet("Crown of Catriona Gray", 9999999)
        ));
    }

    private static ApplianceCenter createApplianceCenter() {
        return new ApplianceCenter("House of the Dragon Appliance Center", List.of(
                new Appliance("Vacuum of Ya Sins", 12391),
                new Appliance("Dieson A-rapper", 9409),
                new Appliance("Dry Drier Driest", 989454)
        ));
    }
}
