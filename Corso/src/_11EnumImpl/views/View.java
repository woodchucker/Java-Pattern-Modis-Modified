package _11EnumImpl.views;


import _11EnumImpl._11EnumImplMain;
import _11EnumImpl.enums.Action;
import _11EnumImpl.message.Message;
import _11EnumImpl.utilities.Observable;

public class View extends Observable{ 
	private Message message;
	

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
		notifyObservers(this);
	}

	public void richiediInput() {
		printOptions();
		int i = Integer.parseInt(_11EnumImplMain.s.nextLine());
		//TODO
		for(Action a: Action.values()) {
			if(i == a.getOption()) {
				Message m = a.doAction();
				this.setMessage(m);
			}
		}
		
		
		
	}
	

	
	public void printOptions() {
		System.out.println("Scegli un'azione: ");
		
		for (Action a: Action.values()) {
			System.out.println(a.getOption() + " " + a.getLabel());
		}

	}

	
}
