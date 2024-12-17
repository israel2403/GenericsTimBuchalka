package generics.part1;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins;
    private int totalLosses;
    private int totalTies;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Adds a team member to the team. If the team member is already on the team,
     * does nothing.
     * @param t the team member to add
     */
    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);

        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
