package _06MyVisitor.models;

import _06MyVisitor.IVisitor.IVisitor;

public class HelloMessage extends AbstractMessage{
	
	private String name;

	public HelloMessage(String name) {
		this.name = name;
	}

	public HelloMessage() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(IVisitor cv) {
		cv.visitHelloMessage(name);
		
	}

}
