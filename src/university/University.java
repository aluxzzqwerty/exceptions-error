package university;

import exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void getAverageGradeOfStudentFromAllSubjects(String name) {
        double sum = 0.0;
        int count = 0;

        checkPresenceOfFaculty();

        for (Faculty f : faculties) {
            checkPresenceOfGroup(f);
            for (Group g : f.getGroups()) {
                checkPresenceOfStudents(g);
                for (Student s : g.getStudents()) {
                    if (s.getName().equalsIgnoreCase(name)) {
                        checkPresenceOfSubject(s);
                        for (Subject subj : s.getSubjects()) {
                            checkCorrectnesOfGrade(subj);
                            sum += subj.getGrade();
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Average grade of " + name + " for all subjects is: " + sum / count);
    }

    public void getAverageGradeOfSubjectFromSpecificGroupAndFaculty(String subjectName, String groupName, Faculties facultyName) {
        double sum = 0.0;
        int count = 0;

        checkPresenceOfFaculty();

        for (Faculty f : faculties) {
            checkPresenceOfGroup(f);
            if (f.getName() == facultyName) {
                for (Group g : f.getGroups()) {
                    checkPresenceOfStudents(g);
                    if (g.getName().equalsIgnoreCase(groupName)) {

                        for (Student s : g.getStudents()) {
                            checkPresenceOfSubject(s);
                            for (Subject subj : s.getSubjects()) {
                                checkCorrectnesOfGrade(subj);
                                if (subj.getName().equalsIgnoreCase(subjectName)) {
                                    sum += subj.getGrade();
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Average grade of " + subjectName + " in " + groupName + " for " + facultyName + " faculty is: " + sum / count);
    }

    public void getSubjectAverageForEntireUniversity(String subject) {
        double sum = 0.0;
        int count = 0;

        checkPresenceOfFaculty();

        for (Faculty f : faculties) {
            checkPresenceOfGroup(f);
            for (Group g : f.getGroups()) {
                checkPresenceOfStudents(g);
                for (Student s : g.getStudents()) {
                    checkPresenceOfSubject(s);
                    for (Subject subj : s.getSubjects()) {
                        checkCorrectnesOfGrade(subj);
                        if (subj.getName().equalsIgnoreCase(subject)) {
                            sum += subj.getGrade();
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Average grade of " + subject + " subject for University is: " + sum / count);
    }

    private void checkPresenceOfFaculty() {
        if (faculties.isEmpty()) throw new NoFacultyInUniException("There are no faculties in uni");
    }

    private void checkPresenceOfGroup(Faculty faculty) {
        if (faculty.getGroups().isEmpty()) throw new NoGroupInFaculty("No groups in faculty!");
    }

    private void checkPresenceOfStudents(Group group) {
        if (group.getStudents().isEmpty()) throw new NoStudentsInGroupException("There are no students in such group!");
    }

    private void checkPresenceOfSubject(Student student) {
        if (student.getSubjects().isEmpty()) throw new MissingSubjectException("Student has missing subjects");
    }

    private void checkCorrectnesOfGrade(Subject subject) {
        if (subject.getGrade() < 0 || subject.getGrade() > 10)
            throw new IncorrectGradeException("This grade doesnt exist!");
    }
}
