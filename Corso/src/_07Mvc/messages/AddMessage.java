package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;
import _07Mvc.models.Persona;

public class AddMessage extends Message {
	

	public AddMessage(Persona p) {
		super();
		this.setPersona(p);
	}

	@Override
	public void visit(ControllerVisitor cv) {

		cv.visitAddPersonaController();

	}

}
