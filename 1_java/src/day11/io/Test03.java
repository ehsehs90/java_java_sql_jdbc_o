package day11.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

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
			fos = new FileOutputStream(base + copyname, false);
			
			System.out.println("Copy Start");

			//fis.read
			
			byte[] buffer = new byte[1024*1024];
			while((read = fis.read(buffer)) != -1) {
				System.out.println(read);
				fos.write(buffer, 0, read);
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
