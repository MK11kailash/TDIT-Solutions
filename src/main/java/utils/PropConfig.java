package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropConfig {
	Properties prop;

	public Properties getPropValues() throws IOException {

		File file = new File(
				"C:\\Users\\mk11k\\New folder\\Atoumation_TDIT_FrameworkProject_2\\src\\main\\java\\pages\\PropConfig.Properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop;
	}

}
