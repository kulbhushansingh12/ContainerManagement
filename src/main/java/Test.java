import java.util.*;

public class Test {
    /**
     *
     * Tesco has a fleet of vehicles to deliver orders to the customer. Assigning the right set of orders to different sized vehicles
     * is crucial for efficient delivery of orders. Different vehicle can fit different container sizes. --> Diff veh Size, and order size
     *
     *
     *
     * Given c containers, along with their volumes [l,b,h],
     * catalogue of product with its volume requirement (l,b,h)
     * and an order with p products and its quantity.
     * Example:
     *
     * Containers:
     *
     * SMALL -> id=1, length=10, breadth=20, height=30 -> 6000
     *
     * MEDIUM -> id=2, length=50, breadth=60, height=70
     *
     * LARGE -> id=3, length=100, breadth=200, height=300
     *
     * vol -> l*b*h
     *
     *
     * Product:
     *
     * productId=1, length=2, breadth=4, height=10
     *
     * productId=2, length=10, breadth=30, height=4
     *
     * productId=3, length=5, breadth=6, height=7
     *
     *
     *
     * Order:
     * productId=1, quantity=3 -> 80*3 -> 240
     *
     * productId=3, quantity=7 -> 210
     *
     *
     * Determine if that order fits in any of the given c predefined containers and return the ID of the container that can be used.
     *
     * For the above sample of example SMALL container with id=1 should be returned.
     *
     *
     *
     * Order -> p, q -> Total Volume
     * Product -> getProductInfo(productId) -> Product
     * getContainer(int vol) --> The order will alwways fit in 1 container// if doesn't fit return -1
     */
    public static void main(String[] args) {

    }
}
