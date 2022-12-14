package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex40")
public class Controller40 {
	
	@RequestMapping("sub00")
	public void method00() {
		// jsp로 forward
	}
	
	@GetMapping("sub01")
	public void method01() {
		System.out.println("/ex40/sub01 get 방식 요청 잘 받음");
	}
	
	@GetMapping("sub02")
	public void method02() {
		System.out.println("/ex40/sub02 get 방식 요청 잘 받음");
	}
	
	@PostMapping("sub03")
	public void method03() {
		System.out.println("/ex40/sub03 post 방식 요청 잘 받음");
	}
	
	@GetMapping("sub04")
	public void method04() {
		System.out.println("/ex40/sub04 get 방식 요청 잘 받음");
	}
	
	@PostMapping("sub04")
	public void method05() {
		System.out.println("/ex40/sub04 post 방식 요청 잘 받음");
	}
	
//	@RequestMapping(path = "sub04", method = RequestMethod.PUT) 
	@PutMapping("sub04") // PUT 방식만 받음
	public void method06() {
		System.out.println("/ex40/sub04 put 방식 요청 잘 받음");
	}
	
//	@RequestMapping(path = "sub04", method = RequestMethod.DELETE)
	@DeleteMapping("sub04") // DELETE 방식만 받음
	public void method07() {
		System.out.println("/ex40/sub04 delete 방식 요청 잘 받음");
	}
	
	@GetMapping("sub05")
	public void method08() {
		System.out.println("/ex40/sub05 get 방식 요청 잘 받음");
	}
	
	@PostMapping("sub05")
	public void method09() {
		System.out.println("/ex40/sub05 post 방식 요청 잘 받음");
	}
	
	@PutMapping("sub05")
	public void method10() {
		System.out.println("/ex40/sub05 put 방식 요청 잘 받음");
	}
	
	@DeleteMapping("sub05")
	public void method11() {
		System.out.println("/ex40/sub05 delete 방식 요청 잘 받음");
	}
}




















