package com.epam.edumanagementtimetabe.model.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "courses_table")
public class CoursesForTimetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "academic_course_name")
    private String academicCourse;

    @ManyToMany
    @JoinTable(name = "courses_table", joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "academic_class_id"))
    private List<AcademicClass> academicClass;

    private String dayOfWeek;


    public CoursesForTimetable() {
    }

    public CoursesForTimetable(Long id, String academicCourse, List<AcademicClass> academicClass, String dayOfWeek) {
        this.id = id;
        this.academicCourse = academicCourse;
        this.academicClass = academicClass;
        this.dayOfWeek = dayOfWeek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcademicCourse() {
        return academicCourse;
    }

    public void setAcademicCourse(String academicCourse) {
        this.academicCourse = academicCourse;
    }

    public List<AcademicClass> getAcademicClass() {
        return academicClass;
    }

    public void setAcademicClass(List<AcademicClass> academicClass) {
        this.academicClass = academicClass;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesForTimetable that = (CoursesForTimetable) o;
        return id.equals(that.id) && academicCourse.equals(that.academicCourse) && academicClass.equals(that.academicClass) && dayOfWeek.equals(that.dayOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, academicCourse, academicClass, dayOfWeek);
    }

    @Override
    public String toString() {
        return "CoursesForTimetable{" +
                "id=" + id +
                ", academicCourse='" + academicCourse + '\'' +
                ", academicClass=" + academicClass +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
