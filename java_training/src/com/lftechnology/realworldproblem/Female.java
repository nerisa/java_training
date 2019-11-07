package com.lftechnology.realworldproblem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Female extends Person {
	private static final Logger LOG = Logger.getLogger(Female.class.getName());

	public Female() {

	}

	public Female(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.realworldproblem.Person#wearClothes()
	 */
	public void wearClothes() {
		LOG.log(Level.INFO, "{0} is wearing clothes", super.name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.realworldproblem.Person#putOnShoes()
	 */
	public void putOnShoes() {
		LOG.log(Level.INFO, "{0} is putting on shoes", super.name);
	}

	/**
	 * This method simulates the act of putting on makeup by a female
	 * 
	 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
	 */
	public void putOnMakeup() {
		LOG.log(Level.INFO, "{0} is putting on makeup", super.name);
	}

	public void gotoMovie() {
		super.gotoMovie();
		putOnMakeup();
		LOG.log(Level.INFO, "{0} is going to a movie", super.name);
	}
}
