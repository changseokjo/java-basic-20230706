package chapter3;

// Wrapper 클래스
// 기본형 데이터 타입을 참조형 데이터 타입으로 다루고자 할 때 사용할 수 있는 클래스

// 각 기본형 타입마다 참조형 타입의 클래스가 존재
// byte -> Byte / short -> Short / int -> Integer / long -> Long
// float -> Float / double -> Double
// char -> Character / boolean -> Boolean

public class Wrapper {

	public static void main(String[] args) {
		
		Integer integer1 = new Integer(100);
		Integer integer2 = 100;
		
		Double double1 = new Double(3.14);
		Double double2 = 3.148888;
		
		int int1 = integer1;
		double double3 = double2;
		
		String string1 = integer1.toString();
		System.out.println(string1);
		
		int int2 = Integer.parseInt(string1);
		System.out.println(int2);
		
		// 반올림
		System.out.println(Math.round(double3 * 100) / 100.0);

	}

}
