package poly.basic;

public class CastingMain2 {
	public static void main(String[] args) {
		Parent poly = new Child();
//		poly.childMethod; //parent's only

		//일시적 다운캐스팅 - 해당 메서드 호출 순간만 다운캐스팅
		((Child) poly).childMethod();
	}
}
