package associationexample;


public class Bed {
	private String style;
	private int height;
	private int pillows;
	private int sheets;
	private int quilt;
	
	public Bed(String style, int height, int pillows, int sheets, int quilt) {
		this.style = style;
		this.height = height;
		this.pillows = pillows;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	public String getStyle() {
		return style;
	}
	public void make(){
		System.out.println("Bed->making");
	}
	public int getHeight() {
		return height;
	}
	public int getPillows() {
		return pillows;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
}
