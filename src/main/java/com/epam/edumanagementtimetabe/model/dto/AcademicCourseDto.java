package com.epam.edumanagementtimetabe.model.dto;

import com.epam.edumanagementtimetabe.model.entity.Subject;

public class AcademicCourseDto {

    private Long id;
    private String name;
    private Subject subject;

    public AcademicCourseDto() {

    }

    public AcademicCourseDto(Long id, String academicCourseName, Subject subject) {
        this.id = id;
        this.name = academicCourseName;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
