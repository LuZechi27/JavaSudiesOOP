package ConceitosIniciaisOOP.Exercicios.ExercicioUML;

public class Main {
    static void main() {
        Player p1 = new Player("Carlos", 10, "Atacante", true);
        Player p2 = new Player("João", 9, "Atacante", true);
        Player p3 = new Player("Pedro", 8, "Meio-campo", true);
        Player p4 = new Player("Lucas", 5, "Zagueiro", true);
        Player p5 = new Player("Rafael", 1, "Goleiro", true);
        Player p6 = new Player("Marcos", 11, "Atacante", false);
        Player p7 = new Player("Bruno", 14, "Meio-campo", false);

        Team team = new Team();

        team.setName("São Carlos FC");
        team.setBaseLocation("São Carlos");
        team.setCoachName("Fernando");

        System.out.println("Time: " + team.getName());
        System.out.println("Cidade: " + team.getBaseLocation());
        System.out.println("Técnico: " + team.getCoachName());
        System.out.println();

        team.addPlayer(p1);
        team.addPlayer(p2);
        team.addPlayer(p3);
        team.addPlayer(p4);
        team.addPlayer(p5);
        team.addPlayer(p6);
        team.addPlayer(p7);

        team.setCaptain(p1);
        System.out.println("Capitão definido:\n" + team.getCaptain().getStateAsString());
        System.out.println();

        System.out.println("Jogadores em campo:");
        Player[] fielded = team.getFieldedPlayers();
        for (Player p : fielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }

        System.out.println();

        System.out.println("Jogadores no banco:");
        Player[] outfielded = team.getOutfieldedPlayers();
        for (Player p : outfielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }

        System.out.println();

        System.out.println("Realizando substituição");
        team.substitute(p6, new Player("Thiago", 3, "Atacante", false));

        System.out.println("Jogadores após substituição:");
        fielded = team.getFieldedPlayers();
        for (Player p : fielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }
        outfielded = team.getOutfieldedPlayers();
        for (Player p : outfielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }

        System.out.println();

        System.out.println("Removendo jogador Pedro");
        team.removePlayer(p3);

        System.out.println("Jogadores restantes no time:");
        fielded = team.getFieldedPlayers();
        for (Player p : fielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }
        outfielded = team.getOutfieldedPlayers();
        for (Player p : outfielded) {
            if (p != null) {
                System.out.println(p.getStateAsString());
            }
        }
    }
}
