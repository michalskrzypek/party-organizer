package test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;

import logic.Product;
import logic.ProductRepository;
import logic.ProductType;
import logic.ResourceConnector;

public class TestApp {

	public static void main(String[] args) {
		ResourceConnector rc = ResourceConnector.getInstance();
		
		System.out.println(rc.getTitle());
//		rc.setLocale(new Locale("es"));
		System.out.println(rc.getTitle());

		ProductRepository pr = ProductRepository.getInstance();
		System.out.println(pr.getProducts());
		System.out.println(pr.getProducts().get(0).getProductType().getName());

	}
	
}
