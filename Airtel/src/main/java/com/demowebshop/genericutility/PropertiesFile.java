package com.demowebshop.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {
	
	public String readData(String key) throws IOException
	{
		
		FileInputStream fis = new FileInputStream("./commondata/commondata.properties/");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}
}

