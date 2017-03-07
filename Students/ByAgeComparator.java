package Students;

import java.util.Comparator;

public class ByAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Integer(firstStudent.getAge()).compareTo(secondStudent.getAge());
    }
}
