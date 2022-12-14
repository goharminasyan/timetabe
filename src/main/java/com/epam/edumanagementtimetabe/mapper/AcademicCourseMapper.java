package com.epam.edumanagementtimetabe.mapper;

import com.epam.edumanagementtimetabe.model.dto.AcademicCourseDto;
import com.epam.edumanagementtimetabe.model.entity.AcademicCourse;
import com.epam.edumanagementtimetabe.rest.service.AcademicCourseService;

import java.util.ArrayList;
import java.util.List;

public class AcademicCourseMapper {

    private static AcademicCourseService academicCourseService;

    public AcademicCourseMapper(AcademicCourseService academicCourseService) {
        this.academicCourseService = academicCourseService;
    }

    public static AcademicCourse toAcademicCourse(AcademicCourseDto academicCourseDto) {
        AcademicCourse academicCourse = new AcademicCourse();
//        academicCourse.setId(academicCourseDto.getId());
        academicCourse.setName(academicCourseDto.getName());
        academicCourse.setSubject(academicCourseDto.getSubject());
        return academicCourse;
    }

    public static AcademicCourseDto toDto(AcademicCourse academicCourse) {
        AcademicCourseDto academicCourseDto = new AcademicCourseDto();
        academicCourseDto.setId(academicCourse.getId());
        academicCourseDto.setName(academicCourse.getName());
        academicCourseDto.setSubject(academicCourse.getSubject());
        return academicCourseDto;
    }

    public static List<AcademicCourseDto> toListOfAcademicCourseDto(List<AcademicCourse> academicCourses) {
        List<AcademicCourseDto> academicCourseDtos = new ArrayList<>();
        for (AcademicCourse academicCourse : academicCourses) {
            academicCourseDtos.add(toDto(academicCourse));
        }
        return academicCourseDtos;
    }

    public static List<AcademicCourse> toListOfAcademicCourses(List<AcademicCourseDto> academicCourseDtos) {
        List<AcademicCourse> academicCourses = new ArrayList<>();
        for (AcademicCourseDto academicCourseDto : academicCourseDtos) {
            academicCourses.add(toAcademicCourse(academicCourseDto));
        }
        return academicCourses;
    }
}
