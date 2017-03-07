package Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class University {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Семен", "Иванов", 6.2, 19));
        students.add(new Student("Иван", "Петров", 9.0, 20));
        students.add(new Student("Петр", "Сидоров", 8.8, 28));

        //Collections.sort(students, new ByGPAComparator());
        //Collections.sort(students, new ByAgeComparator());
        //Collections.sort(students, new ByFullNameComparator());
        System.out.println(theBestStudentSearcher(students).getFirstName());}

//        for (Student student : students) {
//            System.out.println(student.getFirstName() + "  " + student.getLastName());
//        }}
        private static Student theBestStudentSearcher(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        Student student1 = students.get(0);
        Student theBest;
        for(int i = 0; iterator.hasNext(); i++) {
            if (student1.getGpa() < iterator.next().getGpa()){
                student1 = students.get(i);
                return student1;
            }

        }
        return student1;
    }
}
