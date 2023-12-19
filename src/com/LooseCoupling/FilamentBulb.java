package com.LooseCoupling;

public class FilamentBulb implements Bulb{
	String YellowLight;
	@Override
	public String light() {
		this.YellowLight= "the filament bulb";
		return this.YellowLight;
	}

}
