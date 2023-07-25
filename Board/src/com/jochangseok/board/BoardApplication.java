package com.jochangseok.board;

import java.util.Scanner;

import com.jochangseok.board.controller.UserController;
import com.jochangseok.board.controller.implement.UserControllerImplement;
import com.jochangseok.board.dto.request.SignUpRequestDto;
import com.jochangseok.board.dto.response.SignUpResponseDto;
import com.jochangseok.board.repository.UserRepository;
import com.jochangseok.board.repository.implement.UserRepositoryImplement;
import com.jochangseok.board.service.UserService;
import com.jochangseok.board.service.implement.UserServiceImplement;

//Com.회사명.프로젝트명
//  **Application.java

// - Controller (입 출력 / 입출력에 대한 검증)
// - Service (실제 비즈니스 로직)
// - Repository (데이터베이스 접근)

// - Dto (client - controller - service 간의 데이터 전송)
// - Entity (service - repository - database 간의 데이터 전송)

// - Provider (데이터 제공)
// - Handler (이벤트 발생 시 대처 혹은 작업)
// - Filter (서비스 이용 필터링)
// - Common / Util (기타 등등)


// 회원가입 기능
// - 이메일 주소, 비밀번호, 비밀번호 확인, 닉네임, 핸드폰번호, 주소, 상세 주소, 개인정보 동의여부

// 성공 (???)
// 실패
// - 중복된 이메일 (Service)
// - 이메일 포멧 불일치 (Controller)
// - 이메일 미입력 (Controller)

// - 비밀번호 길이 8자 이하 (Controller)
// - 비밀번호 불일치 (Controller)
// - 빈닉네임 (Controller)
// - 휴대폰번호 숫자아님 (Controller)
// - 휴대폰번호 미입력 (Controller)

// - 우편번호 입력안함 (Controller)
// - 개인정보동의 미체크 (Controller)

// - 휴대폰 번호 중복 (Service)
// - (닉네임 중복) (Service)

// - 데이터베이스 오류 (Service)

//-----------------------------------------
// 회원 (User)
// 이메일 / 비밀번호 / 닉네임 / 휴대폰번호 / 주소 / 상세주소 / 개인정보동의 여부 / 프로필 사진



// 게시물 (Board)
// 게시물 번호 / 제목 / 내용 / 작성일 / 작성자 이메일 / [작성자 닉네임] / 작성자 프로필 사진 / 댓글 수 / 좋아요 수 / 조회 수
// 게시물 이미지(여러개)
// 좋아요한 사용자의 프로필 사진 / [좋아요한 사용자의 이메일] / 댓글 작성자의 프로필 사진 / 댓글 작성자의 닉네임 / 댓글 작성 시간 / 댓글 내용


// 검색어 (SearchWord)
// 검색어 / 이전 검색어 / 다음 검색어


public class BoardApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		UserRepository userRepository = new UserRepositoryImplement();
		UserService userService = new UserServiceImplement(userRepository);
		UserController userController = new UserControllerImplement(userService);
		
		SignUpRequestDto dto = new SignUpRequestDto();
		
		System.out.println("이메일 : ");
		dto.setEmail(scanner.nextLine());
		System.out.println("비밀번호 : ");
		dto.setPassword(scanner.nextLine());
		System.out.println("비밀번호 확인 : ");
		dto.setPasswordCheck(scanner.nextLine());
		System.out.println("닉네임 : ");
		dto.setNickname(scanner.nextLine());
		System.out.println("전화번호 : ");
		dto.setTelNumber(scanner.nextLine());
		System.out.println("주소 : ");
		dto.setAddress(scanner.nextLine());
		System.out.println("상세주소 : ");
		dto.setAddressDetail(scanner.nextLine());
		System.out.println("개인정보 처리 동의 : ");
		dto.setAgreedPersonal(scanner.nextBoolean());
		
		SignUpResponseDto result = userController.signUp(dto);
		System.out.println(result.toString());

	}

}
