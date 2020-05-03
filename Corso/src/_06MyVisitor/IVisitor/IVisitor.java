package _06MyVisitor.IVisitor;

public interface IVisitor {
	public void visitHelloMessage();
	public void visitExitMessage();
	public void visitDefaultMessage();
	public void visitHelloMessage(String name);
}
