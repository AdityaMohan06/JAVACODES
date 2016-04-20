import java.util.Scanner;


public class NewString {
	public static void main(String[] args) {
		
		String FN ="Rakesh";
		String MN ="Kumar";
		String LN ="Singh";
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter FN,MN & LN");
		String Fullname=FN+MN+LN;
		System.out.println(Fullname);*/
		String Full=FN+" "+MN+" "+LN;
		System.out.println(Full);
		
		char charAt1 = FN.charAt(0);
		char charAt2 = MN.charAt(0);
		char charAt3 = LN.charAt(0);
		String New=charAt1+"."+charAt2+"."+LN;
		System.out.println(New);
		
		
	}
	

}
