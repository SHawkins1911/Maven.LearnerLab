package io.zipcoder.interfaces;


public final class Students extends People<Student> {
    private static Students INSTANCE;

    private final String[] studentNames = {"Ben C", "Ben R", "Edward", "Alex I", "Alex B", "Kavya", "Prashanti", "Reese",
            "Joanna", " Angelica", "Erik", "Bob", "Robert", "Abram", "Andrew", "Anish", "Donna", "William", "Ajulu", "Justin",
            "Sputnika", "Dan", "Caleb", "Alicia", " Dasha", "Aashna", "Connor"};

    public static Students getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Students();
        }
        return INSTANCE;
    }

    private Students(){
        for (int i = 0; i < studentNames.length ; i++) {
            Student addStudent = new Student(i+1);
            addStudent.setName(studentNames[i]);
            add(addStudent);

        }
    }

    public Student [] toArray(){
        Student[] studentArray = new Student[personList.size()];

        for (int i =0; i < studentArray.length; i++) {
            studentArray[i] = (Student) personList.get(i);
        }
        return studentArray;
    }
}
