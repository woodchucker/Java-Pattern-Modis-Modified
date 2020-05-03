package _06MyVisitor.Visitors;

import _06MyVisitor.IVisitor.IVisitor;

public class DefaultVisitor implements IVisitor{

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

	@Override
	public void visitHelloMessage(String name) {
		// TODO Auto-generated method stub
		
	}

}
