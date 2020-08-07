package com.ypf.beans;

public class ActivityServer {

	private Integer aid;
	private Integer sid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public ActivityServer(Integer aid, Integer sid) {
		super();
		this.aid = aid;
		this.sid = sid;
	}
	public ActivityServer() {
		super();
	}
	@Override
	public String toString() {
		return "ActivityServer [aid=" + aid + ", sid=" + sid + "]";
	}
	
}
