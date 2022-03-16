# JAVA的泛型
## 概念
  Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。

  **泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。**
## 泛型方法

  * 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前
  * 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型   类型名称的标识符。
  * 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
### java中的泛型标记符 
    * E - Element (在集合中使用，因为集合中存放的是元素)
    * T - Type（Java 类）
    * K - Key（键）
    * V - Value（值）
    * N - Number（数值类型）
    * ？ - 表示不确定的 java 类型 
## 实例
		public class GenericMethodTest
		{
		   // 泛型方法 printArray                         
		   public static < E > void printArray( E[] inputArray )
		   {
		      // 输出数组元素            
		         for ( E element : inputArray ){        
		            System.out.printf( "%s ", element );
		         }
		         System.out.println();
		    }
		 
		    public static void main( String args[] )
		    {
		        // 创建不同类型数组： Integer, Double 和 Character
		        Integer[] intArray = { 1, 2, 3, 4, 5 };
		        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		 
		        System.out.println( "整型数组元素为:" );
		        printArray( intArray  ); // 传递一个整型数组
		 
		        System.out.println( "\n双精度型数组元素为:" );
		        printArray( doubleArray ); // 传递一个双精度型数组
		 
		        System.out.println( "\n字符型数组元素为:" );
		        printArray( charArray ); // 传递一个字符型数组
		    } 
		}
##参考链接
  [菜鸟教程](https://www.runoob.com/markdown/md-code.html)  

  ![图标](http://static.runoob.com/images/runoob-logo.png)