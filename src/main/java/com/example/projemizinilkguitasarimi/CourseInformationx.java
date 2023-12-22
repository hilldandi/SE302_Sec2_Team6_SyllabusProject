package com.example.projemizinilkguitasarimi;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CourseInformationx {

    public int version;
    // The data on TAB1

    public String courseName;
    public String code;
    public String season;

    public String theory;
    public String lab;
    public String localCredits;
    public String ects;
    public String prerequisities;
    public String courseLanguage;
    public String courseType;
    public String courseLevel;
    public String modeOfDelivery;

    public String teachingMethodsAndTechniques;
    public String courseCoordinator;

    public String courseLecturers;
    public String courseAssistants;

    //the data on TAB2

    public String courseObjectives;
    public String learningOutcomes;
    public String courseDescription;

    public String CCCoreCourse;
    public String CCMajorAreaCourse;
    public String CCSupportiveCourse;
    public String CCComAndManagementSkillsCourse;
    public String CCTransferableSkillCourse;


    //tab4




    //the data on TAB4 Assessment

    public String noOfParticipation;
    public String noOfLabOrApplication;
    public String noOfFieldWork;
    public String noOfQuizOrStudioCritique;
    public String noOfHwOrAssignment;
    public String noOfPresentationOrJury;
    public String noOfProject;
    public String noOfPortfolio;
    public String noOfSeminarOrWorkshop;
    public String noOfOralExam;
    public String noOfMidterm;
    public String noOfFinalExam;
    public String noOfPresentationJury;
    public String noOfTotalWeight;
    public String weightOfParticipation;
    public String weightOfLabOrApplication;
    public String weightOfFieldWork;
    public String weightOfQuizOrStudioCritique;
    public String weightOfHwOrAssignment;
    public String weightOfPresentationOrJury;
    public String weightOfProject;
    public String weightOfPortfolio;

    public String weightOfSeminarOrWorkshop;
    public String weightOfOralExam;
    public String weightOfMidterm;
    public String weightOfFinalExam;
    public String weightOfPresentationJury;
    public String weightOfTotalWeight;

    public String LO1OfParticipation;
    public String LO1OfLabOrApplication;
    public String LO1OfFieldWork;
    public String LO1OfQuizOrStudioCritique;
    public String LO1OfHwOrAssignment;
    public String LO1OfPresentationOrJury;
    public String LO1OfProject;
    public String L01OfPortfolio;
    public String LO1OfSeminarOrWorkshop;
    public String LO1OfOralExam;
    public String LO1OfMidterm;
    public String LO1OfFinalExam;
    public String LO1OfPresentationJury;
    public String LO1OfTotalWeight;

    public String LO2OfParticipation;
    public String LO2OfLabOrApplication;
    public String LO2OfFieldWork;
    public String LO2OfQuizOrStudioCritique;
    public String LO2OfHwOrAssignment;
    public String LO2OfPresentationOrJury;
    public String LO2OfProject;
    public String L02OfPortfolio;
    public String LO2OfSeminarOrWorkshop;
    public String LO2OfOralExam;
    public String LO2OfMidterm;
    public String LO2OfFinalExam;
    public String LO2OfPresentationJury;
    public String LO2OfTotalWeight;

    public String LO3OfParticipation;
    public String LO3OfLabOrApplication;
    public String LO3OfFieldWork;
    public String LO3OfQuizOrStudioCritique;
    public String LO3OfHwOrAssignment;
    public String LO3OfPresentationOrJury;
    public String LO3OfProject;
    public String L03OfPortfolio;
    public String LO3OfSeminarOrWorkshop;
    public String LO3OfOralExam;
    public String LO3OfMidterm;
    public String LO3OfFinalExam;
    public String LO3OfPresentationJury;
    public String LO3OfTotalWeight;

    public String LO4OfParticipation;
    public String LO4OfLabOrApplication;
    public String LO4OfFieldWork;
    public String LO4OfQuizOrStudioCritique;
    public String LO4OfHwOrAssignment;
    public String LO4OfPresentationOrJury;
    public String LO4OfProject;
    public String L04OfPortfolio;
    public String LO4OfSeminarOrWorkshop;
    public String LO4OfOralExam;
    public String LO4OfMidterm;
    public String LO4OfFinalExam;
    public String LO4OfPresentationJury;
    public String LO4OfTotalWeight;

    public String LO5OfParticipation;
    public String LO5OfLabOrApplication;
    public String LO5OfFieldWork;
    public String LO5OfQuizOrStudioCritique;
    public String LO5OfHwOrAssignment;
    public String LO5OfPresentationOrJury;
    public String LO5OfProject;
    public String L05OfPortfolio;
    public String LO5OfSeminarOrWorkshop;
    public String LO5OfOralExam;
    public String LO5OfMidterm;
    public String LO5OfFinalExam;
    public String LO5OfPresentationJury;
    public String LO5OfTotalWeight;

    public String LO6OfParticipation;
    public String LO6OfLabOrApplication;
    public String LO6OfFieldWork;
    public String LO6OfQuizOrStudioCritique;
    public String LO6OfHwOrAssignment;
    public String LO6OfPresentationOrJury;
    public String LO6OfProject;
    public String L06OfPortfolio;
    public String LO6OfSeminarOrWorkshop;
    public String LO6OfOralExam;
    public String LO6OfMidterm;
    public String LO6OfFinalExam;
    public String LO6OfPresentationJury;
    public String LO6OfTotalWeight;

    public String LO7OfParticipation;
    public String LO7OfLabOrApplication;
    public String LO7OfFieldWork;
    public String LO7OfQuizOrStudioCritique;

    public int getVersion() {
        return version;
    }

    public String LO7OfHwOrAssignment;
    public String LO7OfPresentationOrJury;
    public String LO7OfProject;
    public String L07OfPortfolio;
    public String LO7OfSeminarOrWorkshop;
    public String LO7OfOralExam;
    public String LO7OfMidterm;
    public String LO7OfFinalExam;
    public String LO7OfPresentationJury;
    public String LO7OfTotalWeight;

    public String weightOfSemActivitiesOnFinalGrade1;
    public String weightOfSemActivitiesOnFinalGrade2;

    public String weightOfEndOfSemActivitiesOnFinalGrade1;
    public String weightOfEndOfSemActivitiesOnFinalGrade2;

    public String endOfTab4Total1;
    public String endOfTab4Total2;

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getLocalCredits() {
        return localCredits;
    }

    public void setLocalCredits(String localCredits) {
        this.localCredits = localCredits;
    }

    public String getEcts() {
        return ects;
    }

    public void setEcts(String ects) {
        this.ects = ects;
    }

    public String getPrerequisities() {
        return prerequisities;
    }

    public void setPrerequisities(String prerequisities) {
        this.prerequisities = prerequisities;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getModeOfDelivery() {
        return modeOfDelivery;
    }

    public void setModeOfDelivery(String modeOfDelivery) {
        this.modeOfDelivery = modeOfDelivery;
    }

    public String getTeachingMethodsAndTechniques() {
        return teachingMethodsAndTechniques;
    }

    public void setTeachingMethodsAndTechniques(String teachingMethodsAndTechniques) {
        this.teachingMethodsAndTechniques = teachingMethodsAndTechniques;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public void setCourseCoordinator(String courseCoordinator) {
        this.courseCoordinator = courseCoordinator;
    }

    public String getCourseLecturers() {
        return courseLecturers;
    }

    public void setCourseLecturers(String courseLecturers) {
        this.courseLecturers = courseLecturers;
    }

    public String getCourseAssistants() {
        return courseAssistants;
    }

    public void setCourseAssistants(String courseAssistants) {
        this.courseAssistants = courseAssistants;
    }

    public String getCourseObjectives() {
        return courseObjectives;
    }

    public void setCourseObjectives(String courseObjectives) {
        this.courseObjectives = courseObjectives;
    }

    public String getLearningOutcomes() {
        return learningOutcomes;
    }

    public void setLearningOutcomes(String learningOutcomes) {
        this.learningOutcomes = learningOutcomes;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCCCoreCourse() {
        return CCCoreCourse;
    }

    public void setCCCoreCourse(String CCCoreCourse) {
        this.CCCoreCourse = CCCoreCourse;
    }

    public String getCCMajorAreaCourse() {
        return CCMajorAreaCourse;
    }

    public void setCCMajorAreaCourse(String CCMajorAreaCourse) {
        this.CCMajorAreaCourse = CCMajorAreaCourse;
    }

    public String getCCSupportiveCourse() {
        return CCSupportiveCourse;
    }

    public void setCCSupportiveCourse(String CCSupportiveCourse) {
        this.CCSupportiveCourse = CCSupportiveCourse;
    }

    public String getCCComAndManagementSkillsCourse() {
        return CCComAndManagementSkillsCourse;
    }

    public void setCCComAndManagementSkillsCourse(String CCComAndManagementSkillsCourse) {
        this.CCComAndManagementSkillsCourse = CCComAndManagementSkillsCourse;
    }

    public String getCCTransferableSkillCourse() {
        return CCTransferableSkillCourse;
    }

    public void setCCTransferableSkillCourse(String CCTransferableSkillCourse) {
        this.CCTransferableSkillCourse = CCTransferableSkillCourse;
    }

    public String getNoOfParticipation() {
        return noOfParticipation;
    }

    public void setNoOfParticipation(String noOfParticipation) {
        this.noOfParticipation = noOfParticipation;
    }

    public String getNoOfLabOrApplication() {
        return noOfLabOrApplication;
    }

    public void setNoOfLabOrApplication(String noOfLabOrApplication) {
        this.noOfLabOrApplication = noOfLabOrApplication;
    }

    public String getNoOfFieldWork() {
        return noOfFieldWork;
    }

    public void setNoOfFieldWork(String noOfFieldWork) {
        this.noOfFieldWork = noOfFieldWork;
    }

    public String getNoOfQuizOrStudioCritique() {
        return noOfQuizOrStudioCritique;
    }

    public void setNoOfQuizOrStudioCritique(String noOfQuizOrStudioCritique) {
        this.noOfQuizOrStudioCritique = noOfQuizOrStudioCritique;
    }

    public String getNoOfHwOrAssignment() {
        return noOfHwOrAssignment;
    }

    public void setNoOfHwOrAssignment(String noOfHwOrAssignment) {
        this.noOfHwOrAssignment = noOfHwOrAssignment;
    }

    public String getNoOfPresentationOrJury() {
        return noOfPresentationOrJury;
    }

    public void setNoOfPresentationOrJury(String noOfPresentationOrJury) {
        this.noOfPresentationOrJury = noOfPresentationOrJury;
    }

    public String getNoOfProject() {
        return noOfProject;
    }

    public void setNoOfProject(String noOfProject) {
        this.noOfProject = noOfProject;
    }

    public String getNoOfPortfolio() {
        return noOfPortfolio;
    }

    public void setNoOfPortfolio(String noOfPortfolio) {
        this.noOfPortfolio = noOfPortfolio;
    }

    public String getNoOfSeminarOrWorkshop() {
        return noOfSeminarOrWorkshop;
    }

    public void setNoOfSeminarOrWorkshop(String noOfSeminarOrWorkshop) {
        this.noOfSeminarOrWorkshop = noOfSeminarOrWorkshop;
    }

    public String getNoOfOralExam() {
        return noOfOralExam;
    }

    public void setNoOfOralExam(String noOfOralExam) {
        this.noOfOralExam = noOfOralExam;
    }

    public String getNoOfMidterm() {
        return noOfMidterm;
    }

    public void setNoOfMidterm(String noOfMidterm) {
        this.noOfMidterm = noOfMidterm;
    }

    public String getNoOfFinalExam() {
        return noOfFinalExam;
    }

    public void setNoOfFinalExam(String noOfFinalExam) {
        this.noOfFinalExam = noOfFinalExam;
    }

    public String getNoOfPresentationJury() {
        return noOfPresentationJury;
    }

    public void setNoOfPresentationJury(String noOfPresentationJury) {
        this.noOfPresentationJury = noOfPresentationJury;
    }

    public String getNoOfTotalWeight() {
        return noOfTotalWeight;
    }

    public void setNoOfTotalWeight(String noOfTotalWeight) {
        this.noOfTotalWeight = noOfTotalWeight;
    }

    public String getWeightOfParticipation() {
        return weightOfParticipation;
    }

    public void setWeightOfParticipation(String weightOfParticipation) {
        this.weightOfParticipation = weightOfParticipation;
    }

    public String getWeightOfLabOrApplication() {
        return weightOfLabOrApplication;
    }

    public void setWeightOfLabOrApplication(String weightOfLabOrApplication) {
        this.weightOfLabOrApplication = weightOfLabOrApplication;
    }

    public String getWeightOfFieldWork() {
        return weightOfFieldWork;
    }

    public void setWeightOfFieldWork(String weightOfFieldWork) {
        this.weightOfFieldWork = weightOfFieldWork;
    }

    public String getWeightOfQuizOrStudioCritique() {
        return weightOfQuizOrStudioCritique;
    }

    public void setWeightOfQuizOrStudioCritique(String weightOfQuizOrStudioCritique) {
        this.weightOfQuizOrStudioCritique = weightOfQuizOrStudioCritique;
    }

    public String getWeightOfHwOrAssignment() {
        return weightOfHwOrAssignment;
    }

    public void setWeightOfHwOrAssignment(String weightOfHwOrAssignment) {
        this.weightOfHwOrAssignment = weightOfHwOrAssignment;
    }

    public String getWeightOfPresentationOrJury() {
        return weightOfPresentationOrJury;
    }

    public void setWeightOfPresentationOrJury(String weightOfPresentationOrJury) {
        this.weightOfPresentationOrJury = weightOfPresentationOrJury;
    }

    public String getWeightOfProject() {
        return weightOfProject;
    }

    public void setWeightOfProject(String weightOfProject) {
        this.weightOfProject = weightOfProject;
    }

    public String getWeightOfPortfolio() {
        return weightOfPortfolio;
    }

    public void setWeightOfPortfolio(String weightOfPortfolio) {
        this.weightOfPortfolio = weightOfPortfolio;
    }

    public String getWeightOfSeminarOrWorkshop() {
        return weightOfSeminarOrWorkshop;
    }

    public void setWeightOfSeminarOrWorkshop(String weightOfSeminarOrWorkshop) {
        this.weightOfSeminarOrWorkshop = weightOfSeminarOrWorkshop;
    }

    public String getWeightOfOralExam() {
        return weightOfOralExam;
    }

    public void setWeightOfOralExam(String weightOfOralExam) {
        this.weightOfOralExam = weightOfOralExam;
    }

    public String getWeightOfMidterm() {
        return weightOfMidterm;
    }

    public void setWeightOfMidterm(String weightOfMidterm) {
        this.weightOfMidterm = weightOfMidterm;
    }

    public String getWeightOfFinalExam() {
        return weightOfFinalExam;
    }

    public void setWeightOfFinalExam(String weightOfFinalExam) {
        this.weightOfFinalExam = weightOfFinalExam;
    }

    public String getWeightOfPresentationJury() {
        return weightOfPresentationJury;
    }

    public void setWeightOfPresentationJury(String weightOfPresentationJury) {
        this.weightOfPresentationJury = weightOfPresentationJury;
    }

    public String getWeightOfTotalWeight() {
        return weightOfTotalWeight;
    }

    public void setWeightOfTotalWeight(String weightOfTotalWeight) {
        this.weightOfTotalWeight = weightOfTotalWeight;
    }

    public String getLO1OfParticipation() {
        return LO1OfParticipation;
    }

    public void setLO1OfParticipation(String LO1OfParticipation) {
        this.LO1OfParticipation = LO1OfParticipation;
    }

    public String getLO1OfLabOrApplication() {
        return LO1OfLabOrApplication;
    }

    public void setLO1OfLabOrApplication(String LO1OfLabOrApplication) {
        this.LO1OfLabOrApplication = LO1OfLabOrApplication;
    }

    public String getLO1OfFieldWork() {
        return LO1OfFieldWork;
    }

    public void setLO1OfFieldWork(String LO1OfFieldWork) {
        this.LO1OfFieldWork = LO1OfFieldWork;
    }

    public String getLO1OfQuizOrStudioCritique() {
        return LO1OfQuizOrStudioCritique;
    }

    public void setLO1OfQuizOrStudioCritique(String LO1OfQuizOrStudioCritique) {
        this.LO1OfQuizOrStudioCritique = LO1OfQuizOrStudioCritique;
    }

    public String getLO1OfHwOrAssignment() {
        return LO1OfHwOrAssignment;
    }

    public void setLO1OfHwOrAssignment(String LO1OfHwOrAssignment) {
        this.LO1OfHwOrAssignment = LO1OfHwOrAssignment;
    }

    public String getLO1OfPresentationOrJury() {
        return LO1OfPresentationOrJury;
    }

    public void setLO1OfPresentationOrJury(String LO1OfPresentationOrJury) {
        this.LO1OfPresentationOrJury = LO1OfPresentationOrJury;
    }

    public String getLO1OfProject() {
        return LO1OfProject;
    }

    public void setLO1OfProject(String LO1OfProject) {
        this.LO1OfProject = LO1OfProject;
    }

    public String getL01OfPortfolio() {
        return L01OfPortfolio;
    }

    public void setL01OfPortfolio(String l01OfPortfolio) {
        L01OfPortfolio = l01OfPortfolio;
    }

    public String getLO1OfSeminarOrWorkshop() {
        return LO1OfSeminarOrWorkshop;
    }

    public void setLO1OfSeminarOrWorkshop(String LO1OfSeminarOrWorkshop) {
        this.LO1OfSeminarOrWorkshop = LO1OfSeminarOrWorkshop;
    }

    public String getLO1OfOralExam() {
        return LO1OfOralExam;
    }

    public void setLO1OfOralExam(String LO1OfOralExam) {
        this.LO1OfOralExam = LO1OfOralExam;
    }

    public String getLO1OfMidterm() {
        return LO1OfMidterm;
    }

    public void setLO1OfMidterm(String LO1OfMidterm) {
        this.LO1OfMidterm = LO1OfMidterm;
    }

    public String getLO1OfFinalExam() {
        return LO1OfFinalExam;
    }

    public void setLO1OfFinalExam(String LO1OfFinalExam) {
        this.LO1OfFinalExam = LO1OfFinalExam;
    }

    public String getLO1OfPresentationJury() {
        return LO1OfPresentationJury;
    }

    public void setLO1OfPresentationJury(String LO1OfPresentationJury) {
        this.LO1OfPresentationJury = LO1OfPresentationJury;
    }

    public String getLO1OfTotalWeight() {
        return LO1OfTotalWeight;
    }

    public void setLO1OfTotalWeight(String LO1OfTotalWeight) {
        this.LO1OfTotalWeight = LO1OfTotalWeight;
    }

    public String getLO2OfParticipation() {
        return LO2OfParticipation;
    }

    public void setLO2OfParticipation(String LO2OfParticipation) {
        this.LO2OfParticipation = LO2OfParticipation;
    }

    public String getLO2OfLabOrApplication() {
        return LO2OfLabOrApplication;
    }

    public void setLO2OfLabOrApplication(String LO2OfLabOrApplication) {
        this.LO2OfLabOrApplication = LO2OfLabOrApplication;
    }

    public String getLO2OfFieldWork() {
        return LO2OfFieldWork;
    }

    public void setLO2OfFieldWork(String LO2OfFieldWork) {
        this.LO2OfFieldWork = LO2OfFieldWork;
    }

    public String getLO2OfQuizOrStudioCritique() {
        return LO2OfQuizOrStudioCritique;
    }

    public void setLO2OfQuizOrStudioCritique(String LO2OfQuizOrStudioCritique) {
        this.LO2OfQuizOrStudioCritique = LO2OfQuizOrStudioCritique;
    }

    public String getLO2OfHwOrAssignment() {
        return LO2OfHwOrAssignment;
    }

    public void setLO2OfHwOrAssignment(String LO2OfHwOrAssignment) {
        this.LO2OfHwOrAssignment = LO2OfHwOrAssignment;
    }

    public String getLO2OfPresentationOrJury() {
        return LO2OfPresentationOrJury;
    }

    public void setLO2OfPresentationOrJury(String LO2OfPresentationOrJury) {
        this.LO2OfPresentationOrJury = LO2OfPresentationOrJury;
    }

    public String getLO2OfProject() {
        return LO2OfProject;
    }

    public void setLO2OfProject(String LO2OfProject) {
        this.LO2OfProject = LO2OfProject;
    }

    public String getL02OfPortfolio() {
        return L02OfPortfolio;
    }

    public void setL02OfPortfolio(String l02OfPortfolio) {
        L02OfPortfolio = l02OfPortfolio;
    }

    public String getLO2OfSeminarOrWorkshop() {
        return LO2OfSeminarOrWorkshop;
    }

    public void setLO2OfSeminarOrWorkshop(String LO2OfSeminarOrWorkshop) {
        this.LO2OfSeminarOrWorkshop = LO2OfSeminarOrWorkshop;
    }

    public String getLO2OfOralExam() {
        return LO2OfOralExam;
    }

    public void setLO2OfOralExam(String LO2OfOralExam) {
        this.LO2OfOralExam = LO2OfOralExam;
    }

    public String getLO2OfMidterm() {
        return LO2OfMidterm;
    }

    public void setLO2OfMidterm(String LO2OfMidterm) {
        this.LO2OfMidterm = LO2OfMidterm;
    }

    public String getLO2OfFinalExam() {
        return LO2OfFinalExam;
    }

    public void setLO2OfFinalExam(String LO2OfFinalExam) {
        this.LO2OfFinalExam = LO2OfFinalExam;
    }

    public String getLO2OfPresentationJury() {
        return LO2OfPresentationJury;
    }

    public void setLO2OfPresentationJury(String LO2OfPresentationJury) {
        this.LO2OfPresentationJury = LO2OfPresentationJury;
    }

    public String getLO2OfTotalWeight() {
        return LO2OfTotalWeight;
    }

    public void setLO2OfTotalWeight(String LO2OfTotalWeight) {
        this.LO2OfTotalWeight = LO2OfTotalWeight;
    }

    public String getLO3OfParticipation() {
        return LO3OfParticipation;
    }

    public void setLO3OfParticipation(String LO3OfParticipation) {
        this.LO3OfParticipation = LO3OfParticipation;
    }

    public String getLO3OfLabOrApplication() {
        return LO3OfLabOrApplication;
    }

    public void setLO3OfLabOrApplication(String LO3OfLabOrApplication) {
        this.LO3OfLabOrApplication = LO3OfLabOrApplication;
    }

    public String getLO3OfFieldWork() {
        return LO3OfFieldWork;
    }

    public void setLO3OfFieldWork(String LO3OfFieldWork) {
        this.LO3OfFieldWork = LO3OfFieldWork;
    }

    public String getLO3OfQuizOrStudioCritique() {
        return LO3OfQuizOrStudioCritique;
    }

    public void setLO3OfQuizOrStudioCritique(String LO3OfQuizOrStudioCritique) {
        this.LO3OfQuizOrStudioCritique = LO3OfQuizOrStudioCritique;
    }

    public String getLO3OfHwOrAssignment() {
        return LO3OfHwOrAssignment;
    }

    public void setLO3OfHwOrAssignment(String LO3OfHwOrAssignment) {
        this.LO3OfHwOrAssignment = LO3OfHwOrAssignment;
    }

    public String getLO3OfPresentationOrJury() {
        return LO3OfPresentationOrJury;
    }

    public void setLO3OfPresentationOrJury(String LO3OfPresentationOrJury) {
        this.LO3OfPresentationOrJury = LO3OfPresentationOrJury;
    }

    public String getLO3OfProject() {
        return LO3OfProject;
    }

    public void setLO3OfProject(String LO3OfProject) {
        this.LO3OfProject = LO3OfProject;
    }

    public String getL03OfPortfolio() {
        return L03OfPortfolio;
    }

    public void setL03OfPortfolio(String l03OfPortfolio) {
        L03OfPortfolio = l03OfPortfolio;
    }

    public String getLO3OfSeminarOrWorkshop() {
        return LO3OfSeminarOrWorkshop;
    }

    public void setLO3OfSeminarOrWorkshop(String LO3OfSeminarOrWorkshop) {
        this.LO3OfSeminarOrWorkshop = LO3OfSeminarOrWorkshop;
    }

    public String getLO3OfOralExam() {
        return LO3OfOralExam;
    }

    public void setLO3OfOralExam(String LO3OfOralExam) {
        this.LO3OfOralExam = LO3OfOralExam;
    }

    public String getLO3OfMidterm() {
        return LO3OfMidterm;
    }

    public void setLO3OfMidterm(String LO3OfMidterm) {
        this.LO3OfMidterm = LO3OfMidterm;
    }

    public String getLO3OfFinalExam() {
        return LO3OfFinalExam;
    }

    public void setLO3OfFinalExam(String LO3OfFinalExam) {
        this.LO3OfFinalExam = LO3OfFinalExam;
    }

    public String getLO3OfPresentationJury() {
        return LO3OfPresentationJury;
    }

    public void setLO3OfPresentationJury(String LO3OfPresentationJury) {
        this.LO3OfPresentationJury = LO3OfPresentationJury;
    }

    public String getLO3OfTotalWeight() {
        return LO3OfTotalWeight;
    }

    public void setLO3OfTotalWeight(String LO3OfTotalWeight) {
        this.LO3OfTotalWeight = LO3OfTotalWeight;
    }

    public String getLO4OfParticipation() {
        return LO4OfParticipation;
    }

    public void setLO4OfParticipation(String LO4OfParticipation) {
        this.LO4OfParticipation = LO4OfParticipation;
    }

    public String getLO4OfLabOrApplication() {
        return LO4OfLabOrApplication;
    }

    public void setLO4OfLabOrApplication(String LO4OfLabOrApplication) {
        this.LO4OfLabOrApplication = LO4OfLabOrApplication;
    }

    public String getLO4OfFieldWork() {
        return LO4OfFieldWork;
    }

    public void setLO4OfFieldWork(String LO4OfFieldWork) {
        this.LO4OfFieldWork = LO4OfFieldWork;
    }

    public String getLO4OfQuizOrStudioCritique() {
        return LO4OfQuizOrStudioCritique;
    }

    public void setLO4OfQuizOrStudioCritique(String LO4OfQuizOrStudioCritique) {
        this.LO4OfQuizOrStudioCritique = LO4OfQuizOrStudioCritique;
    }

    public String getLO4OfHwOrAssignment() {
        return LO4OfHwOrAssignment;
    }

    public void setLO4OfHwOrAssignment(String LO4OfHwOrAssignment) {
        this.LO4OfHwOrAssignment = LO4OfHwOrAssignment;
    }

    public String getLO4OfPresentationOrJury() {
        return LO4OfPresentationOrJury;
    }

    public void setLO4OfPresentationOrJury(String LO4OfPresentationOrJury) {
        this.LO4OfPresentationOrJury = LO4OfPresentationOrJury;
    }

    public String getLO4OfProject() {
        return LO4OfProject;
    }

    public void setLO4OfProject(String LO4OfProject) {
        this.LO4OfProject = LO4OfProject;
    }

    public String getL04OfPortfolio() {
        return L04OfPortfolio;
    }

    public void setL04OfPortfolio(String l04OfPortfolio) {
        L04OfPortfolio = l04OfPortfolio;
    }

    public String getLO4OfSeminarOrWorkshop() {
        return LO4OfSeminarOrWorkshop;
    }

    public void setLO4OfSeminarOrWorkshop(String LO4OfSeminarOrWorkshop) {
        this.LO4OfSeminarOrWorkshop = LO4OfSeminarOrWorkshop;
    }

    public String getLO4OfOralExam() {
        return LO4OfOralExam;
    }

    public void setLO4OfOralExam(String LO4OfOralExam) {
        this.LO4OfOralExam = LO4OfOralExam;
    }

    public String getLO4OfMidterm() {
        return LO4OfMidterm;
    }

    public void setLO4OfMidterm(String LO4OfMidterm) {
        this.LO4OfMidterm = LO4OfMidterm;
    }

    public String getLO4OfFinalExam() {
        return LO4OfFinalExam;
    }

    public void setLO4OfFinalExam(String LO4OfFinalExam) {
        this.LO4OfFinalExam = LO4OfFinalExam;
    }

    public String getLO4OfPresentationJury() {
        return LO4OfPresentationJury;
    }

    public void setLO4OfPresentationJury(String LO4OfPresentationJury) {
        this.LO4OfPresentationJury = LO4OfPresentationJury;
    }

    public String getLO4OfTotalWeight() {
        return LO4OfTotalWeight;
    }

    public void setLO4OfTotalWeight(String LO4OfTotalWeight) {
        this.LO4OfTotalWeight = LO4OfTotalWeight;
    }

    public String getLO5OfParticipation() {
        return LO5OfParticipation;
    }

    public void setLO5OfParticipation(String LO5OfParticipation) {
        this.LO5OfParticipation = LO5OfParticipation;
    }

    public String getLO5OfLabOrApplication() {
        return LO5OfLabOrApplication;
    }

    public void setLO5OfLabOrApplication(String LO5OfLabOrApplication) {
        this.LO5OfLabOrApplication = LO5OfLabOrApplication;
    }

    public String getLO5OfFieldWork() {
        return LO5OfFieldWork;
    }

    public void setLO5OfFieldWork(String LO5OfFieldWork) {
        this.LO5OfFieldWork = LO5OfFieldWork;
    }

    public String getLO5OfQuizOrStudioCritique() {
        return LO5OfQuizOrStudioCritique;
    }

    public void setLO5OfQuizOrStudioCritique(String LO5OfQuizOrStudioCritique) {
        this.LO5OfQuizOrStudioCritique = LO5OfQuizOrStudioCritique;
    }

    public String getLO5OfHwOrAssignment() {
        return LO5OfHwOrAssignment;
    }

    public void setLO5OfHwOrAssignment(String LO5OfHwOrAssignment) {
        this.LO5OfHwOrAssignment = LO5OfHwOrAssignment;
    }

    public String getLO5OfPresentationOrJury() {
        return LO5OfPresentationOrJury;
    }

    public void setLO5OfPresentationOrJury(String LO5OfPresentationOrJury) {
        this.LO5OfPresentationOrJury = LO5OfPresentationOrJury;
    }

    public String getLO5OfProject() {
        return LO5OfProject;
    }

    public void setLO5OfProject(String LO5OfProject) {
        this.LO5OfProject = LO5OfProject;
    }

    public String getL05OfPortfolio() {
        return L05OfPortfolio;
    }

    public void setL05OfPortfolio(String l05OfPortfolio) {
        L05OfPortfolio = l05OfPortfolio;
    }

    public String getLO5OfSeminarOrWorkshop() {
        return LO5OfSeminarOrWorkshop;
    }

    public void setLO5OfSeminarOrWorkshop(String LO5OfSeminarOrWorkshop) {
        this.LO5OfSeminarOrWorkshop = LO5OfSeminarOrWorkshop;
    }

    public String getLO5OfOralExam() {
        return LO5OfOralExam;
    }

    public void setLO5OfOralExam(String LO5OfOralExam) {
        this.LO5OfOralExam = LO5OfOralExam;
    }

    public String getLO5OfMidterm() {
        return LO5OfMidterm;
    }

    public void setLO5OfMidterm(String LO5OfMidterm) {
        this.LO5OfMidterm = LO5OfMidterm;
    }

    public String getLO5OfFinalExam() {
        return LO5OfFinalExam;
    }

    public void setLO5OfFinalExam(String LO5OfFinalExam) {
        this.LO5OfFinalExam = LO5OfFinalExam;
    }

    public String getLO5OfPresentationJury() {
        return LO5OfPresentationJury;
    }

    public void setLO5OfPresentationJury(String LO5OfPresentationJury) {
        this.LO5OfPresentationJury = LO5OfPresentationJury;
    }

    public String getLO5OfTotalWeight() {
        return LO5OfTotalWeight;
    }

    public void setLO5OfTotalWeight(String LO5OfTotalWeight) {
        this.LO5OfTotalWeight = LO5OfTotalWeight;
    }

    public String getLO6OfParticipation() {
        return LO6OfParticipation;
    }

    public void setLO6OfParticipation(String LO6OfParticipation) {
        this.LO6OfParticipation = LO6OfParticipation;
    }

    public String getLO6OfLabOrApplication() {
        return LO6OfLabOrApplication;
    }

    public void setLO6OfLabOrApplication(String LO6OfLabOrApplication) {
        this.LO6OfLabOrApplication = LO6OfLabOrApplication;
    }

    public String getLO6OfFieldWork() {
        return LO6OfFieldWork;
    }

    public void setLO6OfFieldWork(String LO6OfFieldWork) {
        this.LO6OfFieldWork = LO6OfFieldWork;
    }

    public String getLO6OfQuizOrStudioCritique() {
        return LO6OfQuizOrStudioCritique;
    }

    public void setLO6OfQuizOrStudioCritique(String LO6OfQuizOrStudioCritique) {
        this.LO6OfQuizOrStudioCritique = LO6OfQuizOrStudioCritique;
    }

    public String getLO6OfHwOrAssignment() {
        return LO6OfHwOrAssignment;
    }

    public void setLO6OfHwOrAssignment(String LO6OfHwOrAssignment) {
        this.LO6OfHwOrAssignment = LO6OfHwOrAssignment;
    }

    public String getLO6OfPresentationOrJury() {
        return LO6OfPresentationOrJury;
    }

    public void setLO6OfPresentationOrJury(String LO6OfPresentationOrJury) {
        this.LO6OfPresentationOrJury = LO6OfPresentationOrJury;
    }

    public String getLO6OfProject() {
        return LO6OfProject;
    }

    public void setLO6OfProject(String LO6OfProject) {
        this.LO6OfProject = LO6OfProject;
    }

    public String getL06OfPortfolio() {
        return L06OfPortfolio;
    }

    public void setL06OfPortfolio(String l06OfPortfolio) {
        L06OfPortfolio = l06OfPortfolio;
    }

    public String getLO6OfSeminarOrWorkshop() {
        return LO6OfSeminarOrWorkshop;
    }

    public void setLO6OfSeminarOrWorkshop(String LO6OfSeminarOrWorkshop) {
        this.LO6OfSeminarOrWorkshop = LO6OfSeminarOrWorkshop;
    }

    public String getLO6OfOralExam() {
        return LO6OfOralExam;
    }

    public void setLO6OfOralExam(String LO6OfOralExam) {
        this.LO6OfOralExam = LO6OfOralExam;
    }

    public String getLO6OfMidterm() {
        return LO6OfMidterm;
    }

    public void setLO6OfMidterm(String LO6OfMidterm) {
        this.LO6OfMidterm = LO6OfMidterm;
    }

    public String getLO6OfFinalExam() {
        return LO6OfFinalExam;
    }

    public void setLO6OfFinalExam(String LO6OfFinalExam) {
        this.LO6OfFinalExam = LO6OfFinalExam;
    }

    public String getLO6OfPresentationJury() {
        return LO6OfPresentationJury;
    }

    public void setLO6OfPresentationJury(String LO6OfPresentationJury) {
        this.LO6OfPresentationJury = LO6OfPresentationJury;
    }

    public String getLO6OfTotalWeight() {
        return LO6OfTotalWeight;
    }

    public void setLO6OfTotalWeight(String LO6OfTotalWeight) {
        this.LO6OfTotalWeight = LO6OfTotalWeight;
    }

    public String getLO7OfParticipation() {
        return LO7OfParticipation;
    }

    public void setLO7OfParticipation(String LO7OfParticipation) {
        this.LO7OfParticipation = LO7OfParticipation;
    }

    public String getLO7OfLabOrApplication() {
        return LO7OfLabOrApplication;
    }

    public void setLO7OfLabOrApplication(String LO7OfLabOrApplication) {
        this.LO7OfLabOrApplication = LO7OfLabOrApplication;
    }

    public String getLO7OfFieldWork() {
        return LO7OfFieldWork;
    }

    public void setLO7OfFieldWork(String LO7OfFieldWork) {
        this.LO7OfFieldWork = LO7OfFieldWork;
    }

    public String getLO7OfQuizOrStudioCritique() {
        return LO7OfQuizOrStudioCritique;
    }

    public void setLO7OfQuizOrStudioCritique(String LO7OfQuizOrStudioCritique) {
        this.LO7OfQuizOrStudioCritique = LO7OfQuizOrStudioCritique;
    }

    public String getLO7OfHwOrAssignment() {
        return LO7OfHwOrAssignment;
    }

    public void setLO7OfHwOrAssignment(String LO7OfHwOrAssignment) {
        this.LO7OfHwOrAssignment = LO7OfHwOrAssignment;
    }

    public String getLO7OfPresentationOrJury() {
        return LO7OfPresentationOrJury;
    }

    public void setLO7OfPresentationOrJury(String LO7OfPresentationOrJury) {
        this.LO7OfPresentationOrJury = LO7OfPresentationOrJury;
    }

    public String getLO7OfProject() {
        return LO7OfProject;
    }

    public void setLO7OfProject(String LO7OfProject) {
        this.LO7OfProject = LO7OfProject;
    }

    public String getL07OfPortfolio() {
        return L07OfPortfolio;
    }

    public void setL07OfPortfolio(String l07OfPortfolio) {
        L07OfPortfolio = l07OfPortfolio;
    }

    public String getLO7OfSeminarOrWorkshop() {
        return LO7OfSeminarOrWorkshop;
    }

    public void setLO7OfSeminarOrWorkshop(String LO7OfSeminarOrWorkshop) {
        this.LO7OfSeminarOrWorkshop = LO7OfSeminarOrWorkshop;
    }

    public String getLO7OfOralExam() {
        return LO7OfOralExam;
    }

    public void setLO7OfOralExam(String LO7OfOralExam) {
        this.LO7OfOralExam = LO7OfOralExam;
    }

    public String getLO7OfMidterm() {
        return LO7OfMidterm;
    }

    public void setLO7OfMidterm(String LO7OfMidterm) {
        this.LO7OfMidterm = LO7OfMidterm;
    }

    public String getLO7OfFinalExam() {
        return LO7OfFinalExam;
    }

    public void setLO7OfFinalExam(String LO7OfFinalExam) {
        this.LO7OfFinalExam = LO7OfFinalExam;
    }

    public String getLO7OfPresentationJury() {
        return LO7OfPresentationJury;
    }

    public void setLO7OfPresentationJury(String LO7OfPresentationJury) {
        this.LO7OfPresentationJury = LO7OfPresentationJury;
    }

    public String getLO7OfTotalWeight() {
        return LO7OfTotalWeight;
    }

    public void setLO7OfTotalWeight(String LO7OfTotalWeight) {
        this.LO7OfTotalWeight = LO7OfTotalWeight;
    }

    public String getWeightOfSemActivitiesOnFinalGrade1() {
        return weightOfSemActivitiesOnFinalGrade1;
    }

    public void setWeightOfSemActivitiesOnFinalGrade1(String weightOfSemActivitiesOnFinalGrade1) {
        this.weightOfSemActivitiesOnFinalGrade1 = weightOfSemActivitiesOnFinalGrade1;
    }

    public String getWeightOfSemActivitiesOnFinalGrade2() {
        return weightOfSemActivitiesOnFinalGrade2;
    }

    public void setWeightOfSemActivitiesOnFinalGrade2(String weightOfSemActivitiesOnFinalGrade2) {
        this.weightOfSemActivitiesOnFinalGrade2 = weightOfSemActivitiesOnFinalGrade2;
    }

    public String getWeightOfEndOfSemActivitiesOnFinalGrade1() {
        return weightOfEndOfSemActivitiesOnFinalGrade1;
    }

    public void setWeightOfEndOfSemActivitiesOnFinalGrade1(String weightOfEndOfSemActivitiesOnFinalGrade1) {
        this.weightOfEndOfSemActivitiesOnFinalGrade1 = weightOfEndOfSemActivitiesOnFinalGrade1;
    }

    public String getWeightOfEndOfSemActivitiesOnFinalGrade2() {
        return weightOfEndOfSemActivitiesOnFinalGrade2;
    }

    public void setWeightOfEndOfSemActivitiesOnFinalGrade2(String weightOfEndOfSemActivitiesOnFinalGrade2) {
        this.weightOfEndOfSemActivitiesOnFinalGrade2 = weightOfEndOfSemActivitiesOnFinalGrade2;
    }

    public String getEndOfTab4Total1() {
        return endOfTab4Total1;
    }

    public void setEndOfTab4Total1(String endOfTab4Total1) {
        this.endOfTab4Total1 = endOfTab4Total1;
    }

    public String getEndOfTab4Total2() {
        return endOfTab4Total2;
    }

    public void setEndOfTab4Total2(String endOfTab4Total2) {
        this.endOfTab4Total2 = endOfTab4Total2;
    }

}
