package sec06.exam1;

interface Inter
{
	public int a = 100;
	public final int b = 100;
	public abstract void method1();
	public void method2();
}

public class InterTest implements Inter
{
	public void method1() {
		System.out.println("추상메소드");
	}
	
	public void method2() {
		System.out.println("추상메소드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterTest obj = new InterTest();
		obj.method1();
		System.out.println("인터페이스에서는 final을 사용하지 않아도 변수는 final");
		System.out.println("인터페이스에서는 abstract를 사용하지 않아도 메소드는 abstract");
	}

}
