package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   public String getPropTestdata(String key) {
	  try {
		FileInputStream fis =new FileInputStream(
				  "./src/test/resources/org/Config/Config.properties");
		Properties prop= new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return null;
	
   }
   public Properties getProp() {
		  try {
			FileInputStream fis =new FileInputStream(
					  "./src/test/resources/org/Config/Config.properties");
			Properties prop= new Properties();
			prop.load(fis);
			return prop;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	   }
}
