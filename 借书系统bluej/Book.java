 
import java.util.Scanner;


public class Book {
	public static Scanner inputScanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] bookStrings = {"数据结构", "c语音","操作系统", "英文"};
		String book;
		
		while(true){
			System.out.println("输入命令： 1-按照名称查找图书； 2-按照序号查找图书");
			try {
				int command = inputCommand();
				switch (command) {
				case 1:
					book = getbookByname(bookStrings);
					System.out.println("book:" + book);;
					break;
				case 2:
					book = getBookById(bookStrings);
					System.out.println("book:" + book);
					break;
				case -1:
					System.out.println("命令输入错误， 请根据提示输入数字命令！");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
	
	//按名称查找
	private static String getbookByname(String[] books) throws Exception {
		System.out.println("请输入图书名称");
		String nameString = inputScanner.next();
		for (int i = 0; i < books.length; i++) {
			if (nameString.equals(books[i]))
				return nameString;
		}
		throw new Exception("图书不存在");
	}
	
	//按序号查找
	private static String getBookById(String[] books) throws Exception {
		while (true) {
			System.out.println("请输入图书序号");
			try {
				int index = inputScanner.nextInt();
				if (index == -1) {
					System.out.println("命令行输入错误！请根据提示输入数字命令");
				}
				String bookString = books[index];
				return bookString;
			} catch (ArrayIndexOutOfBoundsException e) {
				Exception bookNotExists = new Exception("图书不存在");
				bookNotExists.initCause(e);
				throw bookNotExists;
			}
		}
	}
	
	//获得外键输入的选择
	private static int inputCommand() {
		int command;
		try {
			command = inputScanner.nextInt();
			return command;
		} catch (Exception e) {
			inputScanner = new Scanner(System.in);
			return -1;
		}
	}
}
