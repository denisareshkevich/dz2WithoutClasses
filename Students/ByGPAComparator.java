package Students;

import java.util.Comparator;

public class ByGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Double(firstStudent.getGpa()).compareTo(secondStudent.getGpa());
    }

}


