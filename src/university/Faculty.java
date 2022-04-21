package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private Faculties name;
    private List<Group> groups = new ArrayList<>();

    public Faculty(Faculties name) {
        this.name = name;
    }

    public void addGroup(Group firstGroup) {
        groups.add(firstGroup);
    }

    public Faculties getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
