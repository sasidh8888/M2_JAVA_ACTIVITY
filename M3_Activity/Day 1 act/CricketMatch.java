import java.util.*;

public class CricketMatch {
    Scanner sc = new Scanner(System.in);
    private String teamname;
    private String current_Innings;
    private int runs;

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void setcurrent_Innings(String current_Innings) {
        this.current_Innings = current_Innings;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getTeamname() {
        return this.teamname;
    }

    public String getcurrent_Innings() {
        return this.current_Innings;
    }

    public int getRuns() {
        return this.runs;
    }

    void Values() {
        System.out.println("Enter the team name:");
        teamname = sc.next();
        System.out.println("Enter session:(First-1 or Second-2)");
        current_Innings = sc.next();
        System.out.println("Enter runs:");
        runs = sc.nextInt();
    }

    void displayValues() {
        System.out.println("Name:" + this.teamname);
        System.out.println("Scored:" + this.runs);
        if (this.current_Innings.equalsIgnoreCase("First") || this.current_Innings.equals("1")) {
            runs = runs + 1;
            System.out.printf("Need %d to win", runs);
        } else if (this.current_Innings.equalsIgnoreCase("Second") || this.current_Innings.equals("2")) {
            System.out.println("Match Ended");

        } else {
            System.out.println("Invaild input");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CricketMatch cr = new CricketMatch();
        cr.Values();
        cr.displayValues();
    }
}