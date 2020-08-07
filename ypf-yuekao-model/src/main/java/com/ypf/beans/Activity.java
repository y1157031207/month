package com.ypf.beans;

public class Activity {

	private Integer aid;
	private Integer code;
	private Integer tid;
	private String aname;
	private String starttime;
	private String endtime;
	private String createtime;
	
	private String tname;
	private String sname;
	
	private String createstart;
	private String createend;
	
	public String getCreatestart() {
		return createstart;
	}
	public void setCreatestart(String createstart) {
		this.createstart = createstart;
	}
	public String getCreateend() {
		return createend;
	}
	public void setCreateend(String createend) {
		this.createend = createend;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Activity(Integer aid, Integer code, Integer tid, String aname, String starttime, String endtime,
			String createtime, String tname, String sname) {
		super();
		this.aid = aid;
		this.code = code;
		this.tid = tid;
		this.aname = aname;
		this.starttime = starttime;
		this.endtime = endtime;
		this.createtime = createtime;
		this.tname = tname;
		this.sname = sname;
	}
	public Activity() {
		super();
	}
	@Override
	public String toString() {
		return "Activity [aid=" + aid + ", code=" + code + ", tid=" + tid + ", aname=" + aname + ", starttime="
				+ starttime + ", endtime=" + endtime + ", createtime=" + createtime + ", tname=" + tname + ", sname="
				+ sname + "]";
	}
	
}
