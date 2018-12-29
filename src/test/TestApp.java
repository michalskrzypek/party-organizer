package test;

import java.util.Locale;

import logic.Product;
import logic.ProductType;
import logic.ResourceConnector;

public class TestApp {

	public static void main(String[] args) {
		System.out.println(ResourceConnector.getTitle());
		ResourceConnector.setLocale(new Locale("es"));
		System.out.println(ResourceConnector.getTitle());
	}
	
}
