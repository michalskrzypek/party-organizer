package logic.services;

import java.util.ArrayList;
import java.util.List;

import logic.entities.Product;
import logic.enums.ProductType;
import logic.repositories.ProductRepository;

public class ProductService {

	private ProductRepository productRepository = ProductRepository.getInstance();

	private static ProductService instance = new ProductService();

	private ProductService() {
	}

	public static ProductService getInstance() {
		if (instance == null) {
			instance = new ProductService();
		}
		return instance;
	}

	public List<String> getAllProductTypes() {
		List<String> types = new ArrayList<String>();
		for (ProductType pt : ProductType.values()) {
			types.add(pt.getName());
		}
		return types;
	}

	public List<Product> getAllByProductType(ProductType productType) {
		List<Product> productsByType = new ArrayList<>();
		productRepository.getProducts().stream().filter(p -> p.getProductType().equals(productType))
				.forEach(p -> productsByType.add(p));
		return productsByType;
	}
	
	public String getIconLocation(String code) {
		return "/img/" + code + ".jpg";
	}
}
