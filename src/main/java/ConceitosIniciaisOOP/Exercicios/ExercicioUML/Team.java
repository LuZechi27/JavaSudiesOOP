package ConceitosIniciaisOOP.Exercicios.ExercicioUML;

public class Team {
    private final int ARRAY_SIZE = 18;

    private final Player[] players = new Player[ARRAY_SIZE];
    private int playerAmount = 0;

    private Player captain;
    private String name;
    private String baseLocation;
    private String coachName;

    private int findInTheTeam(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                return i;
            }
        }
        return -1;
    }

    public void addPlayer(Player player) {
        if (playerAmount < 18 && findInTheTeam(player) == -1) {
            int index = findInTheTeam(null);
            if (index != -1) {
                players[index] = player;
                playerAmount++;
            }
        }
    }

    public void removePlayer(Player player) {
        if (playerAmount > 0) {
            int index = findInTheTeam(player);
            if (index != -1) {
                players[index] = null;
                playerAmount--;
            }
        }
    }

    public void substitute(Player substitute, Player starter) {
        if (playerAmount > 0) {
            removePlayer(substitute);
            addPlayer(starter);
        }
    }

    public Player[] getFieldedPlayers() {
        Player[] fieldedPlayers = new Player[ARRAY_SIZE];
        int index = 0;
        for (Player player : players) {
            if (player != null) {
                String[] state = player.getStateAsString().split("\n");
                boolean isFielded = Boolean.parseBoolean(state[3].split(" ")[3]);
                if (isFielded)
                    fieldedPlayers[index++] = player;
            }
        }
        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers() {
        Player[] outfieldedPlayers = new Player[ARRAY_SIZE];
        int index = 0;
        for (Player player : players) {
            if (player != null) {
                String[] state = player.getStateAsString().split("\n");
                boolean isFielded = Boolean.parseBoolean(state[3].split(" ")[3]);
                if (!isFielded)
                    outfieldedPlayers[index++] = player;
            }
        }
        return outfieldedPlayers;
    }

    public void setCaptain(Player captain) {
        if (findInTheTeam(captain) != -1)
            this.captain = captain;
    }

    public Player getCaptain() {
        return captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
}
