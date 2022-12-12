package com.vo;

public class CommentVO {

	private int commentnum;
	private String commentname , content;

	
	public int getCommentnum() {
		return commentnum;
	}

	public void setCommentnum(int commentnum) {
		this.commentnum = commentnum;
	}

	public String getCommentname() {
		return commentname;
	}

	public void setCommentname(String commentname) {
		this.commentname = commentname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "CommentVO [commentnum=" + commentnum + ", commentname=" + commentname + ", content=" + content
				+ ", getCommentnum()=" + getCommentnum() + ", getCommentname()=" + getCommentname() + ", getContent()="
				+ getContent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
