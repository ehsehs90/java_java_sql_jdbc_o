package day09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("start");
		
		try(Scanner sc = new Scanner(new File("C:\\lib\\bookdata.txt"));) 
		{ 
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				System.out.println(data);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not Found");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Parsing Error");
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}

}
