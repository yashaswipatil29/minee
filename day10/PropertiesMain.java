package day10;

import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JFrame;

public class PropertiesMain {

	public static void main(String[] args) {
		
		Properties winProps = new Properties();
		// TODO Auto-generated method stub
		String filePath = "./src/day10/window.properties";

		//cereating an empty properties object
		try
		{
			FileInputStream fin = new FileInputStream(filePath);
			
		
			//loading the properties from properties file refered through 'fin' into the properties object "winProps"
			winProps.load(fin);
			String appTitle= winProps.getProperty("title");
			String appWidth = winProps.getProperty("width");
			String appHeight = winProps.getProperty("height");

			//System.out.println(appTitle +" "+appWidth+" "+appHeight);
			
			int width = Integer.parseInt(appWidth);
			int height = Integer.parseInt(appHeight);
			
			
			
			JFrame myFrame = new JFrame();
			myFrame.setTitle(appTitle);
			myFrame.setSize(width,height);

			myFrame.setVisible(true);

			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
