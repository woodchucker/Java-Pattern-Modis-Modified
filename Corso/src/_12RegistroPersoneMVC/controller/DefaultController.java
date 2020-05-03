package _12RegistroPersoneMVC.controller;

import _12RegistroPersoneMVC.constants.Azione;
import _12RegistroPersoneMVC.message.Message;
import _12RegistroPersoneMVC.model.Registro;

public class DefaultController extends Controller {
	
	public final Azione AZIONE = Azione.DEFAULT;

	public DefaultController(Message message, Registro registro) {
		super(message);
		if(message.getAzione() == AZIONE) registro.setOutput("Selezione non valida...");
	}

}
