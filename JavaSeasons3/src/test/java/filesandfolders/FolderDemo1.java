package filesandfolders;

import java.io.File;

public class FolderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//in realtime asa tetsres we will use folders creation
		
	File flSrc=	new File(System.getProperty("user.dir")+"\\xyz");
     System.out.println(flSrc.mkdir());	
	}

}
