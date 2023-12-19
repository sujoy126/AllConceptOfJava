package com.LooseCoupling;

public class MainClass {

	public static void main(String[] args) {
		
		Bulb_Holder bh= new Bulb_Holder();
		FilamentBulb fb= new FilamentBulb();
		LED_Bulb lb= new LED_Bulb();
		bh.holder(fb);
		bh.holder(lb);

	}

}
