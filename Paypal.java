package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Paypal {
public static void main(String[] args) {
	String str = "PayPal India";
	char c[] = str.toCharArray();
	Set<Character> charSet = new LinkedHashSet<Character>();
	Set<Character> dupCharSet = new LinkedHashSet<Character>();
		/*
		 * for (char c1 : c) { charSet.add(c); }
		 */
	
for (int i = 0; i < c.length; i++) {
	
	boolean add = charSet.add(c[i]);

	if(add==false)
	{
		dupCharSet.add(c[i]);
	}
}
System.out.println(charSet);
System.out.println(dupCharSet);
	

charSet.removeAll(dupCharSet);
System.out.println(charSet);

for (char eachcharacter : charSet) {
	if(eachcharacter==' ')
	{
		System.out.println("----------");
}
else{
	System.out.println(eachcharacter);
	{
		
		System.out.println(charSet);
	}
	
}


}
}
}
