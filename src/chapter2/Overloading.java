package chapter2;

// 오버로딩
// 같은 이름의 메서드를 여러 개 생성할 수 있도록 해주는 것

// 오버로딩 조건
// 이름이 같아야 함, 매개변수의 조합이 달라야함 (매개변수의 이름은 영향을 미치지 않음)
// 반환타입만 다를 경우 오버로딩이 성립하지 않음
// 같은 클래스 내에서만 발생

public class Overloading {
	
	// 물건 금액 입력하면 총 금액
	double purchase(int productPrice) {
		double sum = productPrice * 1.1;
		return sum;
	}
	
	double purchase(int productPrice, int product2Price) {
		double sum = (productPrice + product2Price) * 1.1;
		return sum;
	}
	
	double purchase(double productPrice, int product2Price) {
		double sum = (productPrice + product2Price) * 1.1;
		return sum;
	}
	
	double purchase(int productPrice, double product2Price) {
		double sum = (productPrice + product2Price) * 1.1;
		return sum;
	}
	
	// 매개변수의 이름은 오버로딩에 영향을 미치지 않음
//		double purchase(int Price) {
//			double sum = Price * 1.1;
//			return sum;
//		}
	
	// 반환타입은 오버로딩에 영향을 미치지 않음
//		int purchase(int productPrice) {
//			int sum = (int) (productPrice * 1.1);
//			return sum;
//		}
	
	///////////////////////////////////////
	
	// 메서드의 매개변수가 많아질때의 문제
	// 학생 : 학번, 이름, 나이, 전화번호, 수업, 성적
	static void studentInfoPrint(
			String studentNumber, String name, int age, String telNumber, String course, String grade) {
		System.out.println("학번 : " + studentNumber);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + telNumber);
		System.out.println("수업 : " + course);
		System.out.println("성적 : " + grade);
	}
	
	static void studentInfoPrint(Dto dto) {
		System.out.println("학번 : " + dto.studentNumber);
		System.out.println("이름 : " + dto.name);
		System.out.println("나이 : " + dto.age);
		System.out.println("전화번호 : " + dto.telNumber);
		System.out.println("수업 : " + dto.course);
		System.out.println("성적 : " + dto.grade);
	}
	
	///////////////////////////////////////
	
	public static void main(String[] args) {
		studentInfoPrint("12333455","홍길동", 30, "010-1111-1111", "경영학개론", "A+");
		
		Dto dto = new Dto();
		dto.studentNumber = "111122223";
		dto.name = "홍길동2";
		dto.age = 24;
		dto.telNumber = "010-2222-3333";
		dto.course = "경영학";
		dto.grade = "A";
		
		studentInfoPrint(dto);
		
	}

}

class Dto {
	String studentNumber; 
	String name; 
	int age; 
	String telNumber; 
	String course; 
	String grade;
}
