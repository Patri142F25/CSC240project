import java.util.ArrayList;
import java.util.Arrays;

public class Airplane {
    public int grade;
    public String name;
    public double gpa;
    public ArrayList<String> cla;

    public Airplane(int grade, String name, double gpa, String[] cou) {
        this.grade = grade;
        this.name = name;
        this.gpa = gpa;
        this.cla = new ArrayList<>(Arrays.asList(cou));
        for (String cour : cou) {
            System.out.println("honk");
        }
    }

    void add() {
        System.out.println(gpa);
    }
}
