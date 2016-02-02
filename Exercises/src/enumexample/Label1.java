package enumexample;

public class Label1 {
	private String text;
	private Alignment alignment;
	public Label1(String text, Alignment alignment) {
		//super();
		this.text = text;
		//this.alignment = alignment;
		setAlignment(alignment);
	}
	public synchronized void setAlignment(Alignment alignment){
		this.alignment=alignment;
	}
	public String getText() {
		return text;
	}
	public Alignment getAlignment() {
		return alignment;
	}
	public enum Alignment{
		LEFT,CENTER,RIGHT;
		
	}
}
	
	

/*class Alignment{
	public static final int LEFT=-1;
	public static final int CENTER=-1;
	public static final int RIGHT=-1;
	
}*/