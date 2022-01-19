package Q1;

import java.util.Comparator;

class MerchandiseAsPerPrice implements Comparator<Merchandise>{
	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		// TODO Auto-generated method stub
		return Double.compare(m2.getPrice(),m1.getPrice());
	}
	
}
 class MerchandiseAsPerName implements Comparator<Merchandise> {
	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		// TODO Auto-generated method stub
		return m1.getItemID().compareTo(m2.getItemID());
	}
}


public class Merchandise {

	public Merchandise(String itemID, int qty, double price) {

		this.ItemID = itemID;
		this.Qty = qty;
		this.price = price;
	}

	private String ItemID;
	private int Qty;
	private double price;

	public String getItemID() {
		return ItemID;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println(ItemID + " " + Qty + " " + price);
	}

}
