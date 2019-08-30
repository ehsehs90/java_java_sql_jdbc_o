package day11.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String base = "C:\\lib\\";
		String filename = "Ben.mp3";
		String copyname = "copy.mp3";
		
		int count = 0;
		int read = 0;
		
		try {
			fis = new FileInputStream(base + filename);
			fos = new FileOutputStream(base + copyname);
			
			System.out.println("Copy Start");
			
			while((read = fis.read()) != -1) {
				fos.write(read);
				count++;
			}
			
			System.out.println("IO count : " + count);
			System.out.println("Copy Complete");
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("ready file");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(fis != null)fis.close();
				if(fos != null)fos.close();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}

}
