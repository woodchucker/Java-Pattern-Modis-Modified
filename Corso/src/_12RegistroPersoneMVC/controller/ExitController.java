package _12RegistroPersoneMVC.controller;

import _12RegistroPersoneMVC.constants.Azione;
import _12RegistroPersoneMVC.message.Message;
import _12RegistroPersoneMVC.model.Registro;

public class ExitController extends Controller {
	
	public final Azione AZIONE = Azione.EXIT;

	public ExitController(Message message, Registro registro) {
		super(message);
		if(AZIONE == message.getAzione()) {
			registro.setRichiestaUscita(true);
			registro.setOutput("Arrivederci.");
		}
	}

}
