package com.company;

public class GeometryClass extends Lesson{

    protected GeometryClass(Student student){
        super(student);
    }

    @Override
    public void havingLesson() {
        System.out.println("Geometry class is coming soon...");
        student.attend();
    }
}
