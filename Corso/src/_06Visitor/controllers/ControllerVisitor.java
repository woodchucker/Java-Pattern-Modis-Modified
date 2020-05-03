package _06Visitor.controllers;

public interface ControllerVisitor {

	public void visitHelloMessage();
	public void visitExitMessage();
	public void visitDefaultMessage();
}
