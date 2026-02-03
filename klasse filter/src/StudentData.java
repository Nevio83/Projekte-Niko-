import java.util.ArrayList;
import java.util.List;

public class StudentData {

    public static class Student {
        public String name;
        public char klasse;
        public int np;

        public Student(String name, char klasse) {
            this.name = name;
            this.klasse = Character.toUpperCase(klasse);
            this.np = -1;
        }
    }

    public static List<Student> wiKlasse() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Jonah arents", 'A'));
        students.add(new Student("Ruben rothman", 'A'));

        students.add(new Student("Nevio Michelhans", 'B'));
        students.add(new Student("Ka man", 'B'));

        students.add(new Student("Typ 1", 'C'));
        students.add(new Student("Typ 2", 'C'));

        students.add(new Student("Schueler 1", 'D'));
        students.add(new Student("Schueler 2", 'D'));

        return students;
    }
}
