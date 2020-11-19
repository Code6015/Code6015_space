/**
 * 
 */
package code6015_space;

import java.util.*;

public class StringTest {

	
	public static void main(String[] args) {
		
		String s = new String();
		System.out.println(s.length());
		
		String s1 = new String("Akash");
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("Varman");
		String s2 = new String(sb);
		System.out.println(s2);
		
		StringBuffer sb1 = new StringBuffer("Shanu");
		String s3 = new String(sb1);
		System.out.println(s3);
		
		char [] c = {'a','b','c'};
		String s4 = new String(c);
		System.out.println(s4);
		
		byte[] b = {101,102,103};
		String s5 = new String(b);
		System.out.println(s5);
		
		
	}

}
