package _06MyVisitor.models;

import java.util.Scanner;
import _06MyVisitor.observer.Observable;


public class User extends Observable{
	private final Scanner s = new Scanner(System.in);
	private String name;
	private String messageName;
	private AbstractMessage lastMessage;

	public void eseguiAzione() {
		System.out.println("Seleziona un azione: 1 Hello, 0 Exit");
		
		int i = Integer.parseInt(s.nextLine());
		switch (i) {
		case 0:
			setMessageName("ExitMessage");
			setLastMessage(new ExitMessage());
			break;
		case 1:
			setMessageName("HelloMessage");
			System.out.println("Inserisci il nome utente");
			setName(s.nextLine().trim());
			//setName("pippo");
			setLastMessage(new HelloMessage(name));
			break;
		default:
			setMessageName("DefaultMessage");
			setLastMessage(new DefaultMessage());
			break;
		}
		
	}

	public AbstractMessage getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(AbstractMessage lastMessage) {
		this.lastMessage = lastMessage;
		emit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
}

