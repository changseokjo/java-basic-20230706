package chapter2;

class Human1 {
	String name;
	int age;
}

public class JVM {

	static void function(int age, Human1 you) {
		age = 30;
		you.age = 30;
	}
	
	public static void main(String[] args) {
		
		Human1 you = new Human1();
		you.name = "홍길동";
		you.age = 20;
		
		int age = 20;

		function(age, you);
		System.out.println(age);
		System.out.println(you.age);
	}

}
