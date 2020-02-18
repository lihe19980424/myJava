package string;

public class StringDemo {

	/**
	 * String = final char[];
	 * String str = "hello";
	 * str = "helloworld";
	 */
	/**
	 * equals比较内容
	 */
	String str = " hel lo ";
	public void word() {
		// 根据下表取字符
		char charAt = str.charAt(1);
		System.out.println(charAt);
		// length() 
		int length = str.length();
		System.out.println(length);
		// trim();去掉前后的空格
		String trim = str.trim();
		System.out.println(trim);
		//转为大写字符
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		// indexOf()
		int indexOf = str.indexOf("e");
		System.out.println(indexOf);
		// endsWith()
		boolean endsWith = str.endsWith(" ");
		System.out.println(endsWith);
		// substring();取出指定位置的字符（左开右闭）
		String substring = str.substring(1,4);
		System.out.println(substring);
		// toCharArray();字符串转换为字符数组
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// char[]字符数组转换为字符串
		char[] c = {'a','b','c'};
		String string = new String(c);
		System.out.println(string);
		//字符数组的值存放到字符串中
		String valueOf = String.valueOf(c);
		System.out.println(valueOf);
		//
		String valueOf2 = String.valueOf(5);
		System.out.println(valueOf2);
	}

	public static void main(String[] args) {
		new StringDemo().word();
	}
} 