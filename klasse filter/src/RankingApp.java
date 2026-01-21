import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RankingApp {

    public static void main(String[] args) {
        List<StudentData.Student> students = StudentData.wiKlasse();

        Scanner sc = new Scanner(System.in);
        try {
            for (StudentData.Student s : students) {
                s.np = readNp(sc, s.name, s.klasse);
            }
        } finally {
            sc.close();
        }

        Comparator<StudentData.Student> cmp = (a, b) -> {
            if (a.np != b.np) return Integer.compare(b.np, a.np);
            return a.name.compareToIgnoreCase(b.name);
        };

        System.out.println("WI-Klasse");
        for (char k : new char[] {'A', 'B', 'C', 'D'}) {
            System.out.println();
            System.out.println(k + ":");

            List<StudentData.Student> inClass = new ArrayList<>();
            for (StudentData.Student s : students) {
                if (s.klasse == k) inClass.add(s);
            }

            inClass.sort(cmp);
            if (inClass.isEmpty()) {
                System.out.println("(keine)");
            } else {
                for (StudentData.Student s : inClass) {
                    System.out.println(s.name + ": " + s.np + " NP");
                }
            }
        }

        List<StudentData.Student> overall = new ArrayList<>(students);
        overall.sort(cmp);

        System.out.println();
        System.out.println("Top 3 (beste):");
        for (int i = 0; i < Math.min(3, overall.size()); i++) {
            StudentData.Student s = overall.get(i);
            System.out.println((i + 1) + ") " + s.name + " (" + s.klasse + "): " + s.np + " NP");
        }

        System.out.println();
        System.out.println("Flop 3 (schlechteste):");
        for (int i = 0; i < Math.min(3, overall.size()); i++) {
            StudentData.Student s = overall.get(overall.size() - 1 - i);
            System.out.println((i + 1) + ") " + s.name + " (" + s.klasse + "): " + s.np + " NP");
        }
    }

    private static int readNp(Scanner scanner, String name, char klasse) {
        while (true) {
            System.out.print("NP eingeben fuer " + name + " (Klasse " + klasse + ") [0-15]: ");
            String input = scanner.nextLine().trim();

            try {
                int np = Integer.parseInt(input);
                if (np < 0 || np > 15) {
                    System.out.println("Bitte eine Zahl von 0 bis 15 eingeben.");
                    continue;
                }
                return np;
            } catch (NumberFormatException e) {
                System.out.println("Ungueltig. Bitte eine ganze Zahl eingeben (z.B. 12).");
            }
        }
    }
}
