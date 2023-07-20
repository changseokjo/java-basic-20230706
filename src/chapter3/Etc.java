package chapter3;

// 열거형 타입 (enum)
// 제한된 선택을 하도록 강제하는 타입

enum Gender {
	MALE, FEMALE
}


public class Etc {

//	static void printGender(String gender) {
//		if (gender.equals(Gender.MALE)) {
//			System.out.println("남자입니다.");
//		}
//		if (gender.equals(Gender.FEMALE)) {
//			System.out.println("여자입니다.");
//		}
//	}
	
	static void printGender(String gender) {
		if (gender.equals(Gender.MALE)) {
			System.out.println("남자입니다.");
		}
		if (gender.equals(Gender.FEMALE)) {
			System.out.println("여자입니다.");
		}
	}
	
	public static void main(String[] args) {
		
		printGender("");

	}

}
