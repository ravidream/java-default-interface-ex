package com.lambdaexpressions.example.thirdparty.impl;

import com.lambdaexpressions.example.PainterInterface;

/**
 * 
 * @author ravi.thapa
 *
 */

public class BikePainter implements PainterInterface {

	@Override
	public void paint(String color) {
		System.out.println("Bike paint job done in " + color + " color.");
	}

}//end of the class
