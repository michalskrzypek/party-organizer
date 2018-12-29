package logic;

public class OrderItem {

	private Order order;
	private Product product;
	private int productCount;
	private double totalPrice;
	
	public OrderItem(Order order, Product product, int productCount) {
		this.product = product;
		this.productCount = productCount;
		
		if(product.isGroupProduct()) {
			int groupedGuests = order.getNumberOfGuests() / 10;
			this.totalPrice = product.getGroupPrice() * groupedGuests;
		} else {
			this.totalPrice = product.getUnitPrice() * productCount;	
		}
	}
	
	public void calculatePrice() {
		if(product.isGroupProduct()) {
			int groupedGuests = order.getNumberOfGuests() / 10;
			this.totalPrice = product.getGroupPrice() * groupedGuests;
		} else {
			this.totalPrice = product.getUnitPrice() * productCount;	
		}
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
