public class Soccer extends Sport
{
    int goalsMissed;
    public Soccer(int score, String team, String equipment, int goalsMissed)
    {
        super(score,team,equipment);
        this.goalsMissed = goalsMissed;
    }//end all arg constructor /w call to super
    public String toString()
    {
        return super.toString()+"\nGoals Missed: "+goalsMissed;
    }//end toString /w call to super
}//end Soccer class - child of sport
