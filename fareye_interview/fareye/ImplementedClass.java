package fareye_interview.fareye;

public class ImplementedClass extends NormalClass{
	int i= 20;
//	public static void ank() {
//		System.out.println("child");
//	}
	public void a() throws RuntimeException {
		System.out.println(i);
//		System.out.println(super.);
	}
	public static void main(String[] args) {
//		ank();
		ImplementedClass t = new ImplementedClass();
		
		System.out.println(t.i);
//		t.aa();
		t.a();
	}
}
