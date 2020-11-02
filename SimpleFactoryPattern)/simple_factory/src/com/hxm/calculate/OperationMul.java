package com.hxm.calculate;

public class  OperationMul extends Operation  {
	public double GetResult(){
    	double result = 0;
    	result = getNumberA() * getNumberB();
    	return result;
    }
}
