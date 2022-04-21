package main;

import university.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Adam");
        student1.addSubject(new Subject("calculus", 6.0));
        student1.addSubject(new Subject("linear algebra", 9.0));
        student1.addSubject(new Subject("discrete math", 4.5));
        student1.addSubject(new Subject("computer science", 7.5));

        Student student2 = new Student("Chris");
        student2.addSubject(new Subject("calculus", 10.0));
        student2.addSubject(new Subject("linear algebra", 9.0));
        student2.addSubject(new Subject("discrete math", 3.5));
        student2.addSubject(new Subject("computer science", 1.5));

        Student student3 = new Student("John");
        student3.addSubject(new Subject("history", 6.0));
        student3.addSubject(new Subject("political theory", 4.0));
        student3.addSubject(new Subject("political methodology", 8.5));
        student3.addSubject(new Subject("political economy", 2.5));

        Student student4 = new Student("Anna");
        student4.addSubject(new Subject("history", 1.0));
        student4.addSubject(new Subject("political theory", 7.0));
        student4.addSubject(new Subject("political methodology", 9.5));
        student4.addSubject(new Subject("political economy", 3.5));

        Group firstGroup = new Group("firstGroup");
        Group secondGroup = new Group("secondGroup");
        Group thirdGroup = new Group("thirdGroup");

        firstGroup.addStudent(student1);
        secondGroup.addStudent(student2);
        thirdGroup.addStudent(student3);
        thirdGroup.addStudent(student4);

        Faculty facultyIT = new Faculty(Faculties.IT);
        Faculty facultyPOLITICS = new Faculty(Faculties.POLITICS);

        facultyIT.addGroup(firstGroup);
        facultyIT.addGroup(secondGroup);
        facultyPOLITICS.addGroup(thirdGroup);

        University university = new University("KBTU");
        university.addFaculty(facultyIT);
        university.addFaculty(facultyPOLITICS);

        university.getAverageGradeOfStudentFromAllSubjects("Adam");
        university.getAverageGradeOfStudentFromAllSubjects("Chris");

        university.getAverageGradeOfSubjectFromSpecificGroupAndFaculty("calculus", "firstGroup", Faculties.IT);
        university.getAverageGradeOfSubjectFromSpecificGroupAndFaculty("history", "thirdGroup", Faculties.POLITICS);

        university.getSubjectAverageForEntireUniversity("calculus");
        university.getSubjectAverageForEntireUniversity("political theory");


    }
}
