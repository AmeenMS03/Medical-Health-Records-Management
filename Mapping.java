public interface Mapping {
    // Maps the calculated BMI to a specific value based on predefined ranges.
    int mapBMI(double bmi);
    
    /* Maps the systolic blood pressure (SBP) and diastolic blood pressure (DBP)
       to a specific value based on predefined ranges.
    */
    int mapBloodPressure(int sbp, int dbp);
    
    // Maps the fasting blood sugar (fbs) to a specific value based on predefined ranges.
    int mapFBS(double fbs);
    
    // Maps the cholesterol level (chol) to a specific value based on predefined ranges.
    int mapCholestrol(double chol);

    // Maps the high-density lipoprotein (HDL) level to a specific value based on predefined ranges.
    int mapHDL(double hdl);

    // Maps the low-density lipoprotein (LDL) level to a specific value based on predefined ranges.
    int mapLDL(double ldl);

    // Maps the triglyceride (TG) level to a specific value based on predefined ranges.
    int mapTG(double tg);

    // Maps the HbA1c level to a specific value based on predefined ranges.
    int mapHB1AC(double hba1c);
}
