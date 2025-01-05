package access.a;

public class AccessInnerMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();
		//public: no restriction
		data.publicField = 1;
		data.publicMethod();

		//default: same package only
		data.defaultField = 2;
		data.defaultMethod();

		//private: same class only
		//data.privateField = 3;
		//data.privateMethod();

		data.innerAccess();
	}
}
