package _12RegistroPersoneMVC.controller;

import _12RegistroPersoneMVC.constants.Azione;
import _12RegistroPersoneMVC.message.Message;
import _12RegistroPersoneMVC.model.Persona;
import _12RegistroPersoneMVC.model.Registro;

public class ListPersonaController extends Controller {

	public final Azione AZIONE = Azione.LIST_PERSONA;
	
	public ListPersonaController(Message message, Registro registro) {
		super(message);
		if(AZIONE == message.getAzione()) {
			String out = "";
			
			for(Persona p: registro.getPersone()) {
				out += p.toString() + "\n";
			}
			
			registro.setOutput(out);
		}
	}

}
