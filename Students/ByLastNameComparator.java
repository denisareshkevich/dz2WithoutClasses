package Students;

import java.util.Comparator;

public class ByLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new  String(firstStudent.getLastName()).compareTo(secondStudent.getLastName());
    }

}
