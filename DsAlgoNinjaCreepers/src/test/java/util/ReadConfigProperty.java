package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Properties;

public class ReadConfigProperty {
	private static Properties prop = loadProperty();

	
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
		
	}
	public static int getPropertyInt(String key)
	{
		return Integer.parseInt(prop.getProperty(key));
	}
	public static Properties loadProperty() {
		
		Properties p = new Properties();
		try {
			InputStream is = ReadConfigProperty.class.getResourceAsStream("/config.properties");
			p.load(is);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return p;
		}
	}
