public class OrderQueue {

    // Instance variable declaration.
    int stock;
    int queueSize;
    // LiknedQueue of CustomerOrder.

    // LinkedQueue<CustomerOrder> customerOrders = new LinkedQueue<CustomerOrder>();
    LinkedQueue<CustomerOrder> customerOrders;

    // Null constructor.
    OrderQueue() {
        queueSize = 0;
        stock = 0;
        /* LinkedQueue<CustomerOrder> */ customerOrders = new LinkedQueue<CustomerOrder>();

    }

    // Constructor where stock is a parameter.
    OrderQueue(int stock) {
        queueSize = 0;
        this.stock = stock;
        /* LinkedQueue<CustomerOrder> */ customerOrders = new LinkedQueue<CustomerOrder>();

    }

    // Constructs a CustomerOrder object with parameters, and enqueues it.
    void addOrder(String name, String date, int quantity) {
        CustomerOrder customerOrder = new CustomerOrder(name, date, quantity);
        customerOrders.enqueue(customerOrder);
    }

    // Takes an integer, and adds to instance variable stock.
    void addStock(int adder) {
        stock += adder;
    }

    //
    void fufillOrder() {
        if (customerOrders.peek().quantity > 0) {
            customerOrders.peek().quantity -= 1;
        } 
        if (customerOrders.peek().quantity <= 0){
            customerOrders.dequeue();
            //stock++;
        }
    }

    void sellStock() {
        while (stock > 0) {
            fufillOrder();
            stock--;
        }
    }

    @Override
    public String toString() {

        int customer_quantity = customerOrders.peek().quantity;
        // System.out.println(customer_quantity);

        return Integer.toString(customer_quantity);
    }
}