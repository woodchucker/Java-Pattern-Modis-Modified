package _07Mvc.controllers;

import _07Mvc.models.Persona;
import _07Mvc.models.Registro;

public class AddPersonaController implements ControllerVisitor {

	Registro r;
	Persona p;
	
	public AddPersonaController( Persona p, Registro r) {
		this.r = r;
		this.p = p;
	}
	@Override
	public void visitAddPersonaController() {
		r.addPerson(p);

	}

	@Override
	public void visitRemovePersonaController() {
		
	}

	@Override
	public void visitListaPersoneController() {
		
	}

	@Override
	public void visitExitController() {
		
	}
	@Override
	public void visitTrovaPersonaController() {
		
		
	}
	@Override
	public void visitDefaultController() {
		
		
	}

}
