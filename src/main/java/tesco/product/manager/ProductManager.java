package tesco.product.manager;

import tesco.product.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductManager implements ProductManagerInterface{

    private static ProductManager pm;
    Map<Integer, Product> productLookup;
    public ProductManager() {
        productLookup = new HashMap<>();
        initializeProduct();
    }

    private void initializeProduct() {
        /**
         *      * productId=1, length=2, breadth=4, height=10
         *      *
         *      * productId=2, length=10, breadth=30, height=4
         *      *
         *      * productId=3, length=5, breadth=6, height=7
         */
        // product addition should have id validation and it is exxpected to be unique
        Product p1 = new Product(1, 2, 4, 10);
        Product p2 = new Product(2, 10, 30, 4);
        Product p3 = new Product(3, 5, 6, 7);
        productLookup.put(p1.id, p1);
        productLookup.put(p2.id, p2);
        productLookup.put(p3.id, p3);
    }

    @Override
    /**
     * -1 indicates the product doesn't exists.
     */
    public int getProductVolume(int productID) {
        if (productLookup.containsKey(productID)) {
            return productLookup.get(productID).getVolume();
        }
        return -1;
    }

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    public static ProductManager getInstance() {
        if (pm == null) {
            pm = new ProductManager();
        }
        return pm;
    }
}
