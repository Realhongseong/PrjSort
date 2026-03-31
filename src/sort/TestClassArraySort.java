package sort;

import java.util.Arrays;

class Student implements Comparable {
	private int sno;

	public Student(int sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		//return this.sno - s.sno;	//오름차순
		return s.sno - this.sno;	//내림차순
	}
	
}

public class TestClassArraySort {

	public static void main(String[] args) {
		Student [] studArr = new Student[] {
			new Student(1),new Student(18),new Student(19),
			new Student(4),new Student(9),new Student(7),
			new Student(15),new Student(17),new Student(32),
			new Student(3),new Student(24),new Student(26)
		};

		dispArr(studArr);
		Arrays.sort(studArr);
		dispArr(studArr);
	}

	private static void dispArr(Student[] studArr) {
		for (Student student : studArr) {
			System.out.print(student + " ");
		}
		System.out.println();
	}

}
