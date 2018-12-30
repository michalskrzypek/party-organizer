package logic.enums;

import utils.ResourceConnector;

public enum ProductType {

	DRINK("Drink"), FOOD("Food"), DECORATION("Decoration"), PLACE("Place"), OTHER("Other");

	private String name;
	private ResourceConnector rc = ResourceConnector.getInstance();

	private ProductType(String name) {
		this.name = rc.getProductTypeString(this);
	}

	public String getName() {
		return name;
	}

}
