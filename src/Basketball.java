public class Basketball extends Sport
{
    int basketsMissed;
    public Basketball(int score, String team, String equipment, int basketsMissed)
    {
        super(score,team,equipment);
        this.basketsMissed = basketsMissed;
    }//end all arg constructor /w call to super
    public String toString()
    {
        return super.toString()+"\nBaskets Missed: "+basketsMissed;
    }//end toString /w call to super
}//end Basketball class - child of sport