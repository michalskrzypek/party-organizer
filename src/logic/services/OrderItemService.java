package logic.services;

import logic.entities.Order;
import logic.entities.OrderItem;
import logic.entities.Product;

public class OrderItemService {

	private static OrderItemService instance = new OrderItemService();
	
	private OrderItemService() {
		
	}
	
	public static OrderItemService getInstance() {
		if(instance == null) {
			instance = new OrderItemService();
		}
		return instance;
	}
	
	public void addUnits(OrderItem orderItem, int unitsToAdd) {
		orderItem.setProductCount(orderItem.getProductCount() + unitsToAdd);
		calculatePrice(orderItem);
	}
	
	public void removeUnits(Order order, OrderItem orderItem, int unitsToRemove) {
		if(unitsToRemove >= orderItem.getProductCount()) {
			order.getItems().remove(orderItem);
		} else {
			orderItem.setProductCount(orderItem.getProductCount() - unitsToRemove);
			calculatePrice(orderItem);
		}
	}
	
	public void calculatePrice(OrderItem orderItem) {
		Product product = orderItem.getProduct();
		Order order = orderItem.getOrder();
		
		if(product.isGroupProduct()) {
			double groupedGuests = (double) order.getNumberOfGuests() / 10;
			orderItem.setTotalPrice(product.getGroupPrice() * groupedGuests);
		} else {
			orderItem.setTotalPrice(product.getUnitPrice() * orderItem.getProductCount());	
		}
	}
	
}
