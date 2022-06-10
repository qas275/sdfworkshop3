package vttp2022.day3.workshop;

/**
 * Main program
 *df
 */
public class App 
{
    private static String defaultDb= "db";
    public static void main( String[] args )
    {
        // print out argument db name, which is used to create the directory/folder name
        //check for input from command, if input exists rename db, if not continue with default name for db. run rpogram
        if(args.length > 0)
            if(args[0] != null){
                System.out.println( args[0]);
                App.defaultDb = args[0];//why is there a need for app. since we're in the same class already
            }
        System.out.println( defaultDb );
        Repository repo = new Repository(defaultDb);
        Session session = new Session(repo);
        session.start();

    }
}