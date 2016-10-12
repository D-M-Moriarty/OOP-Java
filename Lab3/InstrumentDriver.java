import java.util.Scanner;

public class InstrumentDriver {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		Instrument instrument = new Instrument("Guitar","f#",false,444.67);
		
		System.out.println(instrument.toString());
	}
}