package com.test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
		int result = tct.test();
		System.out.println("this is the end of test(), result value equals:" + result);
	}

	public int test(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider--;
				result = result +100/divider;
						
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Warning: caught an exception");
			return result = 999;
		}finally{
			System.out.println("The finally statement is executed, result value:" + result);
		}
		return result;
	}
}
