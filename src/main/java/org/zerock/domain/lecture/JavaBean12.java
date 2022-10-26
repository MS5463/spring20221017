package org.zerock.domain.lecture;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Data
public class JavaBean12 {
	private int id; // supplierId
	private String name; // supplierName
	private List<String> productName; // productName
	
}
