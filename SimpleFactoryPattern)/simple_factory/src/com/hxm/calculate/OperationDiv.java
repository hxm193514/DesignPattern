package com.hxm.calculate;

public class OperationDiv extends Operation {
	public double GetResult(){
    	double result = 0;
    	result = getNumberA() / getNumberB();
    	return result;
    }
}
