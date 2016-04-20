package list;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class list2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(103);
		a.add(105);
		for(Integer temp:a){
			System.out.println(temp);
			if(temp%2==0){
				System.out.println("Even" + temp);
			}
			else
			{
				System.out.println("ODD" + temp);
			}
		}
	}

}
