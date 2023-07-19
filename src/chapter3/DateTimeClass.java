package chapter3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// 날짜 및 시간 표현 방법
// 1. System.currentTimeMillis();
// 2. Date 클래스
// 3. Calendar 클래스
// 4. LocalDateTime 클래스


public class DateTimeClass {

	public static void main(String[] args) {
		
		// 1. System.currentTimeMillis();
		// 현재 운영체제의 시간을 1970년 1월 1일 0시 0분 0초 0밀리초 기준으로 경과한 시간을
		// 밀리초 기준으로 표현
		// 반환 타입 : long
		
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : " + start);
		
//		for (int index = 0; index < 10_000_000; index++) {
//			System.out.println("출력중...");
//		}
		
		long end = System.currentTimeMillis();
		System.out.println("종료 시간 : " + end);
		
		System.out.println("경과 시간 : " + (end - start));
		
		// 2. Date 클래스
		// 초창기 자바에서부터 사용되어 오던 날짜 및 시간 관련 클래스
		// JDK 1.0 ~ JDK 1.1 -> 사용하지 않는 것을 권장하고 있음.
		// 날짜를 표시하는 타입에서 사용됨
		
		Date date = new Date();
		System.out.println(date);
		
		date = new Date(123, 7, 1, 10, 10, 10);
		System.out.println(date);
		
		int year = 0;
		int month = 0;
		int dates = 0;
		year = date.getYear();
		month = date.getMonth();
		dates = date.getDate();
		System.out.println(year + " " + month + " " + dates);
		
		// 3. Calendar 클래스
		// Date 클래스를 대체하기 위해 나온 클래스, 추상 클래스 (GregorianCalendar 클래스 사용, getInstance() 메서드 사용)
		// JDK 8 버전까지 사용되었음 - LocalDateTime으로 대체되었음
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar);
		
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		dates = calendar.get(Calendar.DATE);

		System.out.println(year + " " + month + " " + dates);
		
		calendar.set(Calendar.YEAR, 2001);
		year = calendar.get(Calendar.YEAR);
		System.out.println(year + " " + month + " " + dates);
		
		// SimpleDateFormat 클래스
		// Date 타입의 인스턴스를 문자열로 표현하는 클래스
		// y : 연도 , M : 월 , d : 일 , h : 시간 , m : 분 , s : 초
		// a : 오전/오후 , E : 요일
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(new Date()));
	}

}
