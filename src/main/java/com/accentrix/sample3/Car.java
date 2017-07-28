package com.accentrix.sample3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

	private String id;
	private Integer year;
	private String brand;
	private String color;
	private Integer price;
	private Boolean soldState;

}
