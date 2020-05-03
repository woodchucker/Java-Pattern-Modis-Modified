package _12RegistroPersoneMVC.view;

import _12RegistroPersoneMVC._12RegistroPersoneMVCMain;
import _12RegistroPersoneMVC.constants.Azione;
import _12RegistroPersoneMVC.message.Message;
import _12RegistroPersoneMVC.model.Registro;
import _12RegistroPersoneMVC.utils.Observable;
import _12RegistroPersoneMVC.utils.Observer;

public class View extends Observable implements Observer{

	private Message message;
	private Registro registro; //read only copy

	public void richiediInput() {

		mostraMenu();
		inserisciAzione();

	}

	private void inserisciAzione() {
		
		int n = -1;
		try{
			n = Integer.parseInt(_12RegistroPersoneMVCMain.s.nextLine());
		}catch (NumberFormatException e) {
			
		}
		

		for (Azione a : Azione.values()) {
			if (a.getNumber() == n) {
				Message m = a.eseguiAzione();
				setMessage(m);
				return;
			}
		}
		
		setMessage(Azione.DEFAULT.eseguiAzione());

	}

	private void mostraMenu() {
		System.out.println("Seleziona azione:");
		for (Azione a : Azione.values()) {
			if(a != Azione.DEFAULT)
			System.out.println(a.getNumber() + "] " + a.getDescrizione());
		}
	}

	public void mostraOutput() {
		System.out.println(registro.getOutput());
		if(registro.isRichiestaUscita()) System.exit(0);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
		notifyObservers(this);
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	@Override
	public void update(Observable o) {
		setRegistro((Registro)o);
	}

}
