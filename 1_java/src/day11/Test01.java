package day11;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "0909");
		map.put("java03", "0070");
		map.put("java04", "1123");
		map.put("java05", "4568");
		
		//map.forEach((key, value)->System.out.println(key + "=" + value));
		
		
		/*
		System.out.println(map);
		
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please Input ID and PW ");
			System.out.print("ID : ");
			String id = scanner.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("id not exist");
			}
			else {
				System.out.print("PW : ");
				String pw = scanner.nextLine().trim();
		
				if(!map.get(id).equals(pw)) {
					System.out.println("pw fail");
				}
				else {
					System.out.println("login success");
				}
			}
			System.out.println();
		}
		*/
		
	}

}
