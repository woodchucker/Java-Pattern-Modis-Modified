package _11EnumImpl.message;

import _11EnumImpl.models.Persona;

public class Message {
	private Persona persona;
	private int option;
	public Persona getPersona() {
		
		return persona;
	};
	
	public void setPersona(Persona p) {
		persona = p;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	
	


}
