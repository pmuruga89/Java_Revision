package PracticeProgram;

public class SortingNumberAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "muru12345gan";
		char c[] = s.toCharArray();
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for(int i=0;i<c.length;i++){
			
			if(Character.isDigit(c[i])){
				sb1.append(c[i]);
			}else{
				sb2.append(c[i]);
			}
			
		}
		System.out.println("Digit: "+sb1);
		System.out.println("Latter: "+sb2);

	}

}
