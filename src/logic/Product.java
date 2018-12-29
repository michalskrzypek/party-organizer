package logic;

public class Product {

	private String code;
	private ProductType productType;
	private String name;
	private String description;
	private double unitPrice;
	private double groupPrice;
	private boolean isGroupProduct;
	
	public Product(String code, ProductType productType, String name, String description, double unitPrice,
			double groupPrice) {
		this.code = code;
		this.productType = productType;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.groupPrice = groupPrice;
		
		if(groupPrice > 0) {
			this.isGroupProduct = true;
		}
	}
	
	public boolean isGroupProduct() {
		return isGroupProduct;
	}

	public void setGroupProduct(boolean isGroupProduct) {
		this.isGroupProduct = isGroupProduct;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getGroupPrice() {
		return groupPrice;
	}
	public void setGroupPrice(double groupPrice) {
		this.groupPrice = groupPrice;
	}
	
	
	
}
