package abstraction;

 abstract class abstract1   {
	static   int i=90;
	
	   public int add(){
			 i=1;
			int a=8;
			int c=a+i;
			System.out.println("add is "+c);
			return c;
		}
		public  abstract int  sub();
		
		public abstract int  mul();
	public static void main(String[] args) {
		 String[] c = {"hi","bye"};
		 System.out.println(c[0]);
		 
	}
}
 
