package string;
import toString.*;
import java.util.ArrayList;

public class StringBufferDemo {


	public static void main(String[] args) {
		// String = final char[]   都不能填充对象
		// StringBuffer ---> char[]都不能填充对象
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("hello").append("word").append("nihao");
		System.out.println(stringBuffer);
		//删除
		StringBuffer delete = stringBuffer.delete(1, 8);
		System.out.println(delete);
		//插入
		StringBuffer insert = stringBuffer.insert(0, "today");
		System.out.println(insert);
		//将指定部分替换为新内容
		StringBuffer replace = stringBuffer.replace(1, 5, "friday");
		System.out.println(replace);
		//反转stringBuffer的内容
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println(reverse);
		System.out.println(stringBuffer.reverse());

		// stringBuilder用法和stringBuffer 99%
		// synchronized比stringBuffer效率更高
		StringBuilder stringBuilder = new StringBuilder();

		// 集合
		// List
		// 泛型
		//添加
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student = new Student("郭德纲", 500, 50, "讲段子");
		arrayList.add(new Student("李四", 500, 50, "喝酒"));
		arrayList.add(student);
		arrayList.add(new Student("于谦", 500, 50, "烫头"));
		arrayList.add(new Student("孟鹤堂", 500, 50, "被队友怼"));
		arrayList.add(new Student("烧饼", 500, 50, "吃烧饼"));
		System.out.println(arrayList);
		//删除
		arrayList.remove(student);
		System.out.println(arrayList);
		//修改
		arrayList.set(0, new Student("周润发", 500, 50, "喝酒"));
		System.out.println(arrayList);
	}
}