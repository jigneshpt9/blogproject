package com.glarimy.cmad.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author {
	private String name;
	private String url;

	public Author() {
	}

	public Author(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
