package collections;

import java.util.HashSet;
import java.util.Set;

public class Setexample {
	public static void main(String[] args) {
		String name1="vasanth";
		String name2="siva";
		System.out.println(name1.hashCode());
	    System.out.println(name2.hashCode());
	    Set<String> set=new HashSet<>();
	    set.add("tamizh");
	    set.add("suresh");
	    set.add("nesa");
	    set.add("jeeva");
	    set.add("siva");
	    for(String s:set) {
	    	System.out.println(s);
	    	System.out.println(s.hashCode());
	    }
	}
	}
	


