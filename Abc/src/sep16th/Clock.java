package sep16th;



	public class Clock {
		
		int hr,min,sec;
		
		//default constructor   --constructors are mainly used to set or intualise variables or to run the pre requisite code wemust place that code here no need to call that seperately by keeping innormal methods everytime
		public Clock()
		{
			
			hr=10;
			min=10;
			sec=10;
				
		}
		
		
		public Clock(int hr)
		{
			this();
			this.hr=hr;
		
		}
		
		public Clock(int hr,int min)
		{
			this.hr=hr;
			this.min=min;
		}
		public Clock(int hr,int min,int sec)
		{
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		
		
		public void getClock()
		{
			
			System.out.printf("%02d:%02d:%02d",hr,min,sec);
			System.out.println();
		}
		

	}

