
public class A {

	public static int staticCount = 5;
	
	public int instanceCount = 5;
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}
	
}
