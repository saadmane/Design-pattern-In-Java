package dataaccessobjectpattern;

public class DaopatternDemo {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(2);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

	}

}
