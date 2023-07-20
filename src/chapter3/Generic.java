package chapter3;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

class A {

	int a;
	
}

class B extends A {
	int b;
}

class C extends A {
	int c;
}

class Result<Type> {
	String code;
	String message;
	String name;
	Type age;
	
	void print() {
		System.out.println("안녕");
	}
	
	<Parameter> void print(Parameter parameter) {
		
	}

}

public class Generic {
	
	List<? extends Comparable> createList(int number, boolean flag) {
		if (flag) {
			List<Integer> list = new ArrayList<Integer>();
			for (int index = 0; index < number; index++) {
				list.add(index);
			}
			return list;
		} else {
			List<String> list = new ArrayList<String>();
			for (int index = 0; index < number; index++) { 
				list.add(Integer.toString(index));
			}
			return list;
		}
	}

	public static void main(String[] args) {
		
		List<?> list = new ArrayList<String>();
		
		
		
		
	}

}
