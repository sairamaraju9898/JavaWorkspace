package sep12;

import java.util.Scanner;

public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c=new Clock();
		System.out.println("enetre hours");
		Scanner scanner=new Scanner(System.in);
        int hr=scanner.nextInt();
		System.out.println("enetre min");
        int min=scanner.nextInt();
        System.out.println("enetre sec");
        int sec=scanner.nextInt();
        c.setTime(hr, min, sec);
        c.getTime();
	}

}
