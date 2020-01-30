public class Tennis extends Sport
{
    int outOfBounds;
    public Tennis(int score, String team, String equipment, int outOfBounds)
    {
        super(score,team,equipment);
        this.outOfBounds = outOfBounds;
    }//end all arg constructor w/ call to super
    public String toString()
    {
        return super.toString()+"\nOut of Bounds: "+outOfBounds;
    }//end toString /w call to super
}//end Tennis class - child of sport
