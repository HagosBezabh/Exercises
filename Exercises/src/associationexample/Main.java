package associationexample;

public class Main {

	public static void main(String[] args) {
		Dimension dimen= new Dimension(20,20,2);
		Case theCase = new Case("2298ml","dell","240",dimen);
		//Resolution nativeResolution = new Resolution(1223,1245);
		Monitor moni=new Monitor("200 inch", "Acer", 23,new Resolution(1223,1245) );
		Motherboard board = new Motherboard("BJ-234","Toshiba", 1234, 3456, "V2-244");
		PC thePC = new PC(theCase, moni, board);
		thePC.powerUp();
		
		/*thePC.getMonitor().pixelAt(23,34,"Red");
		thePC.getMotherboard().programLoad("Windows 1.0");
		thePC.getTheCase().powerOn();
		
		//House application
		Wall wall1=new Wall("west");
		Wall wall2=new Wall("east");
		Wall wall3=new Wall("South");
		Wall wall4=new Wall("north");
		
		Ceiling ceil = new Ceiling(12, 55);
		
		Bed bed = new Bed("modern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("Classic", false, 75);
		
		BedRoom room = new BedRoom("HY", wall1, wall2, wall3, wall4, ceil, bed, lamp);
		room.makeBed();
		room.getLamp().turnOn();
		*/
		
	}
}
