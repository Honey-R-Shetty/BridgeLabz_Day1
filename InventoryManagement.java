public class InventoryManagement{
    static class Product {
        int id;
        String name;
        double price;
        int quantity;

        public Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public boolean isAvailable(int qty) {
            return quantity >= qty;
        }

        public void reduceQuantity(int qty) {
            if (isAvailable(qty)) {
                quantity -= qty;
            }
        }
    }

    static class Warehouse {
        Product[] products;
        int count;

        public Warehouse(int size) {
            products = new Product[size];
            count = 0;
        }

        public void addProduct(Product p) {
            if (count < products.length) {
                products[count++] = p;
            }
        }

        public Product findProductById(int id) {
            for (int i = 0; i < count; i++) {
                if (products[i].id == id) {
                    return products[i];
                }
            }
            return null;
        }
    }

    static class Order {
        int productId;
        int quantity;

        public Order(int productId, int quantity) {
            this.productId = productId;
            this.quantity = quantity;
        }

        public boolean placeOrder(Warehouse warehouse) {
            Product p = warehouse.findProductById(productId);
            if (p != null && p.isAvailable(quantity)) {
                p.reduceQuantity(quantity);
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(5);
        warehouse.addProduct(new Product(1, "Laptop", 50000, 10));
        warehouse.addProduct(new Product(2, "Mouse", 500, 50));

        Order order1 = new Order(1, 2);
        Order order2 = new Order(2, 100);

        System.out.println("Order 1 Status: " + order1.placeOrder(warehouse));
        System.out.println("Order 2 Status: " + order2.placeOrder(warehouse));
    }
}