package _11EnumImpl.controllers;

import _11EnumImpl.models.Registro;

public class AddController extends Controller{

	private Registro r;

	public AddController(Registro r) {
		super();
		this.r = r;
	}

	@Override
	public void doAction() {
		super.getV().getMessage();
		
	}

	public Registro getR() {
		return r;
	}
	

	
}
