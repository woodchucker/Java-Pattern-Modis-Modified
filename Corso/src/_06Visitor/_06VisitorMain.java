package _06Visitor;

import _06Visitor.controllers.ActionController;
import _06Visitor.models.User;

public class _06VisitorMain {

	public static void main(String[] args) {
		
		User u = new User();
		ActionController ac = new ActionController();
		u.subscribe(ac);
		while(true) {
			//ac.setMessage(u.eseguiAzione());
			u.eseguiAzione();
			
		}
	}

}
