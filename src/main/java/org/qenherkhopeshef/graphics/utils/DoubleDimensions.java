/*
 * Created on 29 mai 2004
 *
 * This code is published under the LGPL.
 */
package org.qenherkhopeshef.graphics.utils;

import java.awt.geom.Dimension2D;

/**
 * DoubleDimensions
 * @author rosmord
 *
 *This code is published under the GNU LGPL.
 */
public class DoubleDimensions extends Dimension2D {

	private double height;
	private double width;
	
	/**
	 * Builds a dimension with the given width and height.
	 *
	 * @param width the width.
	 * @param height the height.
	 */
	public DoubleDimensions(double width, double height) {
		setSize(width, height);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.geom.Dimension2D#setSize(double, double)
	 */
	public void setSize(double width, double height) {
		this.width= width;
		this.height= height;
	}
	

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	public String toString() {
		return "("+ width + ", "+ height+ ")";
	}
}
