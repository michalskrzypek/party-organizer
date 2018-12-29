package logic;

public enum ProductType {

	DRINK("Drink"), FOOD("Food"), DECORATION("Decoration"), PLACE("Place"), OTHER("Other");
	
	private String name;
	
	private ProductType(String name) {
		this.name = ResourceConnector.getProductTypeName(this);
	}
	
	public String getName() {
		return name;
	}
	
}
