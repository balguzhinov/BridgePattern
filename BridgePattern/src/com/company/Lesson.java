package com.company;

public abstract class Lesson {
    protected Student student;

    public Lesson(Student student){
        this.student = student;
    }

    public abstract void havingLesson();
}
