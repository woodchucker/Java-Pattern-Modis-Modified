package _10Enums;

public class _10EnumsMain {

	/*
	 * enum non è un oggetto, non è una classe ma ha caratteristiche comuni ad essi.
	 * enum è static const
	 * enum entità in memoria per trattare costanti
	 * 
	 * Creare un programma come quello mvc addPerson remPerson showPersons
	 * queste azioni possono essere trattate come delle const
	 * 
	 * Instanziare una classe astratta con un trucco
	 * 
	 * 
	 */
	

	public static void main(String[] args) {

		//System.out.println(Azione.ADD_PERSON.getNome());
		Azione.ADD_PERSON.esegui();
		Azione.SHOW_PERSONS.esegui();
		
		new Figura("cerchio") {
			// Tenere presente con gli enum questa implementazione "al volo"
			// che si autoistanziano quando parte il programma
			// essendo costanti il valore è stabilito ed immutabile fino alla fine del programma
			public int getArea() {
				return 0;
			}
		};

	}

}
