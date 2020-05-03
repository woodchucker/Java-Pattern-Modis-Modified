package _06Visitor.messages;

import _06Visitor.controllers.ControllerVisitor;

public class DefaultMessage extends Message{

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitDefaultMessage();
		
	}

}
