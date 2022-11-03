package org.zerock.controller.lecture.p09fetch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean24;
import org.zerock.domain.lecture.JavaBean25;
import org.zerock.domain.lecture.JavaBean26;
import org.zerock.domain.lecture.JavaBean27;

@Controller
@RequestMapping("ex45")
public class Controller45 {

	@RequestMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	public ResponseEntity method01() {
//		return ResponseEntity.ok().build();
//		return ResponseEntity.badRequest().build();
//		return ResponseEntity.notFound().build();
		
		System.out.println("01 메소드 작동");
		
		return ResponseEntity.status(500).build();
	}
	
	@GetMapping("sub02")
	public ResponseEntity method02() {
//		return ResponseEntity.status(202).build();
		
		System.out.println("02 메소드 작동");
		
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("sub03")
	public ResponseEntity method03() {
		
		System.out.println("03 메소드 작동");
		
		return ResponseEntity.ok()
				.header("My-Header", "My-Value")
				.build();
	}
	
	@GetMapping("sub04")
	public ResponseEntity method04() {
		
		System.out.println("04 메소드 작동");
		
		return ResponseEntity.ok()
				.header("Your-Header", "Your-Value")
				.build();
	}
	
	@GetMapping("sub05")
	public ResponseEntity<String> method05() {
		
		System.out.println("05 메소드 작동");
		
		return ResponseEntity.ok()
				.header("Content-Type", "text/plain;charset=UTF-8")
				.body("hello world!");
	}
	
	@GetMapping("sub06")
	public ResponseEntity<JavaBean24> method06() {
		JavaBean24 data = new JavaBean24();
		data.setLocation("seoul");
		data.setSince("2000 Year");
		
		System.out.println("06 메소드 작동");
		
		return ResponseEntity.ok()
				.body(data);
	}
	
	@GetMapping("sub07")
	public ResponseEntity<JavaBean20> method07() {
		JavaBean20 data = new JavaBean20();
		data.setName("son");
		data.setAddress("seoul");
		
		System.out.println("07 메소드 작동");
		
		return ResponseEntity.ok(data);
				
	}
	
	@GetMapping("sub08")
	public ResponseEntity<JavaBean27> method08() {
		JavaBean27 data = new JavaBean27();
		data.setName("son");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		System.out.println("08 메소드 작동");
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub09")
	public ResponseEntity<JavaBean25> method09() {
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		
		data.setInfo(sub);
		data.setAge(99);
		
		System.out.println("09 메소드 작동");
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub10")
	@ResponseBody
	public JavaBean25 method10() {
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		
		data.setInfo(sub);
		data.setAge(99);
		
		System.out.println("10 메소드 작동");
		
		return data;
	}
	
	// sub11 요청경로
	// JavaBean27을 JSON으로 변경한 응답하는 메소드 작성
	// @Responsebody 사용
	@GetMapping("sub11")
	@ResponseBody
	public JavaBean27 method11() {
		JavaBean27 data = new JavaBean27();
		data.setName("Back");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		System.out.println("11 메소드 작동");
		
		return data;
	}
	
	@GetMapping("sub12")
	@ResponseBody
	public String method12() {
		
		System.out.println("12 메소드 작동");
		
		return "hello world!";
	}
	
}

















