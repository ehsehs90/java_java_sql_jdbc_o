package ex;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		DeptManager dm = new DeptManager();
		List<DeptVO> list = dm.getDepts();
		list.forEach(i->System.out.println(i));
	}

}
