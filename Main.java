public class Main
{
    public static void main(String[] args)
    {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issippi"));
        System.out.println(w.scoreGuess("mississippi"));
        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
        WordMatch game2 = new WordMatch("cataraction");
        System.out.println(game2.scoreGuess("ca"));
        System.out.println(game2.scoreGuess("cat"));
        System.out.println(game2.scoreGuess("cataract"));
        System.out.println(game2.scoreGuess("cataracts"));
        System.out.println(game2.scoreGuess("cataractsurgery"));
    }
}