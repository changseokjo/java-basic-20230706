package chapter2;

import chapter2_1.Modifier2;

// 제어자 : 클래스, 메서드, 변수에 부가적인 성질을 추가하는 키워드
// 접근제어, 일반제어자(비접근제어자)

// 접근제어자 : 클래스, 메서드, 변수에 대한 접근 위치 제어
// public - 모든 곳에서 접근 가능
// protected - 같은 패키지 내부 혹은 상속받은 클래스에서만 접근 가능
// default - 같은 패키지 내부에서 접근 가능
// private - 클래스 내부에서 접근 가능

// 비접근제어자(일반제어자) : 접근에 대한 제어가 아닌 동작에 대한 제어
// final - 클래스, 메서드, 변수에서 사용 가능 / 클래스에서 사용하면 확장 불가능, 메서드에서 사용하면 오버라이딩 불가능, 변수에서 사용하면 재할당 불가능
// static - 메서드, 변수에서 사용 가능 / 인스턴스 생성 없이 클래스 단위로 접근 가능하도록 함
// abstract - 클래스, 메서드 / 메서드에서 사용하면 추상(구현부가 없는) 메서드를 의미, 클래스에서 사용하면 추상메서드를 포함하고 있는 클래스임을 의미
final class FinalClass {
	int member;
	
}

class SuperClass {
	final int member1;
	
	static int member2;
	
	void method1() {
		member1 = 10;
	}
	
	static void method2() {
		
	}
}

class SubClass extends SuperClass {
	
	@Override
	final void method1() {
		
	}
	
}

class Modifier3 extends Modifier2{
	
	String defaultVariable;
	private String privateVariable;
	
	void method1() {
		super.protectedVariable = "protected";
		super.defaultVariable = "default";
		super.privateVariable = "private";
		this.privateVariable = "private";
	}
}

// 캡슐화 : 무결성 보장
class Medicine1 {
	private int kp;
	private int usp;
	
	Medicine1(int kp, int usp){
		this.kp = kp;
		this.usp = usp;
	}
	
	int getKp() {
		return this.kp;
	}
	
	int getUsp() {
		return this.usp;
	}
	
	void setKp(int kp) {
		this.kp = kp;
	}
	
	void setUsp(int usp) {
		this.usp = usp;
	}
}

public class Modifier {

	public static void main(String[] args) {
		Modifier2 instance1 = new Modifier2();
		instance1.publicVariable = "public";
		instance1.protectedVariable = "protected";
		instance1.defaultVariable = "default";
		instance1.privateVariable = "private";
		
		Modifier3 instance2 = new Modifier3();
		instance2.protectedVariable = "protected";
		instance2.defaultVariable = "default";
		instance2.privateVariable = "private";

		SuperClass.member2 = 10;
		SuperClass.method2();
		
		Medicine1 medicine1 = new Medicine1(300,250);
		
		System.out.println(medicine1.getKp());
		System.out.println(medicine1.getUsp());
		
		medicine1.setKp(200);
		medicine1.setUsp(150);
		
	}

}
