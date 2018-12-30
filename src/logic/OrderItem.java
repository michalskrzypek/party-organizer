package logic;

public class OrderItem {

	private Order order;
	private Product product;
	private int productCount;
	private double totalPrice;

	public OrderItem(Order order, Product product, int productCount) {
		this.product = product;
		this.productCount = productCount;

		OrderItemService service = OrderItemService.getInstance();
		service.calculatePrice(this);
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
