package General;

public class IsemptyMethod {
String n;
String o=null;
	String s[] = new String[10];
	String s1 = "";//which denotes the empty spaces, not address
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsemptyMethod m = new IsemptyMethod();
		String p=null;//the variable 'p' is not referring anything
		String q="";//the variable 'q' is referring ""[empty spaces]
		//m.s[1] = "abc";
		System.out.println(m.s[1].isEmpty());
		System.out.println(m.s1.isEmpty());
		//if you use "m.s[1].isEmpty()" it will throw null pointer exception
		//because there is no address for 'm.s[1]'. Address is not created for that particular position.
		System.out.println(m.n);
		System.out.println(q.length());
	}

}
