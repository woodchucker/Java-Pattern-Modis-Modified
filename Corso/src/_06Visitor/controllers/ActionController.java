package _06Visitor.controllers;

import _06Visitor.messages.Message;
import _06Visitor.models.User;
import _06Visitor.utilities.Observable;
import _06Visitor.utilities.Observer;

public class ActionController implements Observer{

	public void setMessage(Message message){
		
		message.visit(new HelloController(), new ExitController(), new DefaultController());
	}

	@Override
	public void update(Observable obs) {
		setMessage( ((User)obs).getLastMessage() );
		
	}

}
