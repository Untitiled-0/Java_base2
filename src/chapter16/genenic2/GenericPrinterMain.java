package chapter16.genenic2;

public class GenericPrinterMain {

	public static void main(String[] args) {

		GenericPrinter<Powder> printerPowder = new GenericPrinter<Powder>();
		printerPowder.setMeterial(new Powder());
		System.out.println(printerPowder.getMeterial());
			
		
		GenericPrinter<Plastic> printerPlastic = new GenericPrinter<Plastic>();
		printerPlastic.setMeterial(new Plastic());
		Plastic print2 = printerPlastic.getMeterial();
		System.out.println(printerPlastic.getMeterial());
		print2.doprinting();
		
		// 물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
		GenericPrinter<Water> printerWater  = new GenericPrinter<Water>();
		printerWater.setMeterial(new Water());
		Water print3 = printerWater.getMeterial();
		System.out.println(printerWater);
		print3.doprinting();
		
		
	}
}
