public class ScoreKeeper
{
    public ScoreKeeper()  {
        amount = 0;
    }

    public void scoreNormal() {
        amount += 100;
    }

    public void scoreBonus()  {
        amount += 1000;
    }

    public double total()  {
        return amount;
    }

    private int amount;
}
