package day06;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("start ... ");
		
		BlockTest b = new BlockTest();
		System.out.println("-----------");
		BlockTest c = new BlockTest();
		
		System.out.println("end ... ");
	}

}
class BlockTest{
	static {
		System.out.println("Construct static {  }");
	}
	
	{
		System.out.println("Construct {  }");
	}
	public BlockTest() {
		System.out.println("BlockTest() Constructor .. ");
	}
}