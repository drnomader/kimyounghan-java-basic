package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
	public void call() {
		publicValue = 1;
		protectedValue = 1; // extends or same pkg
		//defaultValue = 1; // same pkg only
		//privateValue = 1; // same class only

		publicMethod();
		protectedMethod();
		//defaultMethod(); // same pkg only
		//privateMethod(); // same class only

		printParent();
	}
}
