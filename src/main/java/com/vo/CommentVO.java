package com.vo;

public class CommentVO {
	private Integer num ,category_num;
	private String content , comname;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getCategory_num() {
		return category_num;
	}
	public void setCategory_num(Integer category_num) {
		this.category_num = category_num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	@Override
	public String toString() {
		return "CommentVO [num=" + num + ", category_num=" + category_num + ", content=" + content + ", comname="
				+ comname + ", getNum()=" + getNum() + ", getCategory_num()=" + getCategory_num() + ", getContent()="
				+ getContent() + ", getComname()=" + getComname() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
