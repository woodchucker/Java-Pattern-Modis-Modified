package _11EnumImpl;

import java.util.Scanner;

import _11EnumImpl.controllers.ActionController;
import _11EnumImpl.models.Registro;
import _11EnumImpl.views.View;

public class _11EnumImplMain {
	
	public static Scanner s = new Scanner(System.in); 

	public static void main(String[] args) {

		Registro r = new Registro();
		ActionController ac = new ActionController(r);
		View view = new View();
		view.subscribe(ac);
		while(true) {
			view.richiediInput();
		}

	}

}
