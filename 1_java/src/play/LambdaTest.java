package play;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaTest {

	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		
		BufferedInputStream bis;
		BufferedOutputStream bos;
		
		String file = "C://lib/dbinfo.txt";
		String copy = "C://lib/copy.txt";
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

interface A{
	default public void defunc() {
		System.out.println("defunc");
	}
	public int func();
}
