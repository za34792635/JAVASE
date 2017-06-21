package com.qyspeed.domain;

import java.io.File;
import java.sql.Timestamp;
/*
 * 创建teacher 持久对象表
 */
public class Teacher {

	private String teacherNumber;//教师编号
	private String teacherName;//教师名
	private String teacherPassword;//教师密码
	private String teacherSex;//教师性别
	private Timestamp teacherBirthday;//出生日期
	private Timestamp teacherArriveDate;//入职日期
	private String teacherCardNumber;//教师卡号
	private String teacherPhone;//联系电话
	private String teacherPhoto;//教师照片
	private String teacherAddress;//教师任职地址
	private String teacherMemo;//教师备注
	
	
	public String getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPassword() {
		return teacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public Timestamp getTeacherBirthday() {
		return teacherBirthday;
	}
	public void setTeacherBirthday(Timestamp teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}
	public Timestamp getTeacherArriveDate() {
		return teacherArriveDate;
	}
	public void setTeacherArriveDate(Timestamp teacherArriveDate) {
		this.teacherArriveDate = teacherArriveDate;
	}
	public String getTeacherCardNumber() {
		return teacherCardNumber;
	}
	public void setTeacherCardNumber(String teacherCardNumber) {
		this.teacherCardNumber = teacherCardNumber;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherPhoto() {
		return teacherPhoto;
	}
	public void setTeacherPhoto(String teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherMemo() {
		return teacherMemo;
	}
	public void setTeacherMemo(String teacherMemo) {
		this.teacherMemo = teacherMemo;
	}
	
	
}
