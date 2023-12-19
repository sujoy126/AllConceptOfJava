package com.LooseCoupling;

public class LED_Bulb  implements Bulb{
	String WhiteLight;
	@Override
	public String light() {
		
		this.WhiteLight="The LED Bulb";
		
		return this.WhiteLight;
	}

}
