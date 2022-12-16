package com.vo;

public class CategoryVO {
	private Integer num , categoryname;
	private String title;
	private String content;
	private String name;
	private String image;
	private String username;
	private String created;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(Integer categoryname) {
		this.categoryname = categoryname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "CategoryVO [num=" + num + ", categoryname=" + categoryname + ", title=" + title + ", content=" + content
				+ ", name=" + name + ", image=" + image + ", username=" + username + ", created=" + created
				+ ", getNum()=" + getNum() + ", getCategoryname()=" + getCategoryname() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getName()=" + getName() + ", getUsername()=" + getUsername()
				+ ", getCreated()=" + getCreated() + ", getImage()=" + getImage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	}
	