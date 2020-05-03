package _06Visitor.messages;

import _06Visitor.controllers.ControllerVisitor;

public class ExitMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitExitMessage();
		
	}

}
