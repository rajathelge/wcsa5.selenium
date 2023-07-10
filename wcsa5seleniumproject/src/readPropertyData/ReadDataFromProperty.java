package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {

		// read data form confing.properires file

		FileInputStream fis = new FileInputStream("./data/config.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String data = prop.getProperty("Username");

		System.out.println(data);

	}

}
