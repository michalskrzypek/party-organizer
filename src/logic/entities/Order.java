package logic.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Order {

	private String id;
	private User user;
	private List<OrderItem> items;
	private int numberOfGuests;
	private LocalDateTime lastModified;
	private LocalDateTime orderedAt;
	private boolean completed;
	private double totalPrice;
	
	private UUID uuid = UUID.randomUUID();
	
	public Order() {
		String id = uuid.toString().substring(0,5).toUpperCase();
		this.id = "ORDER_" + id;
		this.lastModified = LocalDateTime.now();
		items = new ArrayList<OrderItem>();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public LocalDateTime getLastModified() {
		return lastModified;
	}
	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}
	public LocalDateTime getOrderedAt() {
		return orderedAt;
	}
	public void setOrderedAt(LocalDateTime orderedAt) {
		this.orderedAt = orderedAt;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	
	
	
}
