package com.qyspeed.domain;

/*
 * courseinfo表 持久对象类 
 */
public class CourseInfo {

	private String courseNumber;//课程编号
	private String courseName;//课程名称
	private Teacher courseTeacher;//课程老师
	private String courseTime;//上课时间
	private String coursePlace;//上课地点
	private String courseScore;//课程学分
	private String courseMemo;//课程备注
	
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Teacher getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(Teacher courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getCoursePlace() {
		return coursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}
	public String getCourseScore() {
		return courseScore;
	}
	public void setCourseScore(String courseScore) {
		this.courseScore = courseScore;
	}
	public String getCourseMemo() {
		return courseMemo;
	}
	public void setCourseMemo(String courseMemo) {
		this.courseMemo = courseMemo;
	}
	
	
	
}
