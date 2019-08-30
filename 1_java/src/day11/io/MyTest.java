package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		String folder = "c:\\lib\\";
		String file = "Ben.mp3";
		String copy = "copy.mp3";
		
		int read;
		byte[] b;
		
		fis = new FileInputStream(folder + file);
		fos = new FileOutputStream(folder + copy);
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		
		while((read = bis.read()) != -1) {
			bos.write(read);
		}
		
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		System.out.println("end");
		
	}

}
