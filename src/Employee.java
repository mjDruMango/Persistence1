
public class Employee
{
    // Declaring Class Variables
    private int id;
    private String firstName;
    private String lastName;
    private int hireYear;

    public Employee(){}

    public Employee(int id, String firstName, String lastName, int hireYear){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setHireYear(hireYear);
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public int getHireYear()
    {
        return hireYear;
    }
    public void setHireYear(int hireYear)
    {
        this.hireYear = hireYear;
    }

    @Override
    public String toString()
    {
        // This will present all the data for the Employee to the console
        return "Name: " + firstName + " " + lastName + '\n' +
                "ID: " + id +'\n' +
                "Hire Year: " + hireYear + '\n';
    }
}
