import com.inventory.order.Order;
import com.inventory.customer.Customer;
import com.inventory.product.*;

public class InventoryAndBilling {
    public static void main(String args[]) {
        System.out.println("### Inventory and Billing System ###");
        Customer c = new Customer(101, "Fareen Maulavi", "fareen@test.com");
        Order o = new Order(c);
        o.addItem(new GroceryProduct(101, "Banana", 50, 5));
        o.addItem(new GroceryProduct(102, "Bread", 70, 2));
        o.addItem(new ElectronicProduct(103, "Headphones", 1200, 2));
        o.addItem(new GroceryProduct(104, "Eggs", 80, 20));
        o.addItem(new ElectronicProduct(105, "Charger", 300, 1));
        o.addItem(new GroceryProduct(106, "Mix Vegetables", 100, 1));

        o.calculateTotal();

        o.printBill();
    }
}