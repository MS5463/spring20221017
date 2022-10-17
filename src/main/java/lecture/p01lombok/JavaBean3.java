package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;


public class JavaBean3 {
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;
	// 읽기 전용, 쓰기 전용으로 할 경우 필드에 붙임
}
