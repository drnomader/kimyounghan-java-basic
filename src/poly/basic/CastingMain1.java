package poly.basic;

public class CastingMain1 {
	public static void main(String[] args) {
		Parent poly = new Child();
//		poly.childMethod(); //parent's only

		//다운캐스팅(부모 타입 -> 자식 타입)
		Child child = (Child) poly;
		child.childMethod();
	}
}
