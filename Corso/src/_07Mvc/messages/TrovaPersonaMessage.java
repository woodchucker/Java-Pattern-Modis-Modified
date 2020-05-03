package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;
import _07Mvc.models.Persona;

public class TrovaPersonaMessage extends Message {

	public TrovaPersonaMessage(Persona p) {
		setPersona(p);
	}

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitTrovaPersonaController();

	}

}
