package enumdemo;

public class NoOfInstances {
	static int count = 0;

	NoOfInstances() {
		++count;
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		NoOfInstances instance = null;
		for (int i = 0; i < 10; ++i) {
			instance = new NoOfInstances();
		}
		System.out.println("Number of instances so far =" + instance.getCount());
	}
}
