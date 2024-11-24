package jaaa;

import com.sun.jna.platform.win32.WinUser.MOUSEINPUT.ByReference;

public class sai {
static public int k=5;

public static void main(String[] args) {
	ram r=new ram();
	r.i=200;
	System.out.println(r.maa());
}
}
  class ram {
	  int i=50;
	public int maa(){
		
		return i;
	}
}
