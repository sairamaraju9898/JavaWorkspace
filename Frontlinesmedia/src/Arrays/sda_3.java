package Arrays;
 
import java.util.Scanner;
 
public class sda_3 {
	
// merging two arrrays  and printing output of string type
	
	public static void main(String[] args) {
		System.out.println("please enter count of string values u want to enter in 1st array");
		 Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		String[] st=new String[m];
		for(int i=0;i<m;i++) {
			System.out.println("please enter string values one by one by pressing enter button");
			st[i]= s.next();
		}
		
		System.out.println("please enter count of string values u want to enter in 2nd array");
		int c=s.nextInt();
		String[] t=new String[c];
		for(int i=0;i<c;i++) {
			System.out.println("please enter string values one by one by pressing enter button");
			t[i]=s.next();
		}
		System.out.print("[ ");
		String[] d=new String[st.length+t.length] ;
		 int p=0;
		for(int i=0;i<m;i++) {
			d[p]=st[i];	
			 p++;
			}	  
	
		for(int j=0;j<c;j++) {
		
			d[p]=t[j];
			p++;
		 
		}
		for(int i=0;i<m+c;i++) {
		System.out.print(d[i]+" " );
			 
		}
		System.out.print(" ]");
	}

}
