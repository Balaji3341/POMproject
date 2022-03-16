package leftouttopics;

public class Strings {
	
	
	public static void main(String[] args) {
		
		String a = "Balaji";
		System.out.println(a);
		System.out.println(a.hashCode());
		
		
		String b = "Balaji";
		System.out.println(b);
		System.out.println(b.hashCode());
		
		
		StringBuffer sb = new StringBuffer("Balaji");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		StringBuffer sb1 = new StringBuffer("Balaji");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		
		StringBuilder sbuilder = new StringBuilder("Balaji");
		System.err.println(sbuilder);
		System.err.println(sbuilder.hashCode());
		
		
		StringBuilder sbuilder1 = new StringBuilder("Balaji");
		System.err.println(sbuilder1);
		System.err.println(sbuilder1.hashCode());
		
		
		
		
	}

}
