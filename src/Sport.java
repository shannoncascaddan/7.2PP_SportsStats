public abstract class Sport
{
    protected int score;
    protected String team;
    protected String equipment;

    public Sport(int score, String team, String equipment)
    {
        this.score = score;
        this.team = team;
        this.equipment = equipment;
    }//end all arg constructor
    public String toString()
    {
        String output = "Score: "+score;
        output += "\nTeam: "+team;
        output += "\nEquipment: "+equipment;
        return output;
    }//end to String
}//end abstract Sport class
