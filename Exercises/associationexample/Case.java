package associationexample;

public class Case {
	private String model;
	private String manufacture;
	private String powerSupply;
	private Dimension dimen;
	public Case(String model, String manufacture, String powerSupply, Dimension dimen) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.powerSupply = powerSupply;
		this.dimen = dimen;
	}
	public void powerOn(){
		System.out.println("Power button pressed");
	}
	public String getModel() {
		return model;
	}
	public String getManufacture() {
		return manufacture;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimension getDimen() {
		return dimen;
	}
	
}
