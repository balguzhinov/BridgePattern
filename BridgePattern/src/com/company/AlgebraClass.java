package com.company;

public class AlgebraClass extends Lesson{

    protected AlgebraClass(Student student){
        super(student);
    }

    @Override
    public void havingLesson() {
        System.out.println("Algebra class is coming soon...");
        student.attend();
    }
}
