package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;

public class ListaPersoneMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitListaPersoneController();

	}

}
