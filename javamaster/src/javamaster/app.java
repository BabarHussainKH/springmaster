package javamaster;


public class app {
	
	{
		System.out.println("initializer");
	}	
	
	static {
		System.out.println("static block");
		String[] arr = new String[0];
		main(arr);
		main("");
		main(arr, 0);
	}
	
	public static void main(String[] args) {
		System.out.println("App stared....");
	}
	
	public static void main(String args) {
		System.out.println("string - App stared...");
	}
	
	public static void main(String[] args, int a) {
		System.out.println("array, int App stared...");
	}
	
	public static void main(String[] args, double t) {
		System.out.println("App stared...");
	}

}
