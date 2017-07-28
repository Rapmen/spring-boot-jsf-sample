package com.accentrix.sample3;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class Sample3RequestBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		System.out.println("Sample3RequestBean init ======");
	}

	public void showDialog() {
		System.out.println("Sample3RequestBean.showDialog ======");
		Map<String, Object> options = new HashMap<>();
		options.put("modal", true);
		options.put("width", 640);
		options.put("height", 340);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("headerElement", "customheader");

		RequestContext.getCurrentInstance().openDialog("sample3_table", options, null);
	}

}
