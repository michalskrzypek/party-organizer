package logic.repositories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import logic.entities.Product;
import utils.ResourceConnector;

/**
 * Singleton, fetching plain products data, delivering particular produckts from the list etc. 
 * @author mskrz
 *
 */
public class ProductRepository {

	private List<Product> products = new ArrayList<>();
	private ResourceConnector rc = ResourceConnector.getInstance();
	
	private static ProductRepository instance = new ProductRepository();
	private ProductRepository() {
		readProducts();
	}
	
	public static ProductRepository getInstance() {
		if(instance == null) {
			instance = new ProductRepository();
		}
		return instance;
	}
	
	public void readProducts() {
		String line = "";
		try {
			BufferedReader fichero = new BufferedReader(new FileReader(rc.getProductsFile()));
			while (fichero.ready()) {
				line = fichero.readLine();
				String[] sections = line.split("@");
				products.add(new Product(sections[0], rc.getProductTypeByName(sections[1]), sections[2], sections[3],
						Double.parseDouble(sections[4]), Double.parseDouble(sections[5])));
			}

			fichero.close();
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "File not found");
		} catch (IOException ioe) {
			new RuntimeException("I/O error.");
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public Product getProductByName(String name) {
		return products
				.stream()
				.filter(p -> p.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Product with the name: " + name + " does not exist"));
	}

	public Product getProductByCode(String code) {
		return products
				.stream()
				.filter(p -> p.getCode().equals(code))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Product with the code: " + code + " does not exist"));
	}

}
