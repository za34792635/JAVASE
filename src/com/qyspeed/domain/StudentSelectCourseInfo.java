package com.qyspeed.domain;
/*
 * 学生选课表   持久对象类
 */
public class StudentSelectCourseInfo {

	private int selectid;//选择id
	private Student studentNumber;//学生编号
	private CourseInfo courseNumber;//课程编号
	
	public int getSelectid() {
		return selectid;
	}
	public void setSelectid(int selectid) {
		this.selectid = selectid;
	}
	public Student getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Student studentNumber) {
		this.studentNumber = studentNumber;
	}
	public CourseInfo getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(CourseInfo courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	
}
