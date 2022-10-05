import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Put your path here
        final String directory = "C:\\Neumont A\\Q5\\DatabasesII\\Week1Project\\Assignment 1 - data\\people\\simple";

        Manager m = new Manager();

          m.PrintEmployees(directory);
          m.PrintPeopleDetails(directory);

    }
}