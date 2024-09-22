public class Laboratory extends Patient{
    
    /* Private data field (attributes) which can't be accessed outside this class 
       .However, the getter methods will be used to access those attributes */
       private int sbp;        
       private int dbp;        
       private double fbs;     
       private double chol;  
       private double hdl;     
       private double ldl;     
       private double tg;      
       private double hba1c;   
       
       /* A parameterised constructor to initialize the attributes through the 'this' keyword 
          to assign the constructor parameters to each of the instance variables (attributes)
          of the 'Laboratory' class */
       public Laboratory(int pid, int age, int gender, double height, double weight, int sbp, int dbp, double fbs, double chol, double hdl, double ldl, double tg, double hba1c) {
           super(pid, age, gender, height, weight);
           this.sbp = sbp;       
           this.dbp = dbp;       
           this.fbs = fbs;       
           this.chol = chol;     
           this.hdl = hdl;       
           this.ldl = ldl;       
           this.tg = tg;         
           this.hba1c = hba1c;  
       }
       
       // Getters for the Laboratory data fields
       public int getSbp() {
           return sbp;
       }
       
       public int getDbp() {
           return dbp;
       }
           
       public double getFbs() {
           return fbs;
       }
       
       public double getChol() {
           return chol;
       }
       
       public double getHdl() {
           return hdl;
       }
       
       public double getLdl() {
           return ldl;
       }
       
       public double getTg() {
           return tg;
       }
       
       public double getHba1c() {
           return hba1c;
       }
}
