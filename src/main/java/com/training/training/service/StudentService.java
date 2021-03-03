package com.training.training.service;

import com.training.training.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);



public static  Student createStudent( Long studentid, String studentmail, String studentname)   
{  
	Student stu = new Student();  
stu.setStudentid(studentid);  
stu.setStudentemail(studentmail);  
stu.setStudentname(studentname);  
return stu;  
}  
public static  void deleteStudent(String studentmail)   
{  
	
}  
}  