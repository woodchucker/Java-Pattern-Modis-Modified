package _07Mvc.messages;

import _07Mvc.controllers.ControllerVisitor;
import _07Mvc.models.Persona;

public abstract class Message {

	private Persona persona;
	
	public abstract void visit(ControllerVisitor cv);
	public void visit(ControllerVisitor...cvs ) {
		for (ControllerVisitor cv: cvs) {
			visit(cv);
		}
	}
	public Persona getPersona() {
		
		return persona;
	};
	
	public void setPersona(Persona p) {
		persona = p;
	}
}
