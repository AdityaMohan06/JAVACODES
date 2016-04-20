package list;

import java.util.ArrayList;

public class list1 {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("aditya");
		a.add("Hi");
		a.add("hello");
		a.add("nim");
		System.out.println(a.toString());
		
		ArrayList b=new ArrayList();
		//b.add("hi");
		//b.add("Hi");
		//b.add("num");
		b.add("hello");
		b.add("Hi");
		b.add("nim");
		b.add("lol");
		System.out.println(b.toString());
		//a.removeAll(b);
		//System.out.println(a.toString());
		b.retainAll(a);
		System.out.println(b.toString());
		
	}

}
