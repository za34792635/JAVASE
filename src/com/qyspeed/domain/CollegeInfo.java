package com.qyspeed.domain;

import java.sql.Timestamp;

public class CollegeInfo {

	private String collegeNumber;//大学编号
	private String collegeName;//大学名称
	private Timestamp collegeBrithDate;//大学创立日期
	private String collegeMan;//大学创始人
	private String collegeTelephone;//大学负责电话
	private String collegeMemo;//大学备注
	
	
	public String getCollegeNumber() {
		return collegeNumber;
	}
	public void setCollegeNumber(String collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Timestamp getCollegeBrithDate() {
		return collegeBrithDate;
	}
	public void setCollegeBrithDate(Timestamp collegeBrithDate) {
		this.collegeBrithDate = collegeBrithDate;
	}
	public String getCollegeMan() {
		return collegeMan;
	}
	public void setCollegeMan(String collegeMan) {
		this.collegeMan = collegeMan;
	}
	public String getCollegeTelephone() {
		return collegeTelephone;
	}
	public void setCollegeTelephone(String collegeTelephone) {
		this.collegeTelephone = collegeTelephone;
	}
	public String getCollegeMemo() {
		return collegeMemo;
	}
	public void setCollegeMemo(String collegeMemo) {
		this.collegeMemo = collegeMemo;
	}
	
	
}
