package GenericProgramming;

public class SimplePair<k,v> {
	private k key;
	private v value;
	public SimplePair(k key, v value) {
		this.key = key;
		this.value = value;
	}
	public k getKey(){
		return key;
	}
	public v getValue(){
		return value;
	}
	

}
