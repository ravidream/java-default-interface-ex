package com.lambdaexpressions.example.thirdparty.impl;

import com.lambdaexpressions.example.PainterInterface;

/**
 * 
 * @author ravi.thapa
 *
 */
public class CarPainter implements PainterInterface {

	@Override
	public void paint(String color) {
		System.out.println("Car paint job done in " + color + " Color.");		
	}

}//end of the class
