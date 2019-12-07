package com.lambdaexpressions.example.thirdparty.impl;

import com.lambdaexpressions.example.PainterInterface;

/**
 * 
 * @author ravi.thapa
 *
 */

public class HousePainter implements PainterInterface {

	@Override
	public void paint(String color) {
		System.out.println(basePrimer(null));
		System.out.println("House Painting is done in  " + color + " Color.");		
	}

}//end of the class
