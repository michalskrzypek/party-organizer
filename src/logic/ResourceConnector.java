package logic;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceConnector {

	private static Locale locale = new Locale("en");
	private static ResourceBundle texts = ResourceBundle.getBundle("resources/T", locale);

	public static void setLocale(Locale locale) {
		ResourceConnector.locale = locale;
		texts = ResourceBundle.getBundle("resources/T", locale);
	}

	public static Locale getLocale() {
		return ResourceConnector.locale;
	}

	public static String getTitle() {
		return texts.getString("title");
	}

	public static String getProductTypeName(ProductType productType) {
		return texts.getString(productType.name());
	}

	public static File getProductsFile() {
		String fileName = "";
		if (locale.getLanguage().equals("en")) {
			fileName = "resources/party.txt";
		} else if (locale.getLanguage().equals("es")) {
			fileName = "resources/fiesta.txt";
		} else {
			throw new RuntimeException("Can not localize the file!");
		}
		return new File(fileName);
	}

}
