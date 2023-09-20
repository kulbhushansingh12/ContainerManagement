package tesco.order;

import tesco.order.model.Order;

public interface OrderContainerDriverInterface {
    int getContainerIDForOrder(Order order);
}
