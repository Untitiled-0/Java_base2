package chapter16.genenic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {

		ThreeDPrinter printerPowder = new ThreeDPrinter();
		ThreeDPrinter printerPlastic = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		printerPowder.setMeterial(p1);
		System.out.println(p1);
	

		Powder p2 = (Powder) printerPowder.getMeterial();
		System.out.println(p2);
	

		Plastic p3 = new Plastic();
		printerPlastic.setMeterial(p3);
		System.out.println(p3);
		

		Plastic p4 = (Plastic) printerPlastic.getMeterial();
		System.out.println(p4);		
	}
}

//PowderGen<Powder> pg = new PowderGen<>();
//pg.doprinting();