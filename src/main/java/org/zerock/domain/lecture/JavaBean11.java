package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;

@Data
public class JavaBean11 { // 클래스 이름을 정할 경우 역활은 한눈에 알 수 있는 이름으로 정할 것
	private int id;
	private String name;
	private List<String> productName;
}
