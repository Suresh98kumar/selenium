package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Collectionexample {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("surseh");
		l.add("tamizh");
		l.add("vasanth");
		l.add("siva");
		Stack<String> s=new Stack<>();
		s.addAll(l);
		LinkedList<String> Ll=new LinkedList<>();
		s.addAll(l);
		System.out.println("Stack peek:"+s.peek());
		System.out.println("queve peek:"+Ll.peek());
		System.out.println("stack method........");
		while(s.size()>0) {
			System.out.println(s.pop());
		}
		System.out.println("queve method...........");
		while(Ll.size()>0) {
			System.out.println(s.pop());
			
		}
	} 
	

}
