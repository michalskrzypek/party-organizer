package logic.entities.mementos;

public class OrderCaretaker {

	private OrderMemento orderMemento;
	
	public void saveOrderState(OrderMemento orderMemento) {
		this.orderMemento = orderMemento;
	}
	
	public OrderMemento getLastOrderState() {
		return this.orderMemento;
	}
}
