package General;

public class ForloopNumCompare {

	public static void main(String[] args) {
		
		int a[] = {2, 3, 4, 5, 6, 1, 2};
		int b[] = {3, 4, 5, 2, 6, 2, 1};
		
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				
				if(a[i]==b[j]){
					System.out.println("a and b are equal:" +a[i] +" "+b[j]);
					break;
				}else{
					System.out.println("a and b are not equal:" +a[i] +" "+b[j]);
				}
			}
		}

	}

}
