import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class Manager
{
    public void read(String path)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String output;
            while ((output = br.readLine()) != null)
            {
                System.out.println(output);
            }
            br.close();
        } catch (Exception e)
        {
            return;
        }
    }


    public void PrintPeopleDetails(String path)
    {
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a file object of the main directory
        File f = new File(path);

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in array, print the filename and contents of file
        for (String pathname : pathnames)
        {
            // Print the names of files and directories
            System.out.print(pathname + " : ");
            read(path + "\\" + pathname);
        }
    }

    public void PrintEmployees(String path) throws FileNotFoundException
    {
        //String[] pathnames;
        File f = new File(path);
        String[] pathNames = f.list();

        for (String pathname:pathNames)
        {
            Scanner input = new Scanner(new File(path + "\\" + pathname));
            input.useDelimiter(", ");
            while(input.hasNext())
            {
                int id = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                int hireYear = Integer.parseInt(input.next().trim());

                Employee e = new Employee(id, firstName, lastName, hireYear);

                System.out.println(e);
            }
        }



    }

}