package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		
		BufferedReader bis = null;
		BufferedWriter bos = null;
		
		String base = "C:\\lib\\";
		String filename = "dbinfo.txt";
		String copyname = "copy.txt";
		
		int count = 0;
		int read = 0;
		
		try {
			fis = new FileReader(base + filename);
			fos = new FileWriter(base + copyname, false);
			
			bis = new BufferedReader(fis);
			bos = new BufferedWriter(fos);
			
			System.out.println("Copy Start");

			//fis.read
			
			while((read = bis.read()) != -1) {
				bos.write(read);
				count++;
			}
			
			bos.flush();
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
				if(bis != null)bis.close();
				if(bos != null)bos.close();
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
