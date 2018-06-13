package evening;

public class Person implements Speakable{

	@Override
	public void speak() {
		System.out.println("Hello");
	}

	@Override
	public void yell() {
		System.out.println("HELLO");
	}

	
}
