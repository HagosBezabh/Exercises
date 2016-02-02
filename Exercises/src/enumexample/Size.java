package enumexample;

public class Size {
	public enum Asize{SMALL,MEDIUM,LARGE};
	Asize ch;
	public Size(Asize ch){
		this.ch=ch;
	}
	public void sizeDetails() {
		switch (ch) {
		case SMALL:
			System.out.println("SMMALLEST.");
			break;
 
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
 
		case LARGE:
			System.out.println("LARGE");
			break;
 
		default:
			System.out.println("SPECIAL REQUEST");
			break;
		}
	}
	public static void main(String[] args){
		Size obj=new Size(Asize.SMALL);
		obj.sizeDetails();
		
		Size obj1=new Size(Asize.MEDIUM);
		obj1.sizeDetails();
		
		Size obj2=new Size(Asize.LARGE);
		obj2.sizeDetails();
		
	}
 
	
}
