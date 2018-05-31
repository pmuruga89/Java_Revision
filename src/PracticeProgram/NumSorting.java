package PracticeProgram;

public class NumSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = new int[5];
		int num[] = {40, 20, 60, 10,80};
		int temp;
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				
				if(num[i]>num[j]){
					
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<num.length;k++){
			System.out.println(num[k]);
		}
	}

}
