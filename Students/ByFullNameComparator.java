package Students;

import java.util.Comparator;

public class ByFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        if (firstStudent.getFirstName() == secondStudent.getFirstName()){
            return new ByLastNameComparator().compare(firstStudent, secondStudent);
        }
        return new String(firstStudent.getFirstName()).compareTo(secondStudent.getLastName());
    }

}
