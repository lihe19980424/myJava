package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunTimeExceptionDemo {
	
	
	// 声明异常
	public void test() throws FileNotFoundException {
		// 受检异常
		FileReader f3 = new FileReader("E://hello.txt");
	}
	

	public static void main(String[] args)  {
		try {
			new RunTimeExceptionDemo().test();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		System.out.println(1/0);
		
		// 受检异常
		try {
			String str = "你好";
			Integer.parseInt(str);
			FileReader f2 = new FileReader("E://hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println("原因:未找到文件"+e.getCause());
		} catch(NumberFormatException e) {
			System.out.println("字符形式异常"+e.getCause());
		} finally {
			System.out.println("finally");
		}
		System.out.println("hello");
	}
}
