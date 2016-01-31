package enumdemo;

final class Immutable
	{
	   private final int val1;
	    private final String val2;
	 
	    public Immutable(int a, String s)
	    {
	        val1 = a;
	        val2 = s;
	    }
	    public int getVal1()
	    
	    {
	    	   // val1 = val1 + 10;
	       		return val1;
	    }
	    public String getVal2()
	    {
	        return val2;
	    }
	}
public class ImmutableDemo {
		public static void main(String[] args) {
			Immutable obj = new Immutable(10, "TCS");
			Immutable obj1=new Immutable(10,"hagos");
			System.out.println(obj.getVal1());
			System.out.println(obj.getVal2());
			
			System.out.println(obj1.getVal1());
			System.out.println(obj1.getVal2());
		}

}
