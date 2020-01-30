public class SportsDriver
{
    public static void main(String[] args)
    {
        Basketball basketball = new Basketball(23, "Lakers", "Ball, Hoop", 4);
        Soccer soccer = new Soccer(12,"Puppies", "Ball, goal",7);
        Tennis tennis = new Tennis(5,"Sea Lions","Racket, Ball", 3);

        System.out.println("Basketball:\n"+basketball);
        System.out.println("Soccer:\n"+soccer);
        System.out.println("Tennis:\n"+tennis);
    }//end main method
}//end driver class
