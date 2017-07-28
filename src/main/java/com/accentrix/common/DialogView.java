package com.accentrix.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@ViewScoped
public class DialogView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String text;

	@PostConstruct
	private void init() {
		System.out.println("DialogView init=======");
	}
	
}
