package logic.services;

import logic.entities.Order;
import logic.entities.OrderItem;
import logic.entities.Product;
import utils.ResourceConnector;

public class OrderService {

	private OrderItemService orderItemService = OrderItemService.getInstance();
	private ResourceConnector rc = ResourceConnector.getInstance();

	public void changeNumberOfGuests(Order order, int newGuestNumb) {
		if(order.getNumberOfGuests() != newGuestNumb) {
			order.setNumberOfGuests(newGuestNumb);
			calculatePrice(order);
		}
	}
	
	public void applyDiscount(Order order, boolean discount) {
		order.setDiscount(discount);
		calculatePrice(order);
	}

	public void addItem(Order order, Product product, int units) {
		if (isAdded(order, product)) {
			orderItemService.addUnits(getItemFromOrder(order, product), units);
		} else {
			OrderItem orderItem = new OrderItem(order, product, units);
			order.getItems().add(orderItem);
			calculatePrice(order);
		}
	}

	private void calculatePrice(Order order) {
		double total = 0;
		for (OrderItem item : order.getItems()) {
			if (order.isDiscount()) {
				orderItemService.calculatePrice(item);
				item.setTotalPrice(item.getTotalPrice() * (1 - rc.getDiscountPercentage()));
			} else {
				orderItemService.calculatePrice(item);
			}
			total += item.getTotalPrice();
		}
		
		order.setTotal(total);
	}

	private boolean isAdded(Order order, Product product) {
		return order.getItems().stream().anyMatch((item) -> item.getProduct().equals(product));
	}

	private OrderItem getItemFromOrder(Order order, Product product) {
		return order.getItems().stream().filter(item -> item.getProduct().equals(product)).findFirst()
				.orElseThrow(() -> new RuntimeException(
						"Order item with the product: " + product.getName() + " does not exist in the order."));
	}

	public void removeFromOrder(Order order, int productCode) {
		OrderItem itemToRemove = getItemByProductCode(order, productCode);
		order.getItems().remove(itemToRemove);
	}

	private OrderItem getItemByProductCode(Order order, int productCode) {
		return order.getItems().stream().filter(item -> item.getProduct().getCode().equals(productCode)).findFirst()
				.orElseThrow(() -> new RuntimeException("Product does not exist in the order!"));
	}
}
