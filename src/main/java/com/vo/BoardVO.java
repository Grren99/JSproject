package com.vo;

public class BoardVO {
	
	private String userid;
	private String title;
	private String content;
	private String created;
	private String updated;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "boardVO [userid=" + userid + ", title=" + title + ", content=" + content + ", created=" + created
				+ ", updated=" + updated + ", getUserid()=" + getUserid() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getCreated()=" + getCreated() + ", getUpdated()=" + getUpdated()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
