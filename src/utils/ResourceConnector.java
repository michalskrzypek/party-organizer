package utils;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.Icon;

import logic.enums.ProductType;

/**
 * Singleton
 * 
 * @author mskrz
 *
 */
public class ResourceConnector {

	private Locale locale = new Locale("en");
	private ResourceBundle texts = ResourceBundle.getBundle("resources/T", locale);
	private static ResourceConnector instance = new ResourceConnector();

	public static ResourceConnector getInstance() {
		if (instance == null) {
			instance = new ResourceConnector();
		}
		return instance;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
		texts = ResourceBundle.getBundle("resources/T", locale);
	}

	public Locale getLocale() {
		return this.locale;
	}

	public String getTitle() {
		return texts.getString("title");
	}

	/**
	 * Returns String representation of the enum ProductType regarding to the locale
	 * 
	 * @param productType
	 * @return
	 */
	public String getProductTypeString(ProductType productType) {
		return texts.getString(productType.name());
	}

	public ProductType getProductTypeByName(String type) {
		return ProductType.valueOf(texts.getString(type));

	}

	public File getProductsFile() {
		String fileName = "";
		if (locale.getLanguage().equals("en")) {
			fileName = "src/resources/party.txt";
			System.out.println("TU");
		} else if (locale.getLanguage().equals("es")) {
			fileName = "src/resources/fiesta.txt";
		} else {
			throw new RuntimeException("Can not localize the file!");
		}
		return new File(fileName);
	}
	
	public File getUsersFile() {
		String fileName = "clientes.dat";
		return new File(fileName);
	}
}
