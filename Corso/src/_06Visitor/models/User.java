package _06Visitor.models;

import java.util.Scanner;

import _06Visitor.messages.DefaultMessage;
import _06Visitor.messages.ExitMessage;
import _06Visitor.messages.HelloMessage;
import _06Visitor.messages.Message;
import _06Visitor.utilities.Observable;

public class User extends Observable{
	private final Scanner s = new Scanner(System.in);
	//private String name;
	private Message lastMessage;

	public void eseguiAzione() {
		System.out.println("Seleziona un azione: 1 Hello, 0 Exit");
		
		int i = Integer.parseInt(s.nextLine());
		switch (i) {
		case 0:
			setLastMessage(new ExitMessage());
			break;
		case 1:
			setLastMessage(new HelloMessage());
			break;
		default:
			setLastMessage(new DefaultMessage());
			break;
		}
		
	}

	public Message getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(Message lastMessage) {
		this.lastMessage = lastMessage;
		emit(this);
	}
}
