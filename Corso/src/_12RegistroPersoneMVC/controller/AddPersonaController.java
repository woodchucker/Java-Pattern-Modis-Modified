package _12RegistroPersoneMVC.controller;

import _12RegistroPersoneMVC.constants.Azione;
import _12RegistroPersoneMVC.message.Message;
import _12RegistroPersoneMVC.model.Registro;

public class AddPersonaController extends Controller {

	public final Azione AZIONE = Azione.ADD_PERSONA;

	public AddPersonaController(Message message, Registro registro) {
		super(message);
		if (AZIONE == message.getAzione()) {
			registro.addPersona(message.getPersona());
			registro.setOutput("persona " + message.getPersona() + " aggiunta correttamente!");

		}
	}

}
