package university;

public class Subject {
    private String name;
    private Double grade;

    public Subject(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Double getGrade() {
        return grade;
    }
}
