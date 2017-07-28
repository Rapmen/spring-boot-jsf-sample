package com.accentrix.index;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class IndexBean {

	@PostConstruct
	private void init() {
		System.out.println("IndexBean init=======");
	}

	public String getHello() {
		return "Hello from PrimeFaces and Spring Boot!";
	}
}
