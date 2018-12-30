package logic;

public class ProductService {

	private static ProductService instance = new ProductService();
	
	private ProductService() {
		
	}
	
	public static ProductService getInstance() {
		if(instance == null) {
			instance = new ProductService();
		}
		return instance;
	}
}
