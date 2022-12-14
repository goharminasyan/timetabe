package com.epam.edumanagementtimetabe.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "timetable_table")
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "Please, select the date")
    private LocalDate startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "Please, select the date")
    private LocalDate endDate;

    @OneToOne
    private AcademicClass academicClass;

    public Timetable() {
    }

    public Timetable(Long id, LocalDate startDate, LocalDate endDate, AcademicClass academicClass) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.academicClass = academicClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public AcademicClass getAcademicClass() {
        return academicClass;
    }

    public void setAcademicClass(AcademicClass academicClass) {
        this.academicClass = academicClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timetable timetable = (Timetable) o;
        return id.equals(timetable.id) && startDate.equals(timetable.startDate) && endDate.equals(timetable.endDate) && academicClass.equals(timetable.academicClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, endDate, academicClass);
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", academicClass=" + academicClass +
                '}';
    }
}
