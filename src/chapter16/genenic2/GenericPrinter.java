package chapter16.genenic2;

import chapter16.genenic1.Material;

public class GenericPrinter<T extends Material> {
	
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return meterial.toString();
	}
	
	
	
}
