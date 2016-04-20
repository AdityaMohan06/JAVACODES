package Feb;

public class Overriding {
	
	public static void main(String[] args) {
		
		Class1 over=new Class1();
		int a = over.add(10, 5);
		System.out.println(a);
		int b = over.add(9, 7);
		System.out.println(b);
			
		
	}

}
