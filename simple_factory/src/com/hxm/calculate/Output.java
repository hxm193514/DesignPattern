package com.hxm.calculate;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Operation oper;
         oper = OperationFactory.createOperate("-");
         oper.setNumberA(2);
         oper.setNumberB(3);
         double result = oper.GetResult();
         System.out.print(result);
	}

}
