package associationexample;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public void powerUp(){
		theCase.powerOn();
		drawLogo();
	}
	private void drawLogo(){
		monitor.pixelAt(1200,50, "Yellow");
	}
	/*******************************
	 * private Case getTheCase() {
		return theCase;
	}
	private Monitor getMonitor() {
		return monitor;
	}
	private Motherboard getMotherboard() {
		return motherboard;
	}
	*********************************/
}
