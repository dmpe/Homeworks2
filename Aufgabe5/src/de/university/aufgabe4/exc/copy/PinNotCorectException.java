package de.university.aufgabe4.exc.copy;

/**
 * @author Anastasia Baron
 * @author Dmitry Petrov
 */

public class PinNotCorectException extends MeineException {

	public PinNotCorectException() {
		System.out.println("");
		System.out.println("Sie haben falsches PIN eingeben.");
	}
}
