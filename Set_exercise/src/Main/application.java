package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos estudantes no curso A? ");
		int listACount = sc.nextInt();
		
		Set<Student>  listA= new HashSet<>();
		System.out.println();
		System.out.println("Digite os alunos do curso A");
		
		for (int i = 0 ; i< listACount ; i++) {
			int studentNumber = sc.nextInt();
			listA.add(new Student(studentNumber));
		}
		


		System.out.print("Quantos estudantes no curso B? ");
		int listBCount = sc.nextInt();
		
		Set<Student>  listB= new HashSet<>();
		System.out.println();
		System.out.println("Digite os alunos do curso B");
		
		for (int i = 0 ; i< listBCount ; i++) {
			int studentNumber = sc.nextInt();
			listB.add(new Student(studentNumber));
		}
		
		
		System.out.print("Quantos estudantes no curso C? ");
		int listCCount = sc.nextInt();
		System.out.println();
		Set<Student>  listC= new HashSet<>();
		
		System.out.println("Digite os alunos do curso C");
		
		for (int i = 0 ; i< listCCount ; i++) {
			int studentNumber = sc.nextInt();
			listC.add(new Student(studentNumber));
		}

	Set<Student> studentCount = new HashSet<>();
	studentCount.addAll(listA);
	studentCount.addAll(listB);
	studentCount.addAll(listC);
	
	System.out.print("Alunos totais cadastrados: " + studentCount.size());
		
		
	sc.close();
	}

}
