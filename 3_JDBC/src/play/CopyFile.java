package play;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		String file = "\\\\70.12.115.80\\fileserver\\3.JDBC";
		String copy = "C:\\Users\\student\\Desktop\\그림.docx";
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(copy);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int read;
		while((read = bis.read()) != -1) {
			bos.write(read);
		}
		
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	}

}
