public class MedicalMapper extends Laboratory implements Mapping, Comparable<MedicalMapper> {
    
    // Parameterised constructor to initialize MedicalMapper with patient and lab data
    public MedicalMapper(Patient patient, Laboratory lab) {
        // Calling the superclass (Laboratory) constructor
        super(patient.getPid(), patient.getAge(), patient.getGender(), patient.getHeight(), patient.getWeight(),
              lab.getSbp(), lab.getDbp(), lab.getFbs(), lab.getChol(), lab.getHdl(), lab.getLdl(), lab.getTg(), lab.getHba1c());
    }
    
    /* Mapping Methods in which each method maps a health metric (e.g., BMI, blood pressure, blood sugar, cholesterol, HDL, LDL, etc..)
       to a specific value based on predefined ranges. These ranges categorize the metric into different health risk levels.*/
    @Override
    public int mapBMI(double bmi) {
        if (bmi >= 0 && bmi <= 17.9) {
            return 0;
        } else if (bmi >= 18 && bmi <= 24.9) {
            return 1;
        } else if (bmi > 25 && bmi <= 29.9) {
            return 2;
        } else   {
            return 3;
        }
    }

    @Override
    public int mapBloodPressure(int sbp, int dbp) {
        if (sbp < 130 && dbp < 80) {
            return 1;
        } else if (sbp <= 130 && dbp == 80) {
            return 2;
        } else if (sbp > 130 && dbp < 100) {
            return 3;
        } else if (sbp > 150 && dbp > 100) {
            return 4;
        } else if (sbp > 200) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int mapFBS(double fbs) {
        if (fbs >= 70 && fbs <= 110) {
            return 1;
        } else if (fbs >= 111 && fbs <= 140) {
            return 2;
        } else if (fbs >= 141 && fbs <= 200) {
            return 3;
        } else if (fbs >= 201 && fbs <= 300) {
            return 4;
        } else if (fbs >= 301 && fbs <= 400) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int mapCholestrol(double chol) {
        if (chol >= 50 && chol <= 149) {
            return 1;
        } else if (chol >= 150 && chol <= 184) {
            return 2;
        } else if (chol >= 185 && chol <= 199) {
            return 3;
        } else if (chol >= 200 && chol <= 239) {
            return 4;
        } else if (chol >= 240 && chol <= 500) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int mapHDL(double hdl) {
        if (hdl >= 0 && hdl <= 39) {
            return 5;
        } else if (hdl >= 40 && hdl <= 59) {
            return 4;
        } else if (hdl >= 60 && hdl <= 74) {
            return 3;
        } else if (hdl >= 75 && hdl <= 99) {
            return 2;
        } else if (hdl >= 100 && hdl <= 200) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int mapLDL(double ldl) {
        if (ldl >= 0 && ldl <= 99) {
            return 1;
        } else if (ldl >= 100 && ldl <= 129) {
            return 2;
        } else if (ldl >= 130 && ldl <= 159) {
            return 3;
        } else if (ldl >= 160 && ldl <= 189) {
            return 4;
        } else if (ldl >= 190 && ldl <= 500) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int mapTG(double tg) {
        if (tg >= 0 && tg <= 149) {
            return 1;
        } else if (tg >= 150 && tg <= 179) {
            return 2;
        } else if (tg >= 180 && tg <= 199) {
            return 3;
        } else if (tg >= 200 && tg <= 499) {
            return 4;
        } else if (tg >= 500 && tg <= 1000) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int mapHB1AC(double hba1c) {
        if (hba1c >= 4 && hba1c <= 6) {
            return 1;
        } else if (hba1c >= 6.1 && hba1c <= 7) {
            return 2;
        } else if (hba1c >= 7.1 && hba1c <= 8) {
            return 3;
        } else if (hba1c >= 8.1 && hba1c <= 9) {
            return 4;
        } else if (hba1c >= 9.1 && hba1c <= 20) {
            return 5;
        } else {
            return 0;
        }
    }
    
    // Convert gender from int to char
    public char convertGender(int gender) {
        return gender == 1 ? 'M' : 'F';
    }

    // Calculate the total mapped health metrics score
    public int getTotal() {
        return (mapBMI(super.getBMI())
                + mapBloodPressure(super.getSbp(), super.getDbp())
                + mapFBS(super.getFbs()) + mapCholestrol(super.getChol())
                + mapHDL(super.getHdl()) + mapLDL(super.getLdl())
                + mapTG(super.getTg()) + mapHB1AC(super.getHba1c()));
    }
    
    //Compare two MedicalMapper objects based on their total health metrics score
    @Override
    public int compareTo(MedicalMapper other) {
        return Integer.compare(this.getTotal(), other.getTotal());
    }
    
    // Overriding the toString method to provide a string representation of the MedicalMapper object
    @Override
    public String toString() {
        return super.getPid() + " " +
                super.getAge() + " " +
                convertGender(super.getGender()) + " " +
                mapBMI(super.getBMI()) + " " +
                mapBloodPressure(super.getSbp(), super.getDbp()) + " " +
                mapFBS(super.getFbs()) + " " +
                mapCholestrol(super.getChol()) + " " +
                mapHDL(super.getHdl()) + " " +
                mapLDL(super.getLdl()) + " " +
                mapTG(super.getTg()) + " " +
                mapHB1AC(super.getHba1c()) + " " +
                getTotal();
    }
}
