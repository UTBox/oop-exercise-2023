package util;

import java.util.Scanner;

public class InputService {

    private final Scanner scanner;

    public InputService() {
        this.scanner = new Scanner(System.in);
    }

    public String getStringInput() {
        return scanner.nextLine();
    }

    public double getDoubleInput() {
        return scanner.nextDouble();
    }

    public double getValidPriceInput() {
        double doubleInput;

        do {
            System.out.print("Enter product price: ");
            if (scanner.hasNextDouble()) {
                doubleInput = getDoubleInput();
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while(true);

        return doubleInput;
    }
}
