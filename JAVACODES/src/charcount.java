
public class charcount {
	public static void main(String[] args) {
   		
		String s = "my name my a my cone sharp";
		System.out.println(s.lastIndexOf("m"));
		System.out.println(s.indexOf("a"));
		/*System.out.println(s.trim());*/
		int length2 = s.length();
		System.out.println(length2);
		int length = s.trim().length();
		System.out.println(length);
        System.out.println(s.isEmpty());
        System.out.println(s.endsWith("a"));
        System.out.println(s.getBytes());
		

	}
	
}
