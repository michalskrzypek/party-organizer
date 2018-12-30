package logic;

public class OrderService {

	private OrderItemService orderItemService = OrderItemService.getInstance();
	
	public void addItem(Order order, Product product, int units) {
		if (isAdded(order, product)) {
			orderItemService.addUnits(getItemFromOrder(order, product), units);
		} else {
			OrderItem orderItem = new OrderItem(order, product, units);
			order.getItems().add(orderItem);
		}
	}

	private boolean isAdded(Order order, Product product) {
		return order.getItems().stream().anyMatch((item) -> item.getProduct().equals(product));
	}

	private OrderItem getItemFromOrder(Order order, Product product) {
		return order.getItems().stream().filter(item -> item.getProduct().equals(product)).findFirst()
				.orElseThrow(() -> new RuntimeException("Order item with the product: " + product.getName() + " does not exist in the order."));
	}
	
	public void removeFromOrder(Order order, OrderItem item) {
		order.getItems().remove(item);
	}
}
