package logic.entities.mementos;

import java.time.LocalDateTime;
import java.util.List;

import logic.entities.OrderItem;
import logic.entities.User;

public class OrderMemento {

	private String id;
	private User user;
	private List<OrderItem> items;
	private int numberOfGuests;
	private LocalDateTime lastModified;
	private LocalDateTime orderedAt;
	private boolean completed;
	private double total;
	private boolean discount;
	private String comment;
	private LocalDateTime partyDate;
	
	public OrderMemento(String id, User user, List<OrderItem> items, int numberOfGuests, LocalDateTime lastModified,
			LocalDateTime orderedAt, boolean completed, double total, boolean discount, String comment,
			LocalDateTime partyDate) {
		super();
		this.id = id;
		this.user = user;
		this.items = items;
		this.numberOfGuests = numberOfGuests;
		this.lastModified = lastModified;
		this.orderedAt = orderedAt;
		this.completed = completed;
		this.total = total;
		this.discount = discount;
		this.comment = comment;
		this.partyDate = partyDate;
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
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getPartyDate() {
		return partyDate;
	}
	public void setPartyDate(LocalDateTime partyDate) {
		this.partyDate = partyDate;
	}
	
	
	
}
