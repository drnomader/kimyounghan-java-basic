package poly.ex4;

public class AbstractMain {
	public static void main(String[] args) {
		//unable to instantiate abstract class
		//AbstractAnimal abstractAnimal = new AbstractAnimal();

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);

		moveAnimal(dog);
	}

	//unchanging code
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}

	private static void moveAnimal(AbstractAnimal animal) {
		System.out.println("동물 이동 테스트 시작");
		animal.move();
		System.out.println("동물 이동 테스트 종료");
	}
}
