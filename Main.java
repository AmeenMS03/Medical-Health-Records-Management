import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        try {
            // Defining the input and output files
            File file = new File("medicalRecords.txt");
            Scanner input = new Scanner(file);
            FileWriter writer = new FileWriter("convertedMedicalRecords.txt");
            
            // Create a list to hold MedicalMapper objects
            ArrayList<MedicalMapper> mapperList = new ArrayList<>();
            
            // Reading data from the input file and create Patient, Laboratory, and MedicalMapper objects
            while (input.hasNext()) {
                int pid = input.nextInt();
                int age = input.nextInt();
                int gender = input.nextInt();
                double weight = input.nextDouble();
                double height = input.nextDouble();
                int sbp = input.nextInt();
                int dbp = input.nextInt();
                double fbs = input.nextDouble();
                double chol = input.nextDouble();
                double ldl = input.nextDouble();
                double hdl = input.nextDouble();
                double tg = input.nextDouble();
                double hba1c = input.nextDouble();
                
                // Creating Patient and Laboratory objects 
                Patient patient = new Patient(pid, age, gender, height, weight);
                Laboratory lab = new Laboratory(pid, age, gender, height, weight, sbp, dbp, fbs, chol, hdl, ldl, tg, hba1c);
                
                // Creating a MedicalMapper object and adding it to the list
                MedicalMapper mapper = new MedicalMapper(patient, lab);
                mapperList.add(mapper);
            }
            
            // Sorting the list of MedicalMapper objects
            Collections.sort(mapperList);
            
            // Writing the sorted MedicalMapper objects to the output file
            for (int i = 0; i < mapperList.size(); i++) {
                writer.write(mapperList.get(i).toString() + "\n");
            }
            
            // Closing the writer and input scanner
            writer.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    
    

   
   
    
