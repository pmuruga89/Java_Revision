package General;

public class StaticNonStatic {
	static int i;
	int j;
	public static void main(String args[]){
		
		StaticNonStatic sns = new StaticNonStatic();
		System.out.println("j=" +sns.j);
		
		System.out.println("i=" + StaticNonStatic.i);
		
		
		
		sns.j=40;
		
		StaticNonStatic sns1 = new StaticNonStatic();
		System.out.println("j=" +sns1.j);
		
		StaticNonStatic sns3 = new StaticNonStatic();
		
		System.out.println(sns3.j);
		
	}
	static{
		System.out.println("SIB");
		i = 20;
	}
	
	{
		System.out.println("IIB");
		j=30;
		
	}

}
