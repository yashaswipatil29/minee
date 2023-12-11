package day2;

public class PrinterMain {

	public static void main(String[] args) {
		Printer prn = new Printer();
		//prn.setContent("Yashaswi");
		prn.print();
		prn.print("*****");
		prn.print("#####");
        
		Printer prn2=new Printer("Mayuri");
		prn2.print();
	}

}
