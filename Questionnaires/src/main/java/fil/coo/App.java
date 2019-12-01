package fil.coo;

import fil.coo.Quizz.CLIQuizz;

/**
 * Main app
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CLIQuizz quizz = new CLIQuizz("question_tolkien_2.txt");
        quizz.startQuizz();
    }
}
