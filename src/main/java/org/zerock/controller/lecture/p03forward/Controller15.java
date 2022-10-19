package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {

	// ex15/sub01
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("메소드 1번 작동");
	}

	// sub02 요청
	// /WEB-INF/views/ex15/sub02.jsp로 포워드
	@RequestMapping("sub02")
	public void method02() {

	}

	@RequestMapping("sub03")
	public String method03() {
		// void처럼 default view name을 사용해서 view로 포워드
		return null;
	}

	// sub04 요청
	// /WEB-INF/views/ex15/sub04.jsp로 포워드
	@RequestMapping("sub04")
	public String method04() {
		return null;
	}

	// sub05 요청
	// name request param이 있으면
	// /WEB-INF/views/ex15/sub05_1.jsp로 포워드
	// name request param이 없으면
	// /WEB-INF/views/ex15/sub05.jsp로 포워드
	@RequestMapping("sub05")
	public String method05(String name) {
		if (name == null) {
			return null;
		}
		return "ex15/sub05_1.jsp";
	}

	// sub06 요청
	// address request param이 있으면
	// /WEB-INF/views/ex15/sub06_1.jsp로 forward
	// address request param이 없으면
	// /WEB-INF/views/ex15/sub06.jsp로 forward
	@RequestMapping(path = "sub06", params = "address")
	public String method06() {
		return "ex15/sub06_1.jsp";
	}

	@RequestMapping("sub06")
	public void method07() {
	}
}
