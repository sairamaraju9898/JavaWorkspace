package sep12;

public class Clock {
private int hr,min,sec;  // variables can be anything private orv public if u want to make tight encapsulation make private 

//in generl developesr will use seperate geta nd setter metyod for each variable tro modify or get those values bu here were
//writing all these variables in same get and setter methods
public void setTime(int hr,int min, int sec) {
	
	
	this.hr =hr;
	this.min=min;
	this.sec=sec;
}


public void getTime() {
	System.out.println(hr+":"+min+":"+sec);
	
	System.out.printf("%02d:%02d:%02d", hr,min,sec);
}

}
