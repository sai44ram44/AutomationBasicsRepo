package com.naniTech.testAutomationSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("test.properties");	
		FileInputStream fis = new FileInputStream(f);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("username"));

	}
}
