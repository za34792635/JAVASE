package com.qyspeed.domain;

public class ScoreInfo {

	private int scoreid;//分数id
	private Student studentNumber;//学生号码
	private CourseInfo courseNumber;//课程号码
	private float scoreValue;//分数
	private String studentEvalute;//学生评语
	
	public int getScoreid() {
		return scoreid;
	}
	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
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
	public float getScoreValue() {
		return scoreValue;
	}
	public void setScoreValue(float scoreValue) {
		this.scoreValue = scoreValue;
	}
	public String getStudentEvalute() {
		return studentEvalute;
	}
	public void setStudentEvalute(String studentEvalute) {
		this.studentEvalute = studentEvalute;
	}
	
	
	
}
