package Prog4_3_PriorityQueue;

/*
    Deyby Rodriguez
    1291202
    Data Structures
    CSCI 260 M01
*/

public class CustomerOrder {
    private final int orderId;
    private final double orderAmount;
    private final String customerName;

    public static void main( String[] args) {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder (3, 50.5, "customer3");
        CustomerOrder c3 = new CustomerOrder (2, 300.0, "customer2");

        PriorityQ orders = new PriorityQ(10);

        orders.insert(c1);
        orders.insert(c2);
        orders.insert(c3);

        System.out.println(orders.remove().getOrderDetails());
        System.out.println(orders.remove().getOrderDetails());
        System.out.println(orders.remove().getOrderDetails());
    }

    public CustomerOrder(int id, double amt, String name) {
        orderId = id;
        orderAmount = amt;
        customerName = name;
    }

    public int getOrderID() {
        return orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDetails() {

        String details = "orderId: " + orderId + ", " +
                "orderAmount: " + orderAmount + ", " +
                "customerName: " + customerName;

        return details;
    }
}
