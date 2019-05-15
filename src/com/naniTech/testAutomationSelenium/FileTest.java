package com.naniTech.testAutomationSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("E:\\Sairam\\Test.txt");
		//file exists or not
		boolean status = f.exists();
		if(status) {
			
			System.out.println("File exists");
		}
		
		else {
			
			System.out.println("File not found");
		}
		
		//check the permission of the file (read/write/execute)
		
		System.out.println("Can read :"+f.canRead());
		System.out.println("Can write :"+f.canWrite());
		System.out.println("Can execute :"+f.canExecute());
		
		//Creating a new file
		
		File f1 = new File("E:\\\\Sairam\\\\Test2.txt");
		try {
			
			f1.createNewFile();
			System.out.println("File is Created in the Location");
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		//Reading data from a file
		File f2 = new File("E:\\Sairam\\Test1.txt");
		try {
			
			FileInputStream fis = new FileInputStream(f2);
			System.out.println(fis.read());
			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//write data to a file
		try {
			
			FileOutputStream fos = new FileOutputStream(f1,true);
			fos.write(66);
			System.out.println("New ASCII added");
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//Read the data from properties file

	}
	
	
	

}
