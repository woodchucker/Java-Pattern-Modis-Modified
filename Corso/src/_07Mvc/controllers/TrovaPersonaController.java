package _07Mvc.controllers;

import _07Mvc.models.Persona;
import _07Mvc.models.Registro;

public class TrovaPersonaController implements ControllerVisitor {

	Registro r;
	Persona p;
	
	public TrovaPersonaController( Persona p, Registro r) {
		this.r = r;
		this.p = p;
	}
	
	@Override
	public void visitAddPersonaController() {
		

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
		
		r.findByMail(p.getMail());
	}

	@Override
	public void visitDefaultController() {
		
		
	}

}
