package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {

StudentService service = new StudentServiceImpl();

Student student = new Student();
// Create Operation
student.setStudentId(100);
student.setName("hitha");
service.addStudent(student);


// Retrieve Operation
student = service.findStudentById(100);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName());

// Update Operation
student = service.findStudentById(100);
student.setName("Hithashree");
service.updateStudent(student);



student = service.findStudentById(100);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName());


// Delete Operation
student = service.findStudentById(100);
service.removeStudent(student);
System.out.println("End of program/Life cycle completed...");

}
}
