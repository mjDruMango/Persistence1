import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Put your path here
        final String simpleDirectory = "C:\\Neumont A\\Q5\\DatabasesII\\Week1Project\\Assignment 1 - data\\people\\simple";
        final String longDirectory = "C:\\Neumont A\\Q5\\DatabasesII\\Week1Project\\Assignment 1 - data\\people\\long";

        Manager m = new Manager();

          m.PrintEmployees(simpleDirectory);
          m.PrintPeopleDetails(simpleDirectory);


    }
}