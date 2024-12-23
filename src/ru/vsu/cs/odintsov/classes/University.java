package ru.vsu.cs.odintsov.classes;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        this.faculties.remove(faculty);
    }
}
