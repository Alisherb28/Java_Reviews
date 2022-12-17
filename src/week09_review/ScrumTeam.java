package week09_review;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA, SM;
    public ArrayList<Tester> Testers;
    public ArrayList<Developer> Developers;
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        Testers=new ArrayList<>();
        Developers=new ArrayList<>();
    }

    public void addTester(Tester tester){
        Testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        Testers.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        Developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        Developers.addAll(Arrays.asList(developers));
    }
    public void removeTester(String employeeID){
        Testers.removeIf(p->p.employeeID.equalsIgnoreCase(employeeID));
    }
    public void removeDeveloper(String employeeID){
        Developers.removeIf(p->p.employeeID.equalsIgnoreCase(employeeID));
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Testers=" + Testers.size() +
                ", Developers=" + Developers.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
