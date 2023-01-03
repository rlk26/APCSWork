public class TestScoreKeeper {
    public static void main(String[] args) {
        ScoreKeeper score = new ScoreKeeper();

        score.scoreBonus();
        score.scoreNormal();
        score.scoreNormal();
        score.scoreNormal();

        System.out.println("Score total: " + score.total());

        ScoreKeeper score2 = new ScoreKeeper();
        score2.scoreBonus();
        score2.scoreBonus();
        score2.scoreBonus();
        score2.scoreBonus();
        score2.scoreBonus();
        score2.scoreNormal();

        System.out.println("Score2 total: " + score2.total());
    }
}
