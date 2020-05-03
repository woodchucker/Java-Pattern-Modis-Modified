package _06MyVisitor.Visitors;

import _06MyVisitor.IVisitor.IVisitor;

public class HelloVisitor implements IVisitor{

	
	@Override
	public void visitDefaultMessage() {
			
	}

	public void hello() {
		System.out.println("Hello!");
	}
	public void helloName(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	@Override
	public void visitHelloMessage() {
		hello();
		
	}

	@Override
	public void visitExitMessage() {}


	public void visitHelloMessage(String name) {
		if(name == null || name.trim().isEmpty()) {hello();}
		else {helloName(name);}
		
	}

}
