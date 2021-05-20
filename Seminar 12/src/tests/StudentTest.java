package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Student;

class StudentTest {


	@Test
	void test() {
		String nume="Ion";
		Student student=new Student(nume);
		assertEquals(nume,student.getNume());
	}

	@Test
	public void testListAddNote() {
	Student student=new Student();
	int nota=8;
	student.adaugaNota(8);
	assertEquals(nota,getNota(0));
}
	
	@Test
	public void testListSize() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}