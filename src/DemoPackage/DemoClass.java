package DemoPackage;

import java.util.HashMap;

public class DemoClass {

	public static void main(String[] args) {

		String s="jsduvyfisajbdhdiefsjbfs";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			char temp = s.charAt(i);
			if(hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp)+1);
			}
			else {
				hm.put(temp,1);
			}
		}
		
		System.out.println(hm);
		
		
	}

}
