package _06MyVisitor.Visitors;

import _06MyVisitor.models.AbstractMessage;
import _06MyVisitor.models.User;
import _06MyVisitor.observer.IObserver;
import _06MyVisitor.observer.Observable;

public class ActionVisitor implements IObserver{

	private String messageName;

	public void setMessage(AbstractMessage message){
		
	switch(messageName) {
	case "HelloMessage":
		message.visit(new HelloVisitor());
		break;
	case "ExitMessage":
		message.visit(new ExitVisitor());
		break;
	case "DefaultMessage":
		message.visit(new DefaultVisitor());
		break;
	}
		
		
		
	}

	@Override
	public void update(Observable obs) {
		this.messageName=( ((User)obs).getMessageName());
		setMessage( ((User)obs).getLastMessage() );
		
	}

}
