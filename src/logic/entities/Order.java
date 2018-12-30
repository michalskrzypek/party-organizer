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
	private double total;
	private boolean discount;
	private String comment;
	private LocalDateTime partyDate;
	private OrderCustomer customer;

	private UUID uuid = UUID.randomUUID();

	public Order() {
		String id = uuid.toString().substring(0, 5).toUpperCase();
		this.id = "ORDER_" + id;
		this.lastModified = LocalDateTime.now();
		items = new ArrayList<OrderItem>();
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
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

	public OrderCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(OrderCustomer customer) {
		this.customer = customer;
	}

	public OrderMemento save() {
		this.lastModified = LocalDateTime.now();
		return new OrderMemento(id, user, items, numberOfGuests, lastModified, orderedAt, completed, total, discount,
				comment, partyDate);
	}

	public void load(OrderMemento orderMemento) {
		id = orderMemento.getId();
		user = orderMemento.getUser();
		items = orderMemento.getItems();
		numberOfGuests = orderMemento.getNumberOfGuests();
		lastModified = orderMemento.getLastModified();
		orderedAt = orderMemento.getOrderedAt();
		completed = orderMemento.isCompleted();
		total = orderMemento.getTotal();
		discount = orderMemento.isDiscount();
		comment = orderMemento.getComment();
		partyDate = orderMemento.getPartyDate();
	}

}
