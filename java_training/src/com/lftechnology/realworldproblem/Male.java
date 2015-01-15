package com.lftechnology.realworldproblem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents the male.
 * 
 * @author Nerisa Chitrakar nerisachitrakar@lftechnology.com
 * 
 */
public class Male extends Person {
	private static final Logger LOG = Logger.getLogger(Male.class.getName());

	public Male() {

	}

	public Male(String name) {
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
	 * @see com.lftechnology.realworldprobleHHm.Person#putOnShoes()
	 */
	public void putOnShoes() {
		LOG.log(Level.INFO, "{0} is putting on shoes", super.name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.realworldproblem.Person#gotoMovie()
	 * 
	 * @Override
	 */
	public void gotoMovie() {
		super.gotoMovie();
		LOG.log(Level.INFO, "{0} is going to a movie", super.name);
	}
}
