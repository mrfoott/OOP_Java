package OOP.K22PF02.Lab2;

public class Ex2_VTCA_Student {
    private String studentName;
    private double C_Mark, SQLite_Mark, CSharp_Mark;
    public int studentCode;

    public void setStudentName(String studentName) {
        if (!studentName.trim().equals("")) {
            this.studentName = studentName;
        } else {
            this.studentName = "null";
        }
    }

    public void setC_Mark(double c_Mark) {
        if (c_Mark >= 0 && c_Mark <= 10) {
            this.C_Mark = c_Mark;
        } else {
            this.C_Mark = 0;
        }
    }

    public void setSQLite_Mark(double SQLite_Mark) {
        if (SQLite_Mark >= 0 && SQLite_Mark <= 10) {
            this.SQLite_Mark = SQLite_Mark;
        } else {
            this.SQLite_Mark = 0;
        }
    }

    public void setCSharp_Mark(double CSharp_Mark) {
        if (CSharp_Mark >= 0 && CSharp_Mark <= 10) {
            this.CSharp_Mark = CSharp_Mark;
        } else {
            this.CSharp_Mark = 0;
        }
    }

    public void setStudentCode(int studentCode) {
        if (studentCode > 0 && studentCode < 999999) {
            this.studentCode = studentCode;
        } else {
            this.studentCode = 999999;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public double getC_Mark() {
        return C_Mark;
    }

    public double getSQLite_Mark() {
        return SQLite_Mark;
    }

    public double getCSharp_Mark() {
        return CSharp_Mark;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public Ex2_VTCA_Student() {
        studentName = "null";
        C_Mark = 0;
        SQLite_Mark = 0;
        CSharp_Mark = 0;
        studentCode = 9999999;
    }

    public Ex2_VTCA_Student(String studentName, double c_Mark, double SQLite_Mark, double CSharp_Mark, int studentCode) {
        if (!studentName.trim().equals("")) {
            this.studentName = studentName;
        } else {
            this.studentName = "null";
        }

        if (c_Mark >= 0 && c_Mark <= 10) {
            this.C_Mark = c_Mark;
        } else {
            this.C_Mark = 0;
        }

        if (SQLite_Mark >= 0 && SQLite_Mark <= 10) {
            this.SQLite_Mark = SQLite_Mark;
        } else {
            this.SQLite_Mark = 0;
        }

        if (CSharp_Mark >= 0 && CSharp_Mark <= 10) {
            this.CSharp_Mark = CSharp_Mark;
        } else {
            this.CSharp_Mark = 0;
        }

        if (studentCode > 0 && studentCode < 999999) {
            this.studentCode = studentCode;
        } else {
            this.studentCode = 999999;
        }
    }

    public double averageMark() {
        return (this.C_Mark + this.SQLite_Mark + this.CSharp_Mark) / 3;
    }

    @Override
    public String toString() {
        return String.format("Average mark of " + this.getStudentName() + " is " + averageMark());
    }
}
