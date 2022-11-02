package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex43")
public class Controller43 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	public void method01(String name, String address) {
		System.out.println("첫번째 메소드 작동");
		System.out.println(name);
		System.out.println(address);
	}
	
	@GetMapping("sub02")
	public void method02(String email, Integer age) {
		System.out.println("두번째 메소드 작동");
		System.out.println(email); // null이 아님
		System.out.println(age); // null이 아님
	}
	
	@GetMapping("sub03")
	public void method03(String name, String email) {
		System.out.println("세번째 메소드 작동");
		System.out.println(name);
		System.out.println(email);
	}
	
	@GetMapping("sub04")
	public void method04(String address, Integer age) {
		System.out.println("네번째 메소드 작동");
		System.out.println(address); // null이 아님
		System.out.println(age); // null이 아님
	}
	
	@PostMapping("sub05")
	public void method05(String address, Integer age) {
		System.out.println("다섯번째 메소드 작동");
		System.out.println(address);
		System.out.println(age);
	}
	
	@PostMapping("sub06")
	public void method06(String name, String email) {
		System.out.println("여섯번째 메소드 작동");
		System.out.println(name); // null이 아님
		System.out.println(email); // null이 아님
	}
	
	@PostMapping("sub07")
	public void method07(String name, String email) {
		System.out.println("일곱번째 메소드 작동");
		System.out.println(name); 
		System.out.println(email); 
	}
	
	@PostMapping("sub08")
	public void method08(String address, Integer age) {
		System.out.println("여덝번째 메소드 작동");
		System.out.println(address);
		System.out.println(age);
	}
}












