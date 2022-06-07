public class Tester {
    public static void main(String args[])
    {
        int j=0, k=0;
        String[] vaccinated = new String[6];
        String[] nvaccinated = new String[6];
        VRecord[] obj = new VRecord[6];

        obj[0] = new VRecord(1, 1, "Fizer");
        obj[1] = new VRecord(12, 2, "Johnson");
        obj[2] = new VRecord(13, 3, "Verosel");
        obj[3] = new VRecord(14, 4, "Antibiotic");
        obj[4] = new VRecord(15, 5, "Type 2 DIabeties");
        obj[5] = new VRecord(16, 6, "Stage 2 cancer");
        
        // for(int i =0; i<6; i++)
        // {
        //     boolean checkFor = true;
        //     boolean rec = obj[i].check();
        //     int checkBoolean = Boolean.compare(checkFor,rec); 
          
        //     if(checkBoolean == 1)
        //     {
        //         vaccinated[j] = obj[i].toString();
        //         j++;
        //     }
        //     else
        //     {
        //         nvaccinated[k] = obj[i].toString();
        //         k++;
        //     }

        // }

        System.out.println("\nVaccinated Lists:");
        for(int i=0; i < k; i++ )
        {
            System.out.println(nvaccinated[i]);
        }

        System.out.println("\nNon-Vaccinated Lists:"); 
        for(int i=0; i <j; i++ )
        {
            System.out.println(vaccinated[i] );
        }

       
       
    }
}
