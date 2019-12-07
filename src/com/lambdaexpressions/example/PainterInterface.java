package com.lambdaexpressions.example;

/**
 * 
 * @author ravi.thapa
 *
 */

public interface PainterInterface {
	public static final String TASKS_PERFORMED = "Base Primer coating is applied.";
	public void paint(String color);
	
	default String basePrimer(String task) {
		if(task != null)
			return task;
		else
		    return TASKS_PERFORMED;
	}
}//end of the interface
