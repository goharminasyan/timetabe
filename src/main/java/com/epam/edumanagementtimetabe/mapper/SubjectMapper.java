package com.epam.edumanagementtimetabe.mapper;

import com.epam.edumanagementtimetabe.model.dto.SubjectDto;
import com.epam.edumanagementtimetabe.model.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectMapper {
    public static Subject toSubject(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setId(subjectDto.getId());
        subject.setName(subjectDto.getName());
        subject.setTeacherSet(subjectDto.getTeacherSet());
        return subject;
    }

    public static SubjectDto toDto(Subject subject) {
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setId(subject.getId());
        subjectDto.setName(subject.getName());
        subjectDto.setTeacherSet(subject.getTeacherSet());
        return subjectDto;
    }

    public static List<SubjectDto> toSubjectDtoList(List<Subject> subjects) {
        List<SubjectDto> subjectDtoList = new ArrayList<>();
        for (Subject subject : subjects) {
            subjectDtoList.add(toDto(subject));
        }
        return subjectDtoList;
    }

    public static List<Subject> toSubjectsList(List<SubjectDto> subjectDtos) {
        List<Subject> subjects = new ArrayList<>();
        for (SubjectDto subjectDto : subjectDtos) {
            subjects.add(toSubject(subjectDto));
        }
        return subjects;
    }
}