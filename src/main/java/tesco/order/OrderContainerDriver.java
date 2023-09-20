package tesco.order;

import tesco.container.manager.ContainerManager;
import tesco.order.model.Order;
import tesco.product.manager.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class OrderContainerDriver implements OrderContainerDriverInterface {
    ContainerManager cm;
    ProductManager pm;
    public OrderContainerDriver () {
        cm = ContainerManager.getInstance();
        pm = ProductManager.getInstance();
    }
    @Override
    public int getContainerIDForOrder(Order order) {// n
        int orderVol = getOrderVolume(order);
        return cm.getContainer(orderVol);
    }

    private int getOrderVolume(Order order) {
        int vol = 0;
        for (int prodID : order.products ) {
            int prodVol = pm.getProductVolume(prodID);
            if (prodVol != -1) {
                vol += prodVol;
            }
        }
        return vol;
    }
    // O(N*M) --> n -> length of productIDs in order, M -> The containers
    public static void main(String[] args) {
        Order order = new Order();
        order.id = 1;
        order.products = List.of(1, 3);
        OrderContainerDriver ocd = new OrderContainerDriver();
        System.out.println(ocd.getContainerIDForOrder(order));

        /**
         * 1. Validate order
         * 2. Partial invalid products in the order
         * 3. Completely Invalid products
         * 4. Container is on boundary of 2 containers
         * 5. Vol > biggest container volume.
         */
    }
}
