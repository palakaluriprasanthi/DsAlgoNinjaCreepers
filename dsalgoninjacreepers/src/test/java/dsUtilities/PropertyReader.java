package dsUtilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	private static Properties prop = loadProperty();

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	public static int getPropertyInt(String key) {
		return Integer.parseInt(prop.getProperty(key));
	}

	public static Properties loadProperty() {
		Properties p = new Properties();
		try {
			InputStream is = PropertyReader.class.getResourceAsStream("/config.properties");
			p.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

}
