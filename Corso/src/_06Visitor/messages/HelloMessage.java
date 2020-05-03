package _06Visitor.messages;

import _06Visitor.controllers.ControllerVisitor;

public class HelloMessage extends Message{

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitHelloMessage();
		
	}

}
