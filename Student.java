package com.elevatelabs;

import java.util.ArrayList;

public class Student {
	static ArrayList<Student> arr=new ArrayList<Student>();
	 int id;
	 String name;
	 Double marks;
	 public Student(int id, String name, Double marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	 }
	 
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	 public  static void add(Student student) {
		 arr.add(student);
	 }
	 public  static void delete(int id) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).id==id) {
				arr.remove(i);
				System.out.println(" Student with ID " + id + " deleted.");
	            return;
			}
		}
		 System.out.println("Student with ID " + id + " not found.");
		 
	 }
	 public static void view() {
		 for(Student l:arr) {
			 System.out.println(l);
		 }
		 
	 }
	 public static void update(int id,String newname, double marks) {
	 for (Student student : arr) {
		 if(student.id==id) {
			 student.name=newname;
			 student.marks=marks;
			 System.out.println(" updated successfully for ID " + id );
	            return;
		 }
	 }
	  System.out.println("❌ Student with ID " + id + " not found.");
		
	}
		 
	 
	 public static void main(String[] args) {
		 Student s1=new Student(101,"NAyeem",78D);
		 Student s2=new Student(102,"priya",79D);
		 Student s3=new Student(103,"charan",88D);
		 Student s4=new Student(104,"vaani",98D);
		 
		add(s1);
		add(s2);
		add(s3);
		add(s4);
		view();
		update(102,"Riya",99);
		view();
		delete(103);
		view();
		
		
		 
		 
		

	}
	 
	

}
