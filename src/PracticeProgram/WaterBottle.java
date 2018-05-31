package PracticeProgram;

public class WaterBottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Water";
		String str2 = "Bottle";
		
		//WatBottleer
		
		String s = str1.subSequence(0, 3)+str2+str1.subSequence(3, 5);
		System.out.println(s);
		
		System.out.println(str2.replaceFirst("", str1.substring(0,3))+str1.substring(str1.length()-2));
	}

}
