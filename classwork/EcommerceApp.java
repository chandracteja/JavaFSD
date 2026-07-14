import java.util.Date;

class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    // Parent Constructor
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();
        System.out.println("Order created: " + orderId);
    }

    // Parent Method
    public double calculateDiscount() {
        // Base discount: 5% for all orders
        return totalAmount * 0.05;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Date: " + orderDate);
    }
}

class PremiumOrder extends Order {
    private String membershipTier;
    private double cashback;

    // Child Constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);
        this.membershipTier = membershipTier;
        this.cashback = totalAmount * 0.10;

        System.out.println("Cashback: " + cashback);
        System.out.println("Premium order with " + membershipTier + " membership");
    }

    @Override
    public double calculateDiscount() {
        // Premium members get an additional 10% discount
        double baseDiscount = super.calculateDiscount();
        double premiumDiscount = totalAmount * 0.10;
        double finalDiscount = baseDiscount + premiumDiscount;

        System.out.println("Premium Discount Applied: " + finalDiscount);
        return finalDiscount;
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Cashback: " + cashback);
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        PremiumOrder order = new PremiumOrder("ORD123", 5000.0, "Gold");

        System.out.println();
        order.displayOrder();

        System.out.println();
        order.calculateDiscount();
    }