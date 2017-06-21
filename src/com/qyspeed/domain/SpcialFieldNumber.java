package com.qyspeed.domain;

import java.sql.Timestamp;

/*
 * 创建 专业表 SpecialFieldNumber 表
 */
public class SpcialFieldNumber {


	private String specialFieldNumber; //专业编号
	private String specialFieldName;//专业名称
	private CollegeInfo specialCollegeNumber;//专业所属大学
	private Timestamp specialBirthDate; //专业创立日期
	private String specialMan;//专业主任负责人
	private String specialTelephone;//专业负责电话
	private String specialMemo;//专业备注
	
	
	public String getSpecialFieldNumber() {
		return specialFieldNumber;
	}
	public void setSpecialFieldNumber(String specialFieldNumber) {
		this.specialFieldNumber = specialFieldNumber;
	}
	public String getSpecialFieldName() {
		return specialFieldName;
	}
	public void setSpecialFieldName(String specialFieldName) {
		this.specialFieldName = specialFieldName;
	}
	public CollegeInfo getSpecialCollegeNumber() {
		return specialCollegeNumber;
	}
	public void setSpecialCollegeNumber(CollegeInfo specialCollegeNumber) {
		this.specialCollegeNumber = specialCollegeNumber;
	}
	public Timestamp getSpecialBirthDate() {
		return specialBirthDate;
	}
	public void setSpecialBirthDate(Timestamp specialBirthDate) {
		this.specialBirthDate = specialBirthDate;
	}
	public String getSpecialMan() {
		return specialMan;
	}
	public void setSpecialMan(String specialMan) {
		this.specialMan = specialMan;
	}
	public String getSpecialTelephone() {
		return specialTelephone;
	}
	public void setSpecialTelephone(String specialTelephone) {
		this.specialTelephone = specialTelephone;
	}
	public String getSpecialMemo() {
		return specialMemo;
	}
	public void setSpecialMemo(String specialMemo) {
		this.specialMemo = specialMemo;
	}
	
	
}
