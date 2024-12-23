package ru.vsu.cs.odintsov.classes;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

	private String name;
	private List<Institute> institutes;
	private Employee dean;

	public Faculty(String name, Employee dean) {
		this.name = name;
		this.dean = dean;
		this.institutes = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getDean() {
		return this.dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public List<Institute> getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	public void removeInstitute(Institute institute) {
		this.institutes.remove(institute);
	}
}
