package com.AutomationFramework.db;

public class Queries_Class {
	
	public static String kagiminfo(){
		String q = "SELECT * FROM `future_it_vision_student` WHERE `StudentName`='Kagim'";
		return q;
	}
	

	public static String Konokinfo(){
		String q = "SELECT * FROM `future_it_vision_student` WHERE `StudentName`='Konot'";
		return q;
	}
	
	
	public static String MultipleStudentInfo(){
		String q = "SELECT  * FROM `future_it_vision_student` WHERE `StudentName`='Samapti'";
		return q;
	}
	

	
	
}
