package Practice;

public class Fibonoccii {
public static void main(String[] args) {
	int i=0;
	int j=1;
	int sum=0;
//	while(sum<55) { //by using while loop
//		sum=i+j;
//		i=j;
//		j=sum;
//		System.out.print(sum+ " ");
//	}
	for(sum=0;sum<55;sum++) {  //by using for loop
		sum=i+j;
		i=j;
		j=sum;
		System.out.print(sum+ " ");
	}
}
}
