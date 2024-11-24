package Realtime;

public class Menu {
	private String name;
	private int id;
	private int cost;
	private int quantity;

	public Menu(String name,int id,int cost, int quantity) {
		this.name=name;
		this.id=id;
		this.cost=cost;
		this.quantity=quantity;
	}
	public  String getName() {	
		return name;
	}
	public  int getId() {
		return id;
	}
	public  int getCost() {
		return cost;
	}
	public   int getQuantity() {
		return quantity;
	}
	public void setquantity(int qa) {
		quantity=qa;
	}
	
}
