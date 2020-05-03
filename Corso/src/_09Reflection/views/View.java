package _09Reflection.views;

import java.util.Scanner;

import _09Reflection.models.Oracolo;
import _09Reflection.utilities.Observable;
import _09Reflection.utilities.Observer;

public class View extends Observable implements Observer {

	private static Scanner s = new Scanner(System.in);
	private String output;
	private String input;
	
	public void richiediInput() {
		System.out.println("Fai una domanda all'Oracolo");
		String domanda = s.nextLine();
		setInput(domanda);
	
	}
	
	
	public void mostraOutput() {
		System.out.println(this.getOutput());
	}
	
	@Override
	public void update(Observable o) {
		// La view deve ricevere una risposta dall'oracolo
		Oracolo or = ((Oracolo) o);
		setOutput(or.getOutput());
		mostraOutput();
		System.out.println(or.getSize());
		if(or.getSize() == 0) {
			System.out.println(or.getArrivederci());
			System.exit(0);
		}
	}
	
	public String getInput() {
		return input;
	}


	public void setInput(String input) {
		this.input = input;
		notifyObservers(this);
	}



	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
}
