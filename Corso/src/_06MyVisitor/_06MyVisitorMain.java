package _06MyVisitor;

import _06MyVisitor.Visitors.ActionVisitor;
import _06MyVisitor.models.User;

public class _06MyVisitorMain {

	public static void main(String[] args) {
		User u = new User();
		ActionVisitor ac = new ActionVisitor();
		u.subscribe(ac);
		while (true) {
			// ac.setMessage(u.eseguiAzione());
			u.eseguiAzione();
		}
	}
}
