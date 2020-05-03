package _06MyVisitor.Visitors;

import _06MyVisitor.IVisitor.IVisitor;

public class ExitVisitor implements IVisitor {

	@Override
	public void visitDefaultMessage() {
			
	}

	@Override
	public void visitHelloMessage() {}

	@Override
	public void visitExitMessage() {
		exit();
	}

	public void exit(){
		System.out.println("Exit");
		System.exit(0);
	}

	@Override
	public void visitHelloMessage(String name) {
		// TODO Auto-generated method stub
		
	}
}
