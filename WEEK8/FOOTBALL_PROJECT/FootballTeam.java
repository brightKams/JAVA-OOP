import java.util.ArrayList;

public class FootballTeam {

    private ArrayList<Player> team;
    private String teamName;
    private String manager;

    public FootballTeam(String teamName, String manager) {
        team = new ArrayList<>();
        this.teamName = teamName;
        this.manager = manager;
    }

    // SETTER METHODS FOR FOOTBALLTEAM
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    // GETTER METHODS

    public String getTeamName() {
        return this.teamName;
    }

    public String getManager() {
        return this.manager;
    }

    // ADDING A PLAYER TO THE TEAM LIST
    public void addPlayer(Player player) {
        team.add(player);
    }

    // REMOVING A PLAYER FROM THE TEAM LIST

    public void removePlayer(Player player) {
        team.remove(player);
    }

    // TASKS -
    // Get the Total players fees the club has to pay for all players.
    // We iterate through the list and invoke the "getTransferFee()" method
    // To get the fees that are added to totalFees

    // 1. Total Player fees the Club has to pay for all Players.

    public double getTotalClubFees() {
        double totalFee = 0;
        for (Player player : team) {
            totalFee += player.getTransferFee();
        }
        return totalFee;
    }

    // 2. This method returns in a formatted string a less detailed information
    // about players. Name, Nationality and transfer fees only

    public String getPlayerList() {
        String output = "\n";
        for (Player player : team) {
            output += player.getName() + "(\tNationality : " + player.getNationality() + "\tTransfer Fees : "
                    + player.getTransferFee() + ")\n";
        }

        return output;
    }

    public void displayAllPlayersDetails() {

        for (Player player : team) {
            if (player instanceof Defender) {
                Defender defender = (Defender) player;
                System.out.println(defender.getDetails());
            } else if (player instanceof Goalkeeper) {
                Goalkeeper goalkeeper = (Goalkeeper) player;
                System.out.println(goalkeeper.getDetails());
            } else if (player instanceof Midfielder) {
                Midfielder midfielder = (Midfielder) player;
                System.out.println(midfielder.getDetails());
            } else if (player instanceof Forward) {
                Forward forward = (Forward) player;
                System.out.println(forward.getDetails());
            }

        }

        
    }

    

}
