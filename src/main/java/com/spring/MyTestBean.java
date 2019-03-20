package com.spring;

import org.springframework.beans.factory.FactoryBean;

public class MyTestBean implements FactoryBean<MyTestBean> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public MyTestBean getObject() throws Exception {
		MyTestBean bean = new MyTestBean();
		bean.setName("Tom");
		return bean;
	}

	//返回FactoryBean创建的bean类型。
	@Override
	public Class<?> getObjectType() {
		return  MyTestBean.class;
	}

	//返回由FactoryBean创建的bean实例的作用域是singleton还是prototype。
	@Override
	public boolean isSingleton() {
		return true;
	}

}
