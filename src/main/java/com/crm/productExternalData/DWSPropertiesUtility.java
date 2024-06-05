package com.crm.productExternalData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DWSPropertiesUtility {

	public static String pfutil(String keyname) throws IOException {
		FileInputStream fls= new FileInputStream("D:\\java\\FastrackAdvanceSelenium\\src\\test\\resources\\DWS.properties");
		Properties p= new Properties();
		p.load(fls);
	String Data = p.getProperty(keyname);
		
		return Data;
		
	}
}
