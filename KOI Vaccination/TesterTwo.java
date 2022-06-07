import java.util.Scanner;

public class TesterTwo {

    public static void main(String args[])
    {
        
        VRecord[] obj = new VRecord[10];

        Scanner sc = new Scanner(System.in);

        String check;
        int j=0;
        label:
        for(int i =0 ; i<10; i++)
        {         
            obj[i]= new VRecord();
            obj[i].read();
            j++;
            System.out.print("Do you want to continue? (yes/no): ");
            check = sc.nextLine();

            if(check.equals("yes") || check.equals("Yes"))
                continue label;
            else if(check.equals("no") || check.equals("No"))
                break label;
            else
                System.out.println("Enter only yes or no.");
          
        }
        
        System.out.println("List of inputted data: ");
        for(int i=0; i<=j; i++)
        {
            System.out.println(obj[i].toString());
        }
        
    }
    
}
