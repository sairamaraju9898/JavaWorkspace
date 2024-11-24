package starPatterns;

public class pat3 {
public static void main(String[] args) {
	int k=5;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(j<k) {
				System.out.print("  ");
			}	
			else {
				System.out.print(" *");
			}
		}
		 k--;
		System.out.println();
	}
}
}
