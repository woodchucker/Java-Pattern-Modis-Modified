package _09Reflection.controllers;

import _09Reflection.models.Oracolo;
import _09Reflection.utilities.Observable;
import _09Reflection.utilities.Observer;
import _09Reflection.views.View;

public class Controller implements Observer{

	private Oracolo oracolo;

	@Override
	public void update(Observable o) {
		
		String d = ((View) o).getInput();
		if (d.equals("exit")) {
			System.exit(0);
		}else {
			
			oracolo.getRandomResponse(d);
			//oracolo.addInDict(d);
		}
			
	}
	
	public Oracolo getOracolo() {
		return oracolo;
	}

	public void setOracolo(Oracolo oracolo) {
		this.oracolo = oracolo;
	}

	public Controller(Oracolo oracolo) {
		super();
		this.oracolo = oracolo;
	}
	
//	public void getResponse() {
//		oracolo.getRandomResponse();
//	}


}
