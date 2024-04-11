package userValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileIO {

@SuppressWarnings("null")
public static void main(String[] args)	throws IOException {

	BufferedReader fileReader = null;
	try	{
		BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
		
			String line = "";
			while ((line =fileReader.readLine()) !=null) {
				System.out.println(line);
			}
		
	}	finally	{
		fileReader.close();
	}
	}
}
