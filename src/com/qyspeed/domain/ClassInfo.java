package com.qyspeed.domain;

import java.sql.Timestamp;

/*
 * 创建classinfo （课程信息表）的持久对象类
 */
public class ClassInfo {

	//课程编号
	private String classNumber;

	//课程班级名称
	private String className;
	
	//专业
	private SpcialFieldNumber classSpecialFieldNumber;
	//课程开课时间
	private Timestamp classBirthday;
    //课程负责老师
	private String classTeacherCharge;
	//课程负责人电话
	private String classTelephone;
	//课程附加信息
	private String classMemo;
	
	
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public SpcialFieldNumber getClassSpecialFieldNumber() {
		return classSpecialFieldNumber;
	}
	public void setClassSpecialFieldNumber(SpcialFieldNumber classSpecialFieldNumber) {
		this.classSpecialFieldNumber = classSpecialFieldNumber;
	}
	public Timestamp getClassBirthday() {
		return classBirthday;
	}
	public void setClassBirthday(Timestamp classBirthday) {
		this.classBirthday = classBirthday;
	}
	public String getClassTeacherCharge() {
		return classTeacherCharge;
	}
	public void setClassTeacherCharge(String classTeacherCharge) {
		this.classTeacherCharge = classTeacherCharge;
	}
	public String getClassTelephone() {
		return classTelephone;
	}
	public void setClassTelephone(String classTelephone) {
		this.classTelephone = classTelephone;
	}
	public String getClassMemo() {
		return classMemo;
	}
	public void setClassMemo(String classMemo) {
		this.classMemo = classMemo;
	}
	
	
}
