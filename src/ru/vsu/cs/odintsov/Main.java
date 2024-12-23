package ru.vsu.cs.odintsov;

import ru.vsu.cs.odintsov.classes.*;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Создаем университет
        University vsu = new University("Воронежский государственный университет");

        // Создаем декана
        ResearchAssociate dean = new ResearchAssociate(0, "Крыловецкий Александр Абрамович", "Декан факультета", "dean@vsu.ru");

        // Создаем факультет
        Faculty fkn = new Faculty("ФКН", dean);
        vsu.addFaculty(fkn);

        // Создаем кафедры
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");

        // Добавляем кафедры в факультет
        fkn.addInstitute(toizi);
        fkn.addInstitute(is);
        fkn.addInstitute(tst);
        fkn.addInstitute(itu);
        fkn.addInstitute(piit);

        // Создаем сотрудников кафедры
        ResearchAssociate emp1 = new ResearchAssociate(1, "Ермаков Михаил Викторович", "Программирование", "ermakov@vsu.ru");

        // Создаем преподавателей
        Lecturer lecturer1 = new Lecturer(3, "Малыхин Андрей Юрьевич", "Проектирование информационных систем", "mal_and@inbox.ru");
        Lecturer lecturer2 = new Lecturer(4, "Чекмарёв Андрей Игоревич", "Проектирование баз данных", "chekmarev@vsu.ru");

        // Преподаватели преподают курсы
        Course course1 = new Course();
        course1.setId(101);
        course1.setName("Проектирование баз данных");
        course1.setHours(15.0f);

        Course course2 = new Course();
        course2.setId(102);
        course2.setName("МиСПИСиТ");
        course2.setHours(10.0f);

        lecturer1.setCourses(new Course[]{course2});
        lecturer2.setCourses(new Course[]{course1});

        // Преподаватели становятся сотрудниками кафедры
        is.setEmployees(Arrays.asList(emp1, lecturer1, lecturer2).toArray(new ResearchAssociate[0]));

        // Создаем проект
        Project project1 = new Project();
        project1.setName("Моделирование баз данных");
        project1.setStart(new Date(123, 6, 1)); // Июль 2023
        project1.setEnd(new Date(123, 11, 31)); // Декабрь 2023

        emp1.setProjects(new Project[]{project1});

        // Вывод информации о факультете
        System.out.println("Университет: " + vsu.getName());
        for (Faculty faculty : vsu.getFaculties()) {
            System.out.println("\nФакультет: " + faculty.getName());
            System.out.println("Декан: " + faculty.getDean().getName() + " (Email: " + faculty.getDean().getEmail() + ")");

            System.out.println("\nКафедры на факультете: ");
            for (Institute institute : faculty.getInstitutes()) {
                System.out.println("- " + institute.getName() + " (Аудитория: " + institute.getAddress() + ")");
            }
        }

        // Вывод сотрудников кафедры
        System.out.println("\nСотрудники кафедры " + is.getName() + ":");
        for (ResearchAssociate employee : is.getEmployees()) {
            System.out.println(employee.getName() + " (Область работы: " + employee.getFieldOfStudy() + ", Email: " + employee.getEmail() + ")");
            System.out.println("Проекты:");
            if (employee.getProjects() != null) {
                for (Project project : employee.getProjects()) {
                    System.out.println("- " + project.getName() + " (с " + project.getStart() + " по " + project.getEnd() + ")");
                }
            }
        }

        // Вывод курсов преподавателей
        System.out.println("\nПреподаватели и их курсы:");

        for (Lecturer lecturer : new Lecturer[]{lecturer1, lecturer2}) {
            System.out.println("\nПреподаватель: " + lecturer.getName() + " (Email: " + lecturer.getEmail() + ")");
            System.out.println("Курсы:");
            for (Course course : lecturer.getCourses()) {
                System.out.println("- " + course.getName() + " (" + course.getHours() + " ч/нед)");
            }
        }
    }
}
