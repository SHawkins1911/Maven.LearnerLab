package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        Student student = new Student(2);
        student.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {

        for (Learner learner : learners){
          Student student = new Student(2);
          student.learn(numberOfHours/learners.length);
        }
    }
}
