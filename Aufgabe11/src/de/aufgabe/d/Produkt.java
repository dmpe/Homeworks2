package de.aufgabe.d;

import java.util.Observable;
/**
 * @author Anastasia Baron
 * @author Dmitry Petrov
 */

public class Produkt extends Observable {
	int pNr;
	String pDescr;
	int holding;
	int minHolding;

	/**
	 * @param Produktnummer
	 * @param Produktbeschreibung
	 * @param Lagerbestand
	 * @param Mindestlagerbestand
	 */
	public Produkt(int pNr, String pDescr, int holding, int minHolding) {
		this.pNr = pNr;
		this.pDescr = pDescr;
		this.holding = holding;
		this.minHolding = minHolding;
	}

	/**
	 * @return the Produktnummer
	 */
	public int getpNr() {
		return pNr;
	}

	/**
	 * @param Produktnummer
	 *            the Produktnummer to set
	 */
	public void setpNr(int pNr) {
		this.pNr = pNr;
	}

	/**
	 * @return the Produktbeschreibung
	 */
	public String getpDescr() {
		return pDescr;
	}

	/**
	 * @param Produktbeschreibung
	 *            the Produktbeschreibung to set
	 */
	public void setpDescr(String pDescr) {
		this.pDescr = pDescr;
	}

	/**
	 * @return the Lagerbestand
	 */
	public int getHolding() {
		return holding;
	}

	/**
	 * @param Lagerbestand
	 *            the Lagerbestand to set
	 */
	public void setHolding(int holding) {
		this.holding = holding;
	}

	/**
	 * @return the Mindestlagerbestand
	 */
	public int getMinHolding() {
		return minHolding;
	}

	/**
	 * @param Mindestlagerbestand
	 *            the Mindestlagerbestand to set
	 */
	public void setMinHolding(int minHolding) {
		this.minHolding = minHolding;

	}

	/**
	 * eine Methode zur Reduktion des Lagerbestandes besitzen
	 * 
	 * @param amount
	 */
	public void removeProducts(int amount) {
		if (this.holding < amount) {
			throw new RuntimeException("Es ist zu wenig Lagerbestand vorhanden");
		}
		System.out.println("Der Lagerbestand ist um " + amount
				+ " Produkten reduziert.");
		this.holding = getHolding() - amount;
		setChanged();
		notifyObservers(amount);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produkt [pNr=" + pNr + ", "
				+ (pDescr != null ? "pDescr=" + pDescr + ", " : "")
				+ "holding=" + holding + ", minHolding=" + minHolding + "]";
	}
}
