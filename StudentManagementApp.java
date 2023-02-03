package com.yugen.studentmanagementapp;

import java.util.Scanner;

public class StudentManagementApp {
	public static void main(String[] args) {

		// Ask how many users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int noStudents = sc.nextInt();
		Student[] students = new Student[noStudents];

		// Create n numbers of new students
		for (int i = 0; i < noStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}

		for (int i = 0; i < noStudents; i++) {
			System.out.println(students[i].showInfo());
		}
	}
}
