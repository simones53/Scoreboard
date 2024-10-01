public class Main
{
    public static void main(String[] arg)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println(info);
    
        //test case 1 -> added score to team 1 score
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);

        //test case 2 -> active team switch
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        /* test case 3 -> update team 2 score in record play
        team 2 scores 3 points */
        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);

        //team 2 earns 1 point
        game.recordPlay(1);

        //team 2 fails their turn -> active team becomes 1
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        
        //team 1s turn team 1 fails
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //team 2s turn +4 points
        game.recordPlay(4);
        //team two fails
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //new scoreboard Lions vs Tigers
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        System.out.println(info);

        //print first(game) scoreboard
        info = game.getScore();
        System.out.println(info);
    }
}