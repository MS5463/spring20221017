package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex42")
public class Controller42 {
	
	@RequestMapping("sub")
	public void method00() {
		
	}
	
	@GetMapping(path = "sub01", produces = "text/plain") 
	public void method01() {
		System.out.println("/ex42/sub01 메소드 작동");
	}
	
	@GetMapping(path = "sub01", produces = "text/html") 
	public void method02() {
		System.out.println("/ex42/sub02 메소드 작동");
	}
}
