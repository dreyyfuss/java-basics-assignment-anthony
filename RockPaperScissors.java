public class RockPaperScissors {

    public static String play(String player1, String player2) {
        String p1 = player1.toLowerCase().trim();
        String p2 = player2.toLowerCase().trim();

        if (p1.equals(p2)) {
            return "TIE";
        }

        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock"))) {
            return "Player 1 wins";
        } else if ((p2.equals("rock") && p1.equals("scissors")) ||
                (p2.equals("scissors") && p1.equals("paper")) ||
                (p2.equals("paper") && p1.equals("rock"))) {
            return "Player 2 wins";
        } else {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        System.out.println(play("rock", "scissors"));
        System.out.println(play("paper", "rock"));
        System.out.println(play("scissors", "scissors"));
        System.out.println(play("rock", "banana"));
    }
}