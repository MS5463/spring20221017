package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {
	
	@GetMapping("sub01")
	public void method01() {
		System.out.println("method01");
	}
	
	@GetMapping(value = "sub01", params = "name")
	public void method02() {
		System.out.println("method02");
	}
	
	// get 방식
	// sub02 경로
	@GetMapping("sub02")
	public void method03() {
		System.out.println("method03");
	}
	
	// get 방식
	// sub02 경로
	// address request param
	@GetMapping(path = "sub02", params = "address")
	public void method04() {
		System.out.println("method04");
	}
	
	// address값이 반드시 seoul일 것
	@GetMapping(path = "sub03", params = "address=seoul")
	public void method05() {
		System.out.println("method05");
	}
	
	@GetMapping(path = "sub03")
	public void method06() {
		System.out.println("method06");
	}
	
	@GetMapping("sub04")
	public void method07() {
		System.out.println("method07");
	}
	
	@GetMapping(path = "sub04", params = {"name", "age"})
	public void method08() {
		System.out.println("method08");
	}
}
















