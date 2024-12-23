package ru.vsu.cs.odintsov.classes;

public class Lecturer extends ResearchAssociate {

	private Course[] courses;
	public Lecturer(int ssNo, String name, String fieldOfStudy, String email) {
		super(ssNo, name, fieldOfStudy, email);
	}

	public Course[] getCourses() {
		return this.courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public void addCourse(Course course) {
		// TODO - implement Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

	public void removeCourse(Course course) {
		// TODO - implement Lecturer.removeCourse
		throw new UnsupportedOperationException();
	}
}
