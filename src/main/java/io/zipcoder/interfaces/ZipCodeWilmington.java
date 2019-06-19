package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;
    private static ZipCodeWilmington INSTANCE;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance(){
        if(INSTANCE == null){
            INSTANCE =  new ZipCodeWilmington();
        }
        return INSTANCE;
    }


    public void hostLecture(long id, Double numberOfHours){
        Instructor instructingTeacher = null;
        Instructor[] instrustorArray = instructors.toArray();
        for (Instructor instructor : instrustorArray) {
            if (instructor.getId() == id){
                instructingTeacher = instructor;
            }
        }
        if (instructingTeacher != null){
            instructingTeacher.lecture(students.toArray(), numberOfHours);
        }
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        Instructor instructingTeacher = null;
        Instructor[] instructorArray = instructors.toArray();
        for (Instructor instructor : instructorArray) {
            if (instructor.getName().equals(teacher)){
                instructingTeacher = instructor;
            }
        }
        if (instructingTeacher != null) {
            instructingTeacher.lecture(students.toArray(), numberOfHours);
            }
    }


    public Students getStudents(){
        return students;
    }

    public Instructors getInstructors(){
        return instructors;
    }
}
