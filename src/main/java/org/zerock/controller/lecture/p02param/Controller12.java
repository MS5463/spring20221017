package org.zerock.controller.lecture.p02param;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex12")
public class Controller12 {
	// /ex12/sub01?city=seoul&city=ny&city=tokyo
	@RequestMapping("sub01")
	private void method1(@RequestParam("city") String city) {
		// ,로 구분되 값
		System.out.println(city);
	}

	// /ex12/sub02?city=seoul&city=ny&city=tokyo
	@RequestMapping("sub02")
	private void method2(@RequestParam("city") String[] city) {
		// 배열로
		System.out.println(city.length);
		System.out.println(Arrays.toString(city));
	}

	// /ex12/sub03?city=seoul&city=ny&city=tokyo
	@RequestMapping("sub03")
	private void method3(@RequestParam("city") List<String> city) {

		// java.util.List
		System.out.println(city.size());
		System.out.println(city);
	}

	// 위 3개의 @requestParam value attribute 생략 가능

	// /ex12/sub04
	@RequestMapping("sub04")
	public void metod04(String name,
						String address,
						int age,
						String email,
						String password) {
		System.out.println("method 04");
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(email);
		System.out.println(password);
	}

}
