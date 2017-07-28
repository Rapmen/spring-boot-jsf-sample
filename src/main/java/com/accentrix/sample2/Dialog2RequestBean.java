package com.accentrix.sample2;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.accentrix.common.AbstractDialogRequestBean;
import com.accentrix.common.DialogView;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@RequestScoped
public class Dialog2RequestBean extends AbstractDialogRequestBean {

	@Getter
	@Setter
	@ManagedProperty(value = "#{dialogView}")
	private DialogView dialogView;

	@PostConstruct
	private void init() {
		System.out.println("Dialog2RequestBean init======");
	}

	@Override
	public void onSubmit() {
		System.out.println("Dialog2RequestBean.onSubmit ======= " + dialogView.getText());
	}

}
