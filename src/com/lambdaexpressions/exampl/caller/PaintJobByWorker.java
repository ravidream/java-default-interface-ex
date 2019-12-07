package com.lambdaexpressions.exampl.caller;

import com.lambdaexpressions.example.thirdparty.impl.BikePainter;
import com.lambdaexpressions.example.thirdparty.impl.CarPainter;
import com.lambdaexpressions.example.thirdparty.impl.HousePainter;

/**
 * 
 * @author ravi.thapa
 *
 */

public class PaintJobByWorker {

	public static void main(String[] args) {
		HousePainter housePainter = new HousePainter();
		
		housePainter.paint("Sky Blue");
		
		CarPainter carPainter = new CarPainter();
		carPainter.paint("Metalic Silver");
		
		BikePainter bikePainter = new BikePainter();
		bikePainter.paint("Black");
	}

}//end of the class
