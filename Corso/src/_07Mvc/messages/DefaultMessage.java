package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;

public class DefaultMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitDefaultController();

	}

}
