package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// Convert physical file Into Java Readable form
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.properties");
		// Create instance of properties File
		Properties property = new Properties();
		// Load all key value pairs from fis to Property
		property.load(fis);
		// Retrieve Data
		System.out.println(property.get("url"));
		System.out.println(property.get("username"));

	}

}
