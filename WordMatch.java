public class WordMatch {
    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int count = 0;
        int guessLength = guess.length();
        int limit = secret.length() - guessLength;

        for (int i = 0; i <= limit; i++) {
            String sub = secret.substring(i, i + guessLength);
            if (sub.equals(guess)) {
                count++;
            }
        }

        return count * guessLength * guessLength;
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            return (guess1.compareTo(guess2) > 0) ? guess1 : guess2;
        }
    }
}