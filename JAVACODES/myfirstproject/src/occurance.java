
public class occurance {
     
	public static void main(String[] args) {
		String str1 = "my name is aditya mohan.I live in faridabad.";
		int charcount=str1.replaceAll("[^a]", "").length();
		System.out.println(charcount);
}
}