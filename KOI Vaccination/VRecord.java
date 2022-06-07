import java.util.Scanner;

public class VRecord
{
    public  int vID,StudentID;
    String vName;
    boolean check2;
    String check1;

    Scanner sc = new Scanner(System.in);


    VRecord(){}

    VRecord(int StudentID, int vID, String vName)
    {
        this.vID = vID;
        this.StudentID = StudentID;
        this.vName = vName;
    }

    public boolean check()
    {
        System.out.print("Are you vaccinated with Johnson? ");
        check1 = sc.nextLine();
        if(check1.equals("Yes") || check1.equals("yes"))
        {
            check2 = true;
        }
           
        else 
        {
            check2 = false;
        }
            
        return check2;
    }

    public void read()
    {
        System.out.print("\nEnter the name of the Vaccine: " );
        vName = sc.nextLine();
        System.out.print("Enter the id of the student: " );
        StudentID = sc.nextInt();
        System.out.print("Enter the id of the Vaccine: " );
        vID = sc.nextInt();
    }

    @Override
    public String toString()
    {
        return StudentID + " " + vID + " " + vName ;
    }    
}