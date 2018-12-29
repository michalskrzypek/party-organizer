package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProductRepository {

	private List<Product> products = null;

	public ProductRepository() {
		products = new ArrayList<>();
		readProducts();
	}

	public void readProducts() {
		String line = "";
		try {
			BufferedReader fichero = new BufferedReader(new FileReader(ResourceConnector.getProductsFile()));
			while (fichero.ready()) {
				line = fichero.readLine();
				String[] sections = line.split("@");
				products.add(new Product(sections[0], ProductType.valueOf(sections[1]), sections[2], sections[3],
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

}
