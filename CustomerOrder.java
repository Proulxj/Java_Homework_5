public class CustomerOrder {

    String name, date;
    int quantity;

    CustomerOrder() {

    }
    
    CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    //This method subtracts quantity by 1, except when quantity <= 0.
    void shipProduct() {
        if(quantity > 0) {
            quantity -=1;
        }
    }

    
}