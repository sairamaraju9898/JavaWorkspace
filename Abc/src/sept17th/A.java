package sept17th;

public class A {

	int m,n,r;
	
	public A(){
		m=10;
		n=20;
		r=50;
		}
	
	
	public A(int x) {
		this();
		
		this.m=x;
	}
	
	
	public A(int y,int z) {
		this.m=y;
		this.n=z;
	}
	
	public int get() {
		
		
		return m+n+r;
	}
	
}
