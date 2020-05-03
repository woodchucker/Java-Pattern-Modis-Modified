package _06MyVisitor.models;

import _06MyVisitor.IVisitor.IVisitor;

public class DefaultMessage extends AbstractMessage{

	@Override
	public void accept(IVisitor iv) {
		iv.visitDefaultMessage();
		
	}

}
