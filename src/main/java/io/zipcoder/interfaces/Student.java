package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;
    private double numberOfHours;


    public Student(long id) {
        super(id, name);
    }

    public double learn(double totalStudyTime, double numberOfHours){
        totalStudyTime += numberOfHours;
        return totalStudyTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void learn(double numberOfHours) {

    }


}
