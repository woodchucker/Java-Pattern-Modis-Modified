package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;
import _07Mvc.models.Persona;

public class RemoveMessage extends Message {

	public RemoveMessage(Persona p) {
		this.setPersona(p);
	}
	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitRemovePersonaController();

	}

}
