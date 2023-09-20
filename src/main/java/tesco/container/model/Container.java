package tesco.container.model;

/**
 * This contains the attributes which defines the container.
 */
public abstract class Container {
    // It will have getters and setters.
    public int id;
    public int length;
    public int breadth;
    public int height;

    public int getVolume() {
        return this.breadth * this.height * this.length;
    }
}
