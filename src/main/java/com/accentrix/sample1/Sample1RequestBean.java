package com.accentrix.sample1;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@RequestScoped
public class Sample1RequestBean {

	@Getter
	@Setter
	@ManagedProperty(value = "#{sample1View}")
	private Sample1View sample1View;

	@PostConstruct
	private void init() {
		System.out.println("Sample1RequestBean init======");
	}

	public void onSubmit() {
		System.out.println(sample1View.getText());
	}

}
