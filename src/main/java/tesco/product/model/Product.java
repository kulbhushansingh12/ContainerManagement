package tesco.product.model;

/**
 * Model for the product.
 */
public class Product {
    public int id;
    public int length;
    public int breadth;
    public int height;

    public Product(int id, int length, int breadth, int height) {
        this.id = id;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getVolume() {
        return this.length * this.breadth * this.height;
    }
}
