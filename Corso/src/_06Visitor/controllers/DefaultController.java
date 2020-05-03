package _06Visitor.controllers;

public class DefaultController implements ControllerVisitor{

	@Override
	public void visitHelloMessage() {
		
		
	}

	@Override
	public void visitExitMessage() {
		
		
	}

	@Override
	public void visitDefaultMessage() {
		System.out.println("Messaggio non valido!");
		
	}

}
