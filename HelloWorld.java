 
public class HelloWorld {
	static String Hello = "Hello World";
	public static String getHello() {
		return Hello;
	}
	public static void setHello(String hello) {
		Hello = hello;
	}
	public int displayValue() {
		return 1;
	}
	public void vmain() {
       System.out.print(Hello);
    }
  }