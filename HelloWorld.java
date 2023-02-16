//单行注释：只能注释后面一行的内容
/*
 * 多行注释
 * 可以注释多行的内容
 */
/**
 * 文档注释
 * 也可以注释多行的内容
 * 还可以将Java代码生成一份文档
 */
//声明（声明就是定义的意思）包名，表示当前这个类文件在哪个包里面
//必须写在Java代码的第一行
package day01;
//声明类名，类名必须和源文件名字保持一致
public class HelloWorld {
	//main方法或main函数（固定写法）
	//Java程序执行的入口，Java代码必须写在main函数里面
	public static void main(String[] args) {
		//System：系统，计算机
		//out：向外面
		//print：打印到控制台
		//ln：line换行
		//println：打印之后换行
		//""：双引号中的内容叫字符串
		System.out.println("HelloWorld"); 
		System.out.print("HelloWorld\n"); 
		System.out.println("HelloWorld\\n"); 
		System.out.println("第一行\n第二行"); 
	}
}
