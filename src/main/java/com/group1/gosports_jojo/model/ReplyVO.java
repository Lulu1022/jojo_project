package com.group1.gosports_jojo.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@Component
public class ReplyVO implements java.io.Serializable{
	
	private Integer reply_id;
	private Integer user_id;
	private Integer post_id;
	private Integer reply_status;
	private String reply_content;
	private Timestamp created_datetime;
	private Timestamp updated_datetime;
	 private Integer count; 
	 
	
	public Integer getReply_id() {
		return reply_id;
	}
	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public Integer getReply_status() {
		return reply_status;
	}
	public void setReply_status(Integer reply_status) {
		this.reply_status = reply_status;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Timestamp getCreated_datetime() {
		return created_datetime;
	}
	public void setCreated_datetime(Timestamp created_datetime) {
		this.created_datetime = created_datetime;
	}
	public Timestamp getUpdated_datetime() {
		return updated_datetime;
	}
	public void setUpdated_datetime(Timestamp updated_datetime) {
		this.updated_datetime = updated_datetime;
	}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}

}
