public class OrderTester {

    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);
        // Add orders.
        orderQueue.addOrder("John", "2/5/2025", 5);
        orderQueue.addOrder("Kate", "2/5/2025", 5);
        orderQueue.addOrder("Emal", "2/5/2025", 8);

        // Print orders.
        System.out.println(orderQueue);
        // orderQueue.customerOrders.toString();

        // Clear stock.
        orderQueue.sellStock();

        // Print OrderQueue
        System.out.println(orderQueue);

        // Add 10 to stock.
        orderQueue.addStock(10);

        // Add new orders.
        orderQueue.addOrder("Keith", "2/6/2025", 3);
        orderQueue.addOrder("Shakir", "2/6/2025", 3);
        orderQueue.addOrder("Fran", "2/6/2025", 5);

        // Clear the stock.
        orderQueue.sellStock();

        // Print OrderQueue
        System.out.println(orderQueue);
    }

}