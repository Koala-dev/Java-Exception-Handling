package userDefinedException;

public class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1 = str2;
	}
	public String toString(){
		return ("Output String = " + str1);
	}
}
	class CustomException{
		public static void main(String args[]){
			try{
				throw new MyException("throwing user defined custom exception here.");
			}
			catch(MyException exp){
				System.out.println("Here is my catch block");
				System.out.println(exp);
			}
		}
	}

