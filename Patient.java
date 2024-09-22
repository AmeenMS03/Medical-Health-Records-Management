public class Patient {
    private int pid;       
    private int age;       
    private int gender;    
    private double height; 
    private double weight;

     /* A parameterised constructor to initialize the attributes through the this keyword 
       to assign the constructor parameters to each of the instance variables (attributes)
       of the 'Patient' class */
    public Patient(int pid, int age, int gender, double height, double weight) {
        this.pid = pid;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
    
    // Getters for the Patient data fields
    public double getBMI() {
        return weight / Math.pow(height * 0.01, 2);
    }
    
    public int getPid() {
        return pid;
    }
    
    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
}
