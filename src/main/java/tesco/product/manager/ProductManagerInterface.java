package tesco.product.manager;

import tesco.product.model.Product;

public interface ProductManagerInterface {
    int getProductVolume(int productID);
    boolean addProduct(Product product);
}
