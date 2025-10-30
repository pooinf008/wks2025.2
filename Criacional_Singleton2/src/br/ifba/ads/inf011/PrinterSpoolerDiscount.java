package br.ifba.ads.inf011;

public class PrinterSpoolerDiscount extends AdvancedPrinterSpooler {
	
	private static PrinterSpoolerDiscount printerSpooler;
	
	public static PrinterSpooler instance() {
		if(PrinterSpoolerDiscount.printerSpooler == null)
			PrinterSpoolerDiscount.printerSpooler = new PrinterSpoolerDiscount();
		return PrinterSpoolerDiscount.printerSpooler;
	}	
	
	
	protected PrinterSpoolerDiscount() {
		
	}
	
	public Integer total() {
		return (super.total()) >= 5 ? super.total() - 5 : 0;
	}	
	
	

}
