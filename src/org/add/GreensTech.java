package org.add;

public class GreensTech {
	public void greensOmr(String a) {
		System.out.println("Location:"+a);
	}
public void greensOmr(int a) {
	System.out.println("Pincode:"+a);
	}
public void greensOmr(String v,int d) {
	System.out.println("Chennai:"+v+"\tOmr Id:"+d);
}
public void greensOmr(int d,String v) {
	System.out.println("Number:"+d+"Name:"+v);

}

	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOmr(25663);
		g.greensOmr("channai");
		g.greensOmr(8657357, "Greens Technology");
		g.greensOmr("location", 645);
	}

}
