package com.company;

public class Main {

    public static void main(String[] args) {

        Lesson [] lessons = {
                new AlgebraClass(new Dias()),
                new GeometryClass(new Erhan())
        };

        for(Lesson lesson: lessons){
            lesson.havingLesson();
        }


    }
}
