package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa){
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGpa;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public String getName(){
        return name;
    }

    public void setStudentId(int aStudentId){
        this.studentId = aStudentId;
    }

    public int getStudentId(){
        return studentId;
    }

    private void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }

    private int getNumberOfCredits(){
        return numberOfCredits;
    }

    private void setGpa(double aGpa){
        this.gpa = aGpa;
    }

    private double getGpa(){
        return gpa;
    }



}