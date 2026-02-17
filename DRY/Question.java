// Before: Each processor duplicates tax calculation
class USOrderProcessor {
    public void processOrder(double amount) {
        double tax = amount * 0.10; // Duplicated tax logic
        double total = amount + tax;
        System.out.println("US Order - Subtotal: $" + amount
            + ", Tax: $" + tax + ", Total: $" + total);
    }
}

class EUOrderProcessor {
    public void processOrder(double amount) {
        double tax = amount * 0.20; // Duplicated tax logic
        double total = amount + tax;
        System.out.println("EU Order - Subtotal: $" + amount
            + ", Tax: $" + tax + ", Total: $" + total);
    }
}

class UKOrderProcessor {
    public void processOrder(double amount) {
        double tax = amount * 0.15; // Duplicated tax logic
        double total = amount + tax;
        System.out.println("UK Order - Subtotal: $" + amount
            + ", Tax: $" + tax + ", Total: $" + total);
    }
}

// TODO: Extract a TaxCalculator interface and region implementations.
// TODO: Refactor OrderProcessor to accept a TaxCalculator.

public class Question {
    public static void main(String[] args) {
        // After refactoring, usage should look like:
        // OrderProcessor usProcessor = new OrderProcessor(new USTaxCalculator());
        // usProcessor.processOrder(100.0);
        
    }
}