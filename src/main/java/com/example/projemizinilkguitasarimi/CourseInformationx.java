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


    //the data on TAB3
    public String week1Subjects;
    public String week2Subjects;
    public String week3Subjects;
    public String week4Subjects;
    public String week5Subjects;
    public String week6Subjects;
    public String week7Subjects;
    public String week8Subjects;
    public String week9Subjects;
    public String week10Subjects;
    public String week11Subjects;
    public String week12Subjects;
    public String week13Subjects;
    public String week14Subjects;
    public String week15Subjects;

    public String week1ReqMat;
    public String week2ReqMat;
    public String week3ReqMat;
    public String week4ReqMat;
    public String week5ReqMat;
    public String week6ReqMat;
    public String week7ReqMat;
    public String week8ReqMat;
    public String week9ReqMat;
    public String week10ReqMat;
    public String week11ReqMat;
    public String week12ReqMat;
    public String week13ReqMat;
    public String week14ReqMat;
    public String week15ReqMat;

    public String courseNotesAndTextBooks;
    public String suggestedReadingsAndMaterials;

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



    //the data on TAB5 ECTS / Workload Table

    public String courseHours;
    public String labOrApplicationHours;
    public String studyHourseOutsideClass;
    public String fieldWork;
    public String quizOrStudioCritique;
    public String homeworkOrAssignment;
    public String presentationOrJury;
    public String project;
    public String portfolio;
    public String seminarOrWorkshop;
    public String oralExam;
    public String midterm;
    public String Final;
    public String TotalWorkload;

    public String courseHoursDur;
    public String labOrApplicationHoursDur;
    public String studyHourseOutsideClassDur;
    public String fieldWorkDur;
    public String quizOrStudioCritiqueDur;
    public String homeworkOrAssignmentDur;
    public String presentationOrJuryDur;
    public String projectDur;
    public String portfolioDur;
    public String seminarOrWorkshopDur;
    public String oralExamDur;
    public String midtermDur;
    public String FinalDur;

    public String courseHoursWL;
    public String labOrApplicationHourWL;
    public String studyHourseOutsideClassWL;
    public String fieldWorkWL;
    public String quizOrStudioCritiqueWL;
    public String homeworkOrAssignmentWL;
    public String presentationOrJuryWL;
    public String projectWL;
    public String portfolioWL;
    public String seminarOrWorkshopWL;
    public String oralExamWL;
    public String midtermWL;
    public String FinalWL;



    public String TotalWorkloadWL;




    //the data on TAB6 Course outcome matrix

    public String programCompetenciesOutcome1;
    public String programCompetenciesOutcome1ContributionLevel1;
    public String programCompetenciesOutcome1ContributionLevel2;
    public String programCompetenciesOutcome1ContributionLevel3;
    public String programCompetenciesOutcome1ContributionLevel4;
    public String programCompetenciesOutcome1ContributionLevel5;
    public String programCompetenciesOutcome1LOno;

    public String programCompetenciesOutcome2;
    public String programCompetenciesOutcome2ContributionLevel1;
    public String programCompetenciesOutcome2ContributionLevel2;
    public String programCompetenciesOutcome2ContributionLevel3;
    public String programCompetenciesOutcome2ContributionLevel4;
    public String programCompetenciesOutcome2ContributionLevel5;
    public String programCompetenciesOutcome2LOno;

    public String programCompetenciesOutcome3;
    public String programCompetenciesOutcome3ContributionLevel1;
    public String programCompetenciesOutcome3ContributionLevel2;
    public String programCompetenciesOutcome3ContributionLevel3;
    public String programCompetenciesOutcome3ContributionLevel4;
    public String programCompetenciesOutcome3ContributionLevel5;
    public String programCompetenciesOutcome3LOno;

    public String programCompetenciesOutcome4;
    public String programCompetenciesOutcome4ContributionLevel1;
    public String programCompetenciesOutcome4ContributionLevel2;
    public String programCompetenciesOutcome4ContributionLevel3;
    public String programCompetenciesOutcome4ContributionLevel4;
    public String programCompetenciesOutcome4ContributionLevel5;
    public String programCompetenciesOutcome4LOno;

    public String programCompetenciesOutcome5;
    public String programCompetenciesOutcome5ContributionLevel1;
    public String programCompetenciesOutcome5ContributionLevel2;
    public String programCompetenciesOutcome5ContributionLevel3;
    public String programCompetenciesOutcome5ContributionLevel4;
    public String programCompetenciesOutcome5ContributionLevel5;
    public String programCompetenciesOutcome5LOno;

    public String programCompetenciesOutcome6;
    public String programCompetenciesOutcome6ContributionLevel1;
    public String programCompetenciesOutcome6ContributionLevel2;
    public String programCompetenciesOutcome6ContributionLevel3;
    public String programCompetenciesOutcome6ContributionLevel4;
    public String programCompetenciesOutcome6ContributionLevel5;
    public String programCompetenciesOutcome6LOno;


    public String programCompetenciesOutcome7;
    public String programCompetenciesOutcome7ContributionLevel1;
    public String programCompetenciesOutcome7ContributionLevel2;
    public String programCompetenciesOutcome7ContributionLevel3;
    public String programCompetenciesOutcome7ContributionLevel4;
    public String programCompetenciesOutcome7ContributionLevel5;
    public String programCompetenciesOutcome7LOno;

    public String programCompetenciesOutcome8;
    public String programCompetenciesOutcome8ContributionLevel1;
    public String programCompetenciesOutcome8ContributionLevel2;
    public String programCompetenciesOutcome8ContributionLevel3;
    public String programCompetenciesOutcome8ContributionLevel4;
    public String programCompetenciesOutcome8ContributionLevel5;
    public String programCompetenciesOutcome8LOno;

    public String programCompetenciesOutcome9;
    public String programCompetenciesOutcome9ContributionLevel1;
    public String programCompetenciesOutcome9ContributionLevel2;
    public String programCompetenciesOutcome9ContributionLevel3;
    public String programCompetenciesOutcome9ContributionLevel4;
    public String programCompetenciesOutcome9ContributionLevel5;
    public String programCompetenciesOutcome9LOno;

    public String programCompetenciesOutcome10;
    public String programCompetenciesOutcome10ContributionLevel1;
    public String programCompetenciesOutcome10ContributionLevel2;
    public String programCompetenciesOutcome10ContributionLevel3;
    public String programCompetenciesOutcome10ContributionLevel4;
    public String programCompetenciesOutcome10ContributionLevel5;
    public String programCompetenciesOutcome10LOno;

    public String programCompetenciesOutcome11;
    public String programCompetenciesOutcome11ContributionLevel1;
    public String programCompetenciesOutcome11ContributionLevel2;
    public String programCompetenciesOutcome11ContributionLevel3;
    public String programCompetenciesOutcome11ContributionLevel4;
    public String programCompetenciesOutcome11ContributionLevel5;
    public String programCompetenciesOutcome11LOno;
    public String programCompetenciesOutcome12;
    public String programCompetenciesOutcome12ContributionLevel1;
    public String programCompetenciesOutcome12ContributionLevel2;
    public String programCompetenciesOutcome12ContributionLevel3;
    public String programCompetenciesOutcome12ContributionLevel4;
    public String programCompetenciesOutcome12ContributionLevel5;
    public String programCompetenciesOutcome12LOno;


    public String programCompetenciesOutcome13;
    public String programCompetenciesOutcome13ContributionLevel1;
    public String programCompetenciesOutcome13ContributionLevel2;
    public String programCompetenciesOutcome13ContributionLevel3;
    public String programCompetenciesOutcome13ContributionLevel4;
    public String programCompetenciesOutcome13ContributionLevel5;
    public String programCompetenciesOutcome13LOno;


    //the data on the SAVE TAB
    public String reasonForUpdate;



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

    public String getWeek1Subjects() {
        return week1Subjects;
    }

    public void setWeek1Subjects(String week1Subjects) {
        this.week1Subjects = week1Subjects;
    }

    public String getWeek2Subjects() {
        return week2Subjects;
    }

    public void setWeek2Subjects(String week2Subjects) {
        this.week2Subjects = week2Subjects;
    }

    public String getWeek3Subjects() {
        return week3Subjects;
    }

    public void setWeek3Subjects(String week3Subjects) {
        this.week3Subjects = week3Subjects;
    }

    public String getWeek4Subjects() {
        return week4Subjects;
    }

    public void setWeek4Subjects(String week4Subjects) {
        this.week4Subjects = week4Subjects;
    }

    public String getWeek5Subjects() {
        return week5Subjects;
    }

    public void setWeek5Subjects(String week5Subjects) {
        this.week5Subjects = week5Subjects;
    }

    public String getWeek6Subjects() {
        return week6Subjects;
    }

    public void setWeek6Subjects(String week6Subjects) {
        this.week6Subjects = week6Subjects;
    }

    public String getWeek7Subjects() {
        return week7Subjects;
    }

    public void setWeek7Subjects(String week7Subjects) {
        this.week7Subjects = week7Subjects;
    }

    public String getWeek8Subjects() {
        return week8Subjects;
    }

    public void setWeek8Subjects(String week8Subjects) {
        this.week8Subjects = week8Subjects;
    }

    public String getWeek9Subjects() {
        return week9Subjects;
    }

    public void setWeek9Subjects(String week9Subjects) {
        this.week9Subjects = week9Subjects;
    }

    public String getWeek10Subjects() {
        return week10Subjects;
    }

    public void setWeek10Subjects(String week10Subjects) {
        this.week10Subjects = week10Subjects;
    }

    public String getWeek11Subjects() {
        return week11Subjects;
    }

    public void setWeek11Subjects(String week11Subjects) {
        this.week11Subjects = week11Subjects;
    }

    public String getWeek12Subjects() {
        return week12Subjects;
    }

    public void setWeek12Subjects(String week12Subjects) {
        this.week12Subjects = week12Subjects;
    }

    public String getWeek13Subjects() {
        return week13Subjects;
    }

    public void setWeek13Subjects(String week13Subjects) {
        this.week13Subjects = week13Subjects;
    }

    public String getWeek14Subjects() {
        return week14Subjects;
    }

    public void setWeek14Subjects(String week14Subjects) {
        this.week14Subjects = week14Subjects;
    }

    public String getWeek15Subjects() {
        return week15Subjects;
    }

    public void setWeek15Subjects(String week15Subjects) {
        this.week15Subjects = week15Subjects;
    }

    public String getWeek1ReqMat() {
        return week1ReqMat;
    }

    public void setWeek1ReqMat(String week1ReqMat) {
        this.week1ReqMat = week1ReqMat;
    }

    public String getWeek2ReqMat() {
        return week2ReqMat;
    }

    public void setWeek2ReqMat(String week2ReqMat) {
        this.week2ReqMat = week2ReqMat;
    }

    public String getWeek3ReqMat() {
        return week3ReqMat;
    }

    public void setWeek3ReqMat(String week3ReqMat) {
        this.week3ReqMat = week3ReqMat;
    }

    public String getWeek4ReqMat() {
        return week4ReqMat;
    }

    public void setWeek4ReqMat(String week4ReqMat) {
        this.week4ReqMat = week4ReqMat;
    }

    public String getWeek5ReqMat() {
        return week5ReqMat;
    }

    public void setWeek5ReqMat(String week5ReqMat) {
        this.week5ReqMat = week5ReqMat;
    }

    public String getWeek6ReqMat() {
        return week6ReqMat;
    }

    public void setWeek6ReqMat(String week6ReqMat) {
        this.week6ReqMat = week6ReqMat;
    }

    public String getWeek7ReqMat() {
        return week7ReqMat;
    }

    public void setWeek7ReqMat(String week7ReqMat) {
        this.week7ReqMat = week7ReqMat;
    }

    public String getWeek8ReqMat() {
        return week8ReqMat;
    }

    public void setWeek8ReqMat(String week8ReqMat) {
        this.week8ReqMat = week8ReqMat;
    }

    public String getWeek9ReqMat() {
        return week9ReqMat;
    }

    public void setWeek9ReqMat(String week9ReqMat) {
        this.week9ReqMat = week9ReqMat;
    }

    public String getWeek10ReqMat() {
        return week10ReqMat;
    }

    public void setWeek10ReqMat(String week10ReqMat) {
        this.week10ReqMat = week10ReqMat;
    }

    public String getWeek11ReqMat() {
        return week11ReqMat;
    }

    public void setWeek11ReqMat(String week11ReqMat) {
        this.week11ReqMat = week11ReqMat;
    }

    public String getWeek12ReqMat() {
        return week12ReqMat;
    }

    public void setWeek12ReqMat(String week12ReqMat) {
        this.week12ReqMat = week12ReqMat;
    }

    public String getWeek13ReqMat() {
        return week13ReqMat;
    }

    public void setWeek13ReqMat(String week13ReqMat) {
        this.week13ReqMat = week13ReqMat;
    }

    public String getWeek14ReqMat() {
        return week14ReqMat;
    }

    public void setWeek14ReqMat(String week14ReqMat) {
        this.week14ReqMat = week14ReqMat;
    }

    public String getWeek15ReqMat() {
        return week15ReqMat;
    }

    public void setWeek15ReqMat(String week15ReqMat) {
        this.week15ReqMat = week15ReqMat;
    }

    public String getCourseNotesAndTextBooks() {
        return courseNotesAndTextBooks;
    }

    public void setCourseNotesAndTextBooks(String courseNotesAndTextBooks) {
        this.courseNotesAndTextBooks = courseNotesAndTextBooks;
    }

    public String getSuggestedReadingsAndMaterials() {
        return suggestedReadingsAndMaterials;
    }

    public void setSuggestedReadingsAndMaterials(String suggestedReadingsAndMaterials) {
        this.suggestedReadingsAndMaterials = suggestedReadingsAndMaterials;
    }

    public String getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(String courseHours) {
        this.courseHours = courseHours;
    }

    public String getLabOrApplicationHours() {
        return labOrApplicationHours;
    }

    public void setLabOrApplicationHours(String labOrApplicationHours) {
        this.labOrApplicationHours = labOrApplicationHours;
    }

    public String getStudyHourseOutsideClass() {
        return studyHourseOutsideClass;
    }

    public void setStudyHourseOutsideClass(String studyHourseOutsideClass) {
        this.studyHourseOutsideClass = studyHourseOutsideClass;
    }

    public String getFieldWork() {
        return fieldWork;
    }

    public void setFieldWork(String fieldWork) {
        this.fieldWork = fieldWork;
    }

    public String getQuizOrStudioCritique() {
        return quizOrStudioCritique;
    }

    public void setQuizOrStudioCritique(String quizOrStudioCritique) {
        this.quizOrStudioCritique = quizOrStudioCritique;
    }

    public String getHomeworkOrAssignment() {
        return homeworkOrAssignment;
    }

    public void setHomeworkOrAssignment(String homeworkOrAssignment) {
        this.homeworkOrAssignment = homeworkOrAssignment;
    }

    public String getPresentationOrJury() {
        return presentationOrJury;
    }

    public void setPresentationOrJury(String presentationOrJury) {
        this.presentationOrJury = presentationOrJury;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getSeminarOrWorkshop() {
        return seminarOrWorkshop;
    }

    public void setSeminarOrWorkshop(String seminarOrWorkshop) {
        this.seminarOrWorkshop = seminarOrWorkshop;
    }

    public String getOralExam() {
        return oralExam;
    }

    public void setOralExam(String oralExam) {
        this.oralExam = oralExam;
    }

    public String getMidterm() {
        return midterm;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String aFinal) {
        Final = aFinal;
    }

    public String getTotalWorkload() {
        return TotalWorkload;
    }

    public void setTotalWorkload(String totalWorkload) {
        TotalWorkload = totalWorkload;
    }

    public String getCourseHoursDur() {
        return courseHoursDur;
    }

    public void setCourseHoursDur(String courseHoursDur) {
        this.courseHoursDur = courseHoursDur;
    }

    public String getLabOrApplicationHoursDur() {
        return labOrApplicationHoursDur;
    }

    public void setLabOrApplicationHoursDur(String labOrApplicationHoursDur) {
        this.labOrApplicationHoursDur = labOrApplicationHoursDur;
    }

    public String getStudyHourseOutsideClassDur() {
        return studyHourseOutsideClassDur;
    }

    public void setStudyHourseOutsideClassDur(String studyHourseOutsideClassDur) {
        this.studyHourseOutsideClassDur = studyHourseOutsideClassDur;
    }

    public String getFieldWorkDur() {
        return fieldWorkDur;
    }

    public void setFieldWorkDur(String fieldWorkDur) {
        this.fieldWorkDur = fieldWorkDur;
    }

    public String getQuizOrStudioCritiqueDur() {
        return quizOrStudioCritiqueDur;
    }

    public void setQuizOrStudioCritiqueDur(String quizOrStudioCritiqueDur) {
        this.quizOrStudioCritiqueDur = quizOrStudioCritiqueDur;
    }

    public String getHomeworkOrAssignmentDur() {
        return homeworkOrAssignmentDur;
    }

    public void setHomeworkOrAssignmentDur(String homeworkOrAssignmentDur) {
        this.homeworkOrAssignmentDur = homeworkOrAssignmentDur;
    }

    public String getPresentationOrJuryDur() {
        return presentationOrJuryDur;
    }

    public void setPresentationOrJuryDur(String presentationOrJuryDur) {
        this.presentationOrJuryDur = presentationOrJuryDur;
    }

    public String getProjectDur() {
        return projectDur;
    }

    public void setProjectDur(String projectDur) {
        this.projectDur = projectDur;
    }

    public String getPortfolioDur() {
        return portfolioDur;
    }

    public void setPortfolioDur(String portfolioDur) {
        this.portfolioDur = portfolioDur;
    }

    public String getSeminarOrWorkshopDur() {
        return seminarOrWorkshopDur;
    }

    public void setSeminarOrWorkshopDur(String seminarOrWorkshopDur) {
        this.seminarOrWorkshopDur = seminarOrWorkshopDur;
    }

    public String getOralExamDur() {
        return oralExamDur;
    }

    public void setOralExamDur(String oralExamDur) {
        this.oralExamDur = oralExamDur;
    }

    public String getMidtermDur() {
        return midtermDur;
    }

    public void setMidtermDur(String midtermDur) {
        this.midtermDur = midtermDur;
    }

    public String getFinalDur() {
        return FinalDur;
    }

    public void setFinalDur(String finalDur) {
        FinalDur = finalDur;
    }

    public String getCourseHoursWL() {
        return courseHoursWL;
    }

    public void setCourseHoursWL(String courseHoursWL) {
        this.courseHoursWL = courseHoursWL;
    }

    public String getLabOrApplicationHourWL() {
        return labOrApplicationHourWL;
    }

    public void setLabOrApplicationHourWL(String labOrApplicationHourWL) {
        this.labOrApplicationHourWL = labOrApplicationHourWL;
    }

    public String getStudyHourseOutsideClassWL() {
        return studyHourseOutsideClassWL;
    }

    public void setStudyHourseOutsideClassWL(String studyHourseOutsideClassWL) {
        this.studyHourseOutsideClassWL = studyHourseOutsideClassWL;
    }

    public String getFieldWorkWL() {
        return fieldWorkWL;
    }

    public void setFieldWorkWL(String fieldWorkWL) {
        this.fieldWorkWL = fieldWorkWL;
    }

    public String getQuizOrStudioCritiqueWL() {
        return quizOrStudioCritiqueWL;
    }

    public void setQuizOrStudioCritiqueWL(String quizOrStudioCritiqueWL) {
        this.quizOrStudioCritiqueWL = quizOrStudioCritiqueWL;
    }

    public String getHomeworkOrAssignmentWL() {
        return homeworkOrAssignmentWL;
    }

    public void setHomeworkOrAssignmentWL(String homeworkOrAssignmentWL) {
        this.homeworkOrAssignmentWL = homeworkOrAssignmentWL;
    }

    public String getPresentationOrJuryWL() {
        return presentationOrJuryWL;
    }

    public void setPresentationOrJuryWL(String presentationOrJuryWL) {
        this.presentationOrJuryWL = presentationOrJuryWL;
    }

    public String getProjectWL() {
        return projectWL;
    }

    public void setProjectWL(String projectWL) {
        this.projectWL = projectWL;
    }

    public String getPortfolioWL() {
        return portfolioWL;
    }

    public void setPortfolioWL(String portfolioWL) {
        this.portfolioWL = portfolioWL;
    }

    public String getSeminarOrWorkshopWL() {
        return seminarOrWorkshopWL;
    }

    public void setSeminarOrWorkshopWL(String seminarOrWorkshopWL) {
        this.seminarOrWorkshopWL = seminarOrWorkshopWL;
    }

    public String getOralExamWL() {
        return oralExamWL;
    }

    public void setOralExamWL(String oralExamWL) {
        this.oralExamWL = oralExamWL;
    }

    public String getMidtermWL() {
        return midtermWL;
    }

    public void setMidtermWL(String midtermWL) {
        this.midtermWL = midtermWL;
    }

    public String getFinalWL() {
        return FinalWL;
    }

    public void setFinalWL(String finalWL) {
        FinalWL = finalWL;
    }

    public String getTotalWorkloadWL() {
        return TotalWorkloadWL;
    }

    public void setTotalWorkloadWL(String totalWorkloadWL) {
        TotalWorkloadWL = totalWorkloadWL;
    }

    public String getProgramCompetenciesOutcome1() {
        return programCompetenciesOutcome1;
    }

    public void setProgramCompetenciesOutcome1(String programCompetenciesOutcome1) {
        this.programCompetenciesOutcome1 = programCompetenciesOutcome1;
    }

    public String getProgramCompetenciesOutcome1ContributionLevel1() {
        return programCompetenciesOutcome1ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome1ContributionLevel1(String programCompetenciesOutcome1ContributionLevel1) {
        this.programCompetenciesOutcome1ContributionLevel1 = programCompetenciesOutcome1ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome1ContributionLevel2() {
        return programCompetenciesOutcome1ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome1ContributionLevel2(String programCompetenciesOutcome1ContributionLevel2) {
        this.programCompetenciesOutcome1ContributionLevel2 = programCompetenciesOutcome1ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome1ContributionLevel3() {
        return programCompetenciesOutcome1ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome1ContributionLevel3(String programCompetenciesOutcome1ContributionLevel3) {
        this.programCompetenciesOutcome1ContributionLevel3 = programCompetenciesOutcome1ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome1ContributionLevel4() {
        return programCompetenciesOutcome1ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome1ContributionLevel4(String programCompetenciesOutcome1ContributionLevel4) {
        this.programCompetenciesOutcome1ContributionLevel4 = programCompetenciesOutcome1ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome1ContributionLevel5() {
        return programCompetenciesOutcome1ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome1ContributionLevel5(String programCompetenciesOutcome1ContributionLevel5) {
        this.programCompetenciesOutcome1ContributionLevel5 = programCompetenciesOutcome1ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome1LOno() {
        return programCompetenciesOutcome1LOno;
    }

    public void setProgramCompetenciesOutcome1LOno(String programCompetenciesOutcome1LOno) {
        this.programCompetenciesOutcome1LOno = programCompetenciesOutcome1LOno;
    }

    public String getProgramCompetenciesOutcome2() {
        return programCompetenciesOutcome2;
    }

    public void setProgramCompetenciesOutcome2(String programCompetenciesOutcome2) {
        this.programCompetenciesOutcome2 = programCompetenciesOutcome2;
    }

    public String getProgramCompetenciesOutcome2ContributionLevel1() {
        return programCompetenciesOutcome2ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome2ContributionLevel1(String programCompetenciesOutcome2ContributionLevel1) {
        this.programCompetenciesOutcome2ContributionLevel1 = programCompetenciesOutcome2ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome2ContributionLevel2() {
        return programCompetenciesOutcome2ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome2ContributionLevel2(String programCompetenciesOutcome2ContributionLevel2) {
        this.programCompetenciesOutcome2ContributionLevel2 = programCompetenciesOutcome2ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome2ContributionLevel3() {
        return programCompetenciesOutcome2ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome2ContributionLevel3(String programCompetenciesOutcome2ContributionLevel3) {
        this.programCompetenciesOutcome2ContributionLevel3 = programCompetenciesOutcome2ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome2ContributionLevel4() {
        return programCompetenciesOutcome2ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome2ContributionLevel4(String programCompetenciesOutcome2ContributionLevel4) {
        this.programCompetenciesOutcome2ContributionLevel4 = programCompetenciesOutcome2ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome2ContributionLevel5() {
        return programCompetenciesOutcome2ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome2ContributionLevel5(String programCompetenciesOutcome2ContributionLevel5) {
        this.programCompetenciesOutcome2ContributionLevel5 = programCompetenciesOutcome2ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome2LOno() {
        return programCompetenciesOutcome2LOno;
    }

    public void setProgramCompetenciesOutcome2LOno(String programCompetenciesOutcome2LOno) {
        this.programCompetenciesOutcome2LOno = programCompetenciesOutcome2LOno;
    }

    public String getProgramCompetenciesOutcome3() {
        return programCompetenciesOutcome3;
    }

    public void setProgramCompetenciesOutcome3(String programCompetenciesOutcome3) {
        this.programCompetenciesOutcome3 = programCompetenciesOutcome3;
    }

    public String getProgramCompetenciesOutcome3ContributionLevel1() {
        return programCompetenciesOutcome3ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome3ContributionLevel1(String programCompetenciesOutcome3ContributionLevel1) {
        this.programCompetenciesOutcome3ContributionLevel1 = programCompetenciesOutcome3ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome3ContributionLevel2() {
        return programCompetenciesOutcome3ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome3ContributionLevel2(String programCompetenciesOutcome3ContributionLevel2) {
        this.programCompetenciesOutcome3ContributionLevel2 = programCompetenciesOutcome3ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome3ContributionLevel3() {
        return programCompetenciesOutcome3ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome3ContributionLevel3(String programCompetenciesOutcome3ContributionLevel3) {
        this.programCompetenciesOutcome3ContributionLevel3 = programCompetenciesOutcome3ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome3ContributionLevel4() {
        return programCompetenciesOutcome3ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome3ContributionLevel4(String programCompetenciesOutcome3ContributionLevel4) {
        this.programCompetenciesOutcome3ContributionLevel4 = programCompetenciesOutcome3ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome3ContributionLevel5() {
        return programCompetenciesOutcome3ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome3ContributionLevel5(String programCompetenciesOutcome3ContributionLevel5) {
        this.programCompetenciesOutcome3ContributionLevel5 = programCompetenciesOutcome3ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome3LOno() {
        return programCompetenciesOutcome3LOno;
    }

    public void setProgramCompetenciesOutcome3LOno(String programCompetenciesOutcome3LOno) {
        this.programCompetenciesOutcome3LOno = programCompetenciesOutcome3LOno;
    }

    public String getProgramCompetenciesOutcome4() {
        return programCompetenciesOutcome4;
    }

    public void setProgramCompetenciesOutcome4(String programCompetenciesOutcome4) {
        this.programCompetenciesOutcome4 = programCompetenciesOutcome4;
    }

    public String getProgramCompetenciesOutcome4ContributionLevel1() {
        return programCompetenciesOutcome4ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome4ContributionLevel1(String programCompetenciesOutcome4ContributionLevel1) {
        this.programCompetenciesOutcome4ContributionLevel1 = programCompetenciesOutcome4ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome4ContributionLevel2() {
        return programCompetenciesOutcome4ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome4ContributionLevel2(String programCompetenciesOutcome4ContributionLevel2) {
        this.programCompetenciesOutcome4ContributionLevel2 = programCompetenciesOutcome4ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome4ContributionLevel3() {
        return programCompetenciesOutcome4ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome4ContributionLevel3(String programCompetenciesOutcome4ContributionLevel3) {
        this.programCompetenciesOutcome4ContributionLevel3 = programCompetenciesOutcome4ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome4ContributionLevel4() {
        return programCompetenciesOutcome4ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome4ContributionLevel4(String programCompetenciesOutcome4ContributionLevel4) {
        this.programCompetenciesOutcome4ContributionLevel4 = programCompetenciesOutcome4ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome4ContributionLevel5() {
        return programCompetenciesOutcome4ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome4ContributionLevel5(String programCompetenciesOutcome4ContributionLevel5) {
        this.programCompetenciesOutcome4ContributionLevel5 = programCompetenciesOutcome4ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome4LOno() {
        return programCompetenciesOutcome4LOno;
    }

    public void setProgramCompetenciesOutcome4LOno(String programCompetenciesOutcome4LOno) {
        this.programCompetenciesOutcome4LOno = programCompetenciesOutcome4LOno;
    }

    public String getProgramCompetenciesOutcome5() {
        return programCompetenciesOutcome5;
    }

    public void setProgramCompetenciesOutcome5(String programCompetenciesOutcome5) {
        this.programCompetenciesOutcome5 = programCompetenciesOutcome5;
    }

    public String getProgramCompetenciesOutcome5ContributionLevel1() {
        return programCompetenciesOutcome5ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome5ContributionLevel1(String programCompetenciesOutcome5ContributionLevel1) {
        this.programCompetenciesOutcome5ContributionLevel1 = programCompetenciesOutcome5ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome5ContributionLevel2() {
        return programCompetenciesOutcome5ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome5ContributionLevel2(String programCompetenciesOutcome5ContributionLevel2) {
        this.programCompetenciesOutcome5ContributionLevel2 = programCompetenciesOutcome5ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome5ContributionLevel3() {
        return programCompetenciesOutcome5ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome5ContributionLevel3(String programCompetenciesOutcome5ContributionLevel3) {
        this.programCompetenciesOutcome5ContributionLevel3 = programCompetenciesOutcome5ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome5ContributionLevel4() {
        return programCompetenciesOutcome5ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome5ContributionLevel4(String programCompetenciesOutcome5ContributionLevel4) {
        this.programCompetenciesOutcome5ContributionLevel4 = programCompetenciesOutcome5ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome5ContributionLevel5() {
        return programCompetenciesOutcome5ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome5ContributionLevel5(String programCompetenciesOutcome5ContributionLevel5) {
        this.programCompetenciesOutcome5ContributionLevel5 = programCompetenciesOutcome5ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome5LOno() {
        return programCompetenciesOutcome5LOno;
    }

    public void setProgramCompetenciesOutcome5LOno(String programCompetenciesOutcome5LOno) {
        this.programCompetenciesOutcome5LOno = programCompetenciesOutcome5LOno;
    }

    public String getProgramCompetenciesOutcome6() {
        return programCompetenciesOutcome6;
    }

    public void setProgramCompetenciesOutcome6(String programCompetenciesOutcome6) {
        this.programCompetenciesOutcome6 = programCompetenciesOutcome6;
    }

    public String getProgramCompetenciesOutcome6ContributionLevel1() {
        return programCompetenciesOutcome6ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome6ContributionLevel1(String programCompetenciesOutcome6ContributionLevel1) {
        this.programCompetenciesOutcome6ContributionLevel1 = programCompetenciesOutcome6ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome6ContributionLevel2() {
        return programCompetenciesOutcome6ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome6ContributionLevel2(String programCompetenciesOutcome6ContributionLevel2) {
        this.programCompetenciesOutcome6ContributionLevel2 = programCompetenciesOutcome6ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome6ContributionLevel3() {
        return programCompetenciesOutcome6ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome6ContributionLevel3(String programCompetenciesOutcome6ContributionLevel3) {
        this.programCompetenciesOutcome6ContributionLevel3 = programCompetenciesOutcome6ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome6ContributionLevel4() {
        return programCompetenciesOutcome6ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome6ContributionLevel4(String programCompetenciesOutcome6ContributionLevel4) {
        this.programCompetenciesOutcome6ContributionLevel4 = programCompetenciesOutcome6ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome6ContributionLevel5() {
        return programCompetenciesOutcome6ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome6ContributionLevel5(String programCompetenciesOutcome6ContributionLevel5) {
        this.programCompetenciesOutcome6ContributionLevel5 = programCompetenciesOutcome6ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome6LOno() {
        return programCompetenciesOutcome6LOno;
    }

    public void setProgramCompetenciesOutcome6LOno(String programCompetenciesOutcome6LOno) {
        this.programCompetenciesOutcome6LOno = programCompetenciesOutcome6LOno;
    }

    public String getProgramCompetenciesOutcome7() {
        return programCompetenciesOutcome7;
    }

    public void setProgramCompetenciesOutcome7(String programCompetenciesOutcome7) {
        this.programCompetenciesOutcome7 = programCompetenciesOutcome7;
    }

    public String getProgramCompetenciesOutcome7ContributionLevel1() {
        return programCompetenciesOutcome7ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome7ContributionLevel1(String programCompetenciesOutcome7ContributionLevel1) {
        this.programCompetenciesOutcome7ContributionLevel1 = programCompetenciesOutcome7ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome7ContributionLevel2() {
        return programCompetenciesOutcome7ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome7ContributionLevel2(String programCompetenciesOutcome7ContributionLevel2) {
        this.programCompetenciesOutcome7ContributionLevel2 = programCompetenciesOutcome7ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome7ContributionLevel3() {
        return programCompetenciesOutcome7ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome7ContributionLevel3(String programCompetenciesOutcome7ContributionLevel3) {
        this.programCompetenciesOutcome7ContributionLevel3 = programCompetenciesOutcome7ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome7ContributionLevel4() {
        return programCompetenciesOutcome7ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome7ContributionLevel4(String programCompetenciesOutcome7ContributionLevel4) {
        this.programCompetenciesOutcome7ContributionLevel4 = programCompetenciesOutcome7ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome7ContributionLevel5() {
        return programCompetenciesOutcome7ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome7ContributionLevel5(String programCompetenciesOutcome7ContributionLevel5) {
        this.programCompetenciesOutcome7ContributionLevel5 = programCompetenciesOutcome7ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome7LOno() {
        return programCompetenciesOutcome7LOno;
    }

    public void setProgramCompetenciesOutcome7LOno(String programCompetenciesOutcome7LOno) {
        this.programCompetenciesOutcome7LOno = programCompetenciesOutcome7LOno;
    }

    public String getProgramCompetenciesOutcome8() {
        return programCompetenciesOutcome8;
    }

    public void setProgramCompetenciesOutcome8(String programCompetenciesOutcome8) {
        this.programCompetenciesOutcome8 = programCompetenciesOutcome8;
    }

    public String getProgramCompetenciesOutcome8ContributionLevel1() {
        return programCompetenciesOutcome8ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome8ContributionLevel1(String programCompetenciesOutcome8ContributionLevel1) {
        this.programCompetenciesOutcome8ContributionLevel1 = programCompetenciesOutcome8ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome8ContributionLevel2() {
        return programCompetenciesOutcome8ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome8ContributionLevel2(String programCompetenciesOutcome8ContributionLevel2) {
        this.programCompetenciesOutcome8ContributionLevel2 = programCompetenciesOutcome8ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome8ContributionLevel3() {
        return programCompetenciesOutcome8ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome8ContributionLevel3(String programCompetenciesOutcome8ContributionLevel3) {
        this.programCompetenciesOutcome8ContributionLevel3 = programCompetenciesOutcome8ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome8ContributionLevel4() {
        return programCompetenciesOutcome8ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome8ContributionLevel4(String programCompetenciesOutcome8ContributionLevel4) {
        this.programCompetenciesOutcome8ContributionLevel4 = programCompetenciesOutcome8ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome8ContributionLevel5() {
        return programCompetenciesOutcome8ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome8ContributionLevel5(String programCompetenciesOutcome8ContributionLevel5) {
        this.programCompetenciesOutcome8ContributionLevel5 = programCompetenciesOutcome8ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome8LOno() {
        return programCompetenciesOutcome8LOno;
    }

    public void setProgramCompetenciesOutcome8LOno(String programCompetenciesOutcome8LOno) {
        this.programCompetenciesOutcome8LOno = programCompetenciesOutcome8LOno;
    }

    public String getProgramCompetenciesOutcome9() {
        return programCompetenciesOutcome9;
    }

    public void setProgramCompetenciesOutcome9(String programCompetenciesOutcome9) {
        this.programCompetenciesOutcome9 = programCompetenciesOutcome9;
    }

    public String getProgramCompetenciesOutcome9ContributionLevel1() {
        return programCompetenciesOutcome9ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome9ContributionLevel1(String programCompetenciesOutcome9ContributionLevel1) {
        this.programCompetenciesOutcome9ContributionLevel1 = programCompetenciesOutcome9ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome9ContributionLevel2() {
        return programCompetenciesOutcome9ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome9ContributionLevel2(String programCompetenciesOutcome9ContributionLevel2) {
        this.programCompetenciesOutcome9ContributionLevel2 = programCompetenciesOutcome9ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome9ContributionLevel3() {
        return programCompetenciesOutcome9ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome9ContributionLevel3(String programCompetenciesOutcome9ContributionLevel3) {
        this.programCompetenciesOutcome9ContributionLevel3 = programCompetenciesOutcome9ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome9ContributionLevel4() {
        return programCompetenciesOutcome9ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome9ContributionLevel4(String programCompetenciesOutcome9ContributionLevel4) {
        this.programCompetenciesOutcome9ContributionLevel4 = programCompetenciesOutcome9ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome9ContributionLevel5() {
        return programCompetenciesOutcome9ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome9ContributionLevel5(String programCompetenciesOutcome9ContributionLevel5) {
        this.programCompetenciesOutcome9ContributionLevel5 = programCompetenciesOutcome9ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome9LOno() {
        return programCompetenciesOutcome9LOno;
    }

    public void setProgramCompetenciesOutcome9LOno(String programCompetenciesOutcome9LOno) {
        this.programCompetenciesOutcome9LOno = programCompetenciesOutcome9LOno;
    }

    public String getProgramCompetenciesOutcome10() {
        return programCompetenciesOutcome10;
    }

    public void setProgramCompetenciesOutcome10(String programCompetenciesOutcome10) {
        this.programCompetenciesOutcome10 = programCompetenciesOutcome10;
    }

    public String getProgramCompetenciesOutcome10ContributionLevel1() {
        return programCompetenciesOutcome10ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome10ContributionLevel1(String programCompetenciesOutcome10ContributionLevel1) {
        this.programCompetenciesOutcome10ContributionLevel1 = programCompetenciesOutcome10ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome10ContributionLevel2() {
        return programCompetenciesOutcome10ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome10ContributionLevel2(String programCompetenciesOutcome10ContributionLevel2) {
        this.programCompetenciesOutcome10ContributionLevel2 = programCompetenciesOutcome10ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome10ContributionLevel3() {
        return programCompetenciesOutcome10ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome10ContributionLevel3(String programCompetenciesOutcome10ContributionLevel3) {
        this.programCompetenciesOutcome10ContributionLevel3 = programCompetenciesOutcome10ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome10ContributionLevel4() {
        return programCompetenciesOutcome10ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome10ContributionLevel4(String programCompetenciesOutcome10ContributionLevel4) {
        this.programCompetenciesOutcome10ContributionLevel4 = programCompetenciesOutcome10ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome10ContributionLevel5() {
        return programCompetenciesOutcome10ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome10ContributionLevel5(String programCompetenciesOutcome10ContributionLevel5) {
        this.programCompetenciesOutcome10ContributionLevel5 = programCompetenciesOutcome10ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome10LOno() {
        return programCompetenciesOutcome10LOno;
    }

    public void setProgramCompetenciesOutcome10LOno(String programCompetenciesOutcome10LOno) {
        this.programCompetenciesOutcome10LOno = programCompetenciesOutcome10LOno;
    }

    public String getProgramCompetenciesOutcome11() {
        return programCompetenciesOutcome11;
    }

    public void setProgramCompetenciesOutcome11(String programCompetenciesOutcome11) {
        this.programCompetenciesOutcome11 = programCompetenciesOutcome11;
    }

    public String getProgramCompetenciesOutcome11ContributionLevel1() {
        return programCompetenciesOutcome11ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome11ContributionLevel1(String programCompetenciesOutcome11ContributionLevel1) {
        this.programCompetenciesOutcome11ContributionLevel1 = programCompetenciesOutcome11ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome11ContributionLevel2() {
        return programCompetenciesOutcome11ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome11ContributionLevel2(String programCompetenciesOutcome11ContributionLevel2) {
        this.programCompetenciesOutcome11ContributionLevel2 = programCompetenciesOutcome11ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome11ContributionLevel3() {
        return programCompetenciesOutcome11ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome11ContributionLevel3(String programCompetenciesOutcome11ContributionLevel3) {
        this.programCompetenciesOutcome11ContributionLevel3 = programCompetenciesOutcome11ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome11ContributionLevel4() {
        return programCompetenciesOutcome11ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome11ContributionLevel4(String programCompetenciesOutcome11ContributionLevel4) {
        this.programCompetenciesOutcome11ContributionLevel4 = programCompetenciesOutcome11ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome11ContributionLevel5() {
        return programCompetenciesOutcome11ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome11ContributionLevel5(String programCompetenciesOutcome11ContributionLevel5) {
        this.programCompetenciesOutcome11ContributionLevel5 = programCompetenciesOutcome11ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome11LOno() {
        return programCompetenciesOutcome11LOno;
    }

    public void setProgramCompetenciesOutcome11LOno(String programCompetenciesOutcome11LOno) {
        this.programCompetenciesOutcome11LOno = programCompetenciesOutcome11LOno;
    }

    public String getProgramCompetenciesOutcome12() {
        return programCompetenciesOutcome12;
    }

    public void setProgramCompetenciesOutcome12(String programCompetenciesOutcome12) {
        this.programCompetenciesOutcome12 = programCompetenciesOutcome12;
    }

    public String getProgramCompetenciesOutcome12ContributionLevel1() {
        return programCompetenciesOutcome12ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome12ContributionLevel1(String programCompetenciesOutcome12ContributionLevel1) {
        this.programCompetenciesOutcome12ContributionLevel1 = programCompetenciesOutcome12ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome12ContributionLevel2() {
        return programCompetenciesOutcome12ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome12ContributionLevel2(String programCompetenciesOutcome12ContributionLevel2) {
        this.programCompetenciesOutcome12ContributionLevel2 = programCompetenciesOutcome12ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome12ContributionLevel3() {
        return programCompetenciesOutcome12ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome12ContributionLevel3(String programCompetenciesOutcome12ContributionLevel3) {
        this.programCompetenciesOutcome12ContributionLevel3 = programCompetenciesOutcome12ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome12ContributionLevel4() {
        return programCompetenciesOutcome12ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome12ContributionLevel4(String programCompetenciesOutcome12ContributionLevel4) {
        this.programCompetenciesOutcome12ContributionLevel4 = programCompetenciesOutcome12ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome12ContributionLevel5() {
        return programCompetenciesOutcome12ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome12ContributionLevel5(String programCompetenciesOutcome12ContributionLevel5) {
        this.programCompetenciesOutcome12ContributionLevel5 = programCompetenciesOutcome12ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome12LOno() {
        return programCompetenciesOutcome12LOno;
    }

    public void setProgramCompetenciesOutcome12LOno(String programCompetenciesOutcome12LOno) {
        this.programCompetenciesOutcome12LOno = programCompetenciesOutcome12LOno;
    }

    public String getProgramCompetenciesOutcome13() {
        return programCompetenciesOutcome13;
    }

    public void setProgramCompetenciesOutcome13(String programCompetenciesOutcome13) {
        this.programCompetenciesOutcome13 = programCompetenciesOutcome13;
    }

    public String getProgramCompetenciesOutcome13ContributionLevel1() {
        return programCompetenciesOutcome13ContributionLevel1;
    }

    public void setProgramCompetenciesOutcome13ContributionLevel1(String programCompetenciesOutcome13ContributionLevel1) {
        this.programCompetenciesOutcome13ContributionLevel1 = programCompetenciesOutcome13ContributionLevel1;
    }

    public String getProgramCompetenciesOutcome13ContributionLevel2() {
        return programCompetenciesOutcome13ContributionLevel2;
    }

    public void setProgramCompetenciesOutcome13ContributionLevel2(String programCompetenciesOutcome13ContributionLevel2) {
        this.programCompetenciesOutcome13ContributionLevel2 = programCompetenciesOutcome13ContributionLevel2;
    }

    public String getProgramCompetenciesOutcome13ContributionLevel3() {
        return programCompetenciesOutcome13ContributionLevel3;
    }

    public void setProgramCompetenciesOutcome13ContributionLevel3(String programCompetenciesOutcome13ContributionLevel3) {
        this.programCompetenciesOutcome13ContributionLevel3 = programCompetenciesOutcome13ContributionLevel3;
    }

    public String getProgramCompetenciesOutcome13ContributionLevel4() {
        return programCompetenciesOutcome13ContributionLevel4;
    }

    public void setProgramCompetenciesOutcome13ContributionLevel4(String programCompetenciesOutcome13ContributionLevel4) {
        this.programCompetenciesOutcome13ContributionLevel4 = programCompetenciesOutcome13ContributionLevel4;
    }

    public String getProgramCompetenciesOutcome13ContributionLevel5() {
        return programCompetenciesOutcome13ContributionLevel5;
    }

    public void setProgramCompetenciesOutcome13ContributionLevel5(String programCompetenciesOutcome13ContributionLevel5) {
        this.programCompetenciesOutcome13ContributionLevel5 = programCompetenciesOutcome13ContributionLevel5;
    }

    public String getProgramCompetenciesOutcome13LOno() {
        return programCompetenciesOutcome13LOno;
    }

    public void setProgramCompetenciesOutcome13LOno(String programCompetenciesOutcome13LOno) {
        this.programCompetenciesOutcome13LOno = programCompetenciesOutcome13LOno;
    }

    public String getReasonForUpdate() {
        return reasonForUpdate;
    }

    public void setReasonForUpdate(String reasonForUpdate) {
        this.reasonForUpdate = reasonForUpdate;
    }



    public CourseInformationx() {
        this.version = 0;
        this.courseName = " ";
        this.code = " ";
        this.season = " ";
        this.theory = " ";
        this.lab = " ";
        this.localCredits = " ";
        this.ects = " ";
        this.prerequisities = " ";
        this.courseLanguage = " ";
        this.courseType = " ";
        this.courseLevel = " ";
        this.modeOfDelivery = " ";
        this.teachingMethodsAndTechniques = " ";
        this.courseCoordinator = " ";
        this.courseLecturers = " ";
        this.courseAssistants = " ";
        this.courseObjectives = " ";
        this.learningOutcomes = " ";
        this.courseDescription = " ";
        this.CCCoreCourse = " ";
        this.CCMajorAreaCourse = " ";
        this.CCSupportiveCourse = " ";
        this.CCComAndManagementSkillsCourse = " ";
        this.CCTransferableSkillCourse = " ";
        this.week1Subjects = " ";
        this.week2Subjects = " ";
        this.week3Subjects = " ";
        this.week4Subjects = " ";
        this.week5Subjects = " ";
        this.week6Subjects = " ";
        this.week7Subjects = " ";
        this.week8Subjects = " ";
        this.week9Subjects = " ";
        this.week10Subjects = " ";
        this.week11Subjects = " ";
        this.week12Subjects = " ";
        this.week13Subjects = " ";
        this.week14Subjects = " ";
        this.week15Subjects = " ";
        this.week1ReqMat = " ";
        this.week2ReqMat = " ";
        this.week3ReqMat = " ";
        this.week4ReqMat = " ";
        this.week5ReqMat = " ";
        this.week6ReqMat = " ";
        this.week7ReqMat = " ";
        this.week8ReqMat = " ";
        this.week9ReqMat = " ";
        this.week10ReqMat = " ";
        this.week11ReqMat = " ";
        this.week12ReqMat = " ";
        this.week13ReqMat = " ";
        this.week14ReqMat = " ";
        this.week15ReqMat = " ";
        this.courseNotesAndTextBooks = " ";
        this.suggestedReadingsAndMaterials = " ";
        this.noOfParticipation = " ";
        this.noOfLabOrApplication = " ";
        this.noOfFieldWork = " ";
        this.noOfQuizOrStudioCritique = " ";
        this.noOfHwOrAssignment = " ";
        this.noOfPresentationOrJury = " ";
        this.noOfProject = " ";
        this.noOfPortfolio = " ";
        this.noOfSeminarOrWorkshop = " ";
        this.noOfOralExam = " ";
        this.noOfMidterm = " ";
        this.noOfFinalExam = " ";
        this.noOfPresentationJury = " ";
        this.noOfTotalWeight = " ";
        this.weightOfParticipation = " ";
        this.weightOfLabOrApplication = " ";
        this.weightOfFieldWork = " ";
        this.weightOfQuizOrStudioCritique = " ";
        this.weightOfHwOrAssignment = " ";
        this.weightOfPresentationOrJury = " ";
        this.weightOfProject = " ";
        this.weightOfPortfolio = " ";
        this.weightOfSeminarOrWorkshop = " ";
        this.weightOfOralExam = " ";
        this.weightOfMidterm = " ";
        this.weightOfFinalExam = " ";
        this.weightOfPresentationJury = " ";
        this.weightOfTotalWeight = " ";
        this.LO1OfParticipation = " ";
        this.LO1OfLabOrApplication = " ";
        this.LO1OfFieldWork = " ";
        this.LO1OfQuizOrStudioCritique = " ";
        this.LO1OfHwOrAssignment = " ";
        this.LO1OfPresentationOrJury = " ";
        this.LO1OfProject = " ";
        this.L01OfPortfolio=" ";
        this.LO1OfSeminarOrWorkshop = " ";
        this.LO1OfOralExam = " ";
        this.LO1OfMidterm = " ";
        this.LO1OfFinalExam = " ";
        this.LO1OfPresentationJury = " ";
        this.LO1OfTotalWeight = " ";
        this.LO2OfParticipation = " ";
        this.LO2OfLabOrApplication = " ";
        this.LO2OfFieldWork = " ";
        this.LO2OfQuizOrStudioCritique = " ";
        this.LO2OfHwOrAssignment = " ";
        this.LO2OfPresentationOrJury = " ";
        this.LO2OfProject = " ";
        this.L02OfPortfolio=" ";
        this.LO2OfSeminarOrWorkshop = " ";
        this.LO2OfOralExam = " ";
        this.LO2OfMidterm = " ";
        this.LO2OfFinalExam = " ";
        this.LO2OfPresentationJury = " ";
        this.LO2OfTotalWeight = " ";
        this.LO3OfParticipation = " ";
        this.LO3OfLabOrApplication = " ";
        this.LO3OfFieldWork = " ";
        this.LO3OfQuizOrStudioCritique = " ";
        this.LO3OfHwOrAssignment = " ";
        this.LO3OfPresentationOrJury = " ";
        this.LO3OfProject = " ";
        this.L03OfPortfolio=" ";
        this.LO3OfSeminarOrWorkshop = " ";
        this.LO3OfOralExam = " ";
        this.LO3OfMidterm = " ";
        this.LO3OfFinalExam = " ";
        this.LO3OfPresentationJury = " ";
        this.LO3OfTotalWeight = " ";
        this.LO4OfParticipation = " ";
        this.LO4OfLabOrApplication = " ";
        this.LO4OfFieldWork = " ";
        this.LO4OfQuizOrStudioCritique = " ";
        this.LO4OfHwOrAssignment = " ";
        this.LO4OfPresentationOrJury = " ";
        this.LO4OfProject = " ";
        this.L04OfPortfolio=" ";
        this.LO4OfSeminarOrWorkshop = " ";
        this.LO4OfOralExam = " ";
        this.LO4OfMidterm = " ";
        this.LO4OfFinalExam = " ";
        this.LO4OfPresentationJury = " ";
        this.LO4OfTotalWeight = " ";
        this.LO5OfParticipation = " ";
        this.LO5OfLabOrApplication = " ";
        this.LO5OfFieldWork = " ";
        this.LO5OfQuizOrStudioCritique = " ";
        this.LO5OfHwOrAssignment = " ";
        this.LO5OfPresentationOrJury = " ";
        this.LO5OfProject = " ";
        this.L05OfPortfolio=" ";
        this.LO5OfSeminarOrWorkshop = " ";
        this.LO5OfOralExam = " ";
        this.LO5OfMidterm = " ";
        this.LO5OfFinalExam = " ";
        this.LO5OfPresentationJury = " ";
        this.LO5OfTotalWeight = " ";
        this.LO6OfParticipation = " ";
        this.LO6OfLabOrApplication = " ";
        this.LO6OfFieldWork = " ";
        this.LO6OfQuizOrStudioCritique = " ";
        this.LO6OfHwOrAssignment = " ";
        this.LO6OfPresentationOrJury = " ";
        this.LO6OfProject = " ";
        this.L06OfPortfolio=" ";
        this.LO6OfSeminarOrWorkshop = " ";
        this.LO6OfOralExam = " ";
        this.LO6OfMidterm = " ";
        this.LO6OfFinalExam = " ";
        this.LO6OfPresentationJury = " ";
        this.LO6OfTotalWeight = " ";
        this.LO7OfParticipation = " ";
        this.LO7OfLabOrApplication = " ";
        this.LO7OfFieldWork = " ";
        this.LO7OfQuizOrStudioCritique = " ";
        this.LO7OfHwOrAssignment = " ";
        this.LO7OfPresentationOrJury = " ";
        this.LO7OfProject = " ";
        this.L07OfPortfolio=" ";
        this.LO7OfSeminarOrWorkshop = " ";
        this.LO7OfOralExam = " ";
        this.LO7OfMidterm = " ";
        this.LO7OfFinalExam = " ";
        this.LO7OfPresentationJury = " ";
        this.LO7OfTotalWeight = " ";
        this.weightOfSemActivitiesOnFinalGrade1 = " ";
        this.weightOfSemActivitiesOnFinalGrade2 = " ";
        this.weightOfEndOfSemActivitiesOnFinalGrade1 = " ";
        this.weightOfEndOfSemActivitiesOnFinalGrade2 = " ";
        this.endOfTab4Total1 = " ";
        this.endOfTab4Total2 = " ";
        this.courseHoursDur = " ";
        this.labOrApplicationHoursDur = " ";
        this.studyHourseOutsideClass = " ";
        this.fieldWork = " ";
        this.quizOrStudioCritique = " ";
        this.homeworkOrAssignment = " ";
        this.presentationOrJury = " ";
        this.project = " ";
        this.portfolio = " ";
        this.seminarOrWorkshop = " ";
        this.oralExam = " ";
        this.midterm = " ";
        this.Final = " ";
        this.TotalWorkload = " ";
        this.courseHoursDur = " ";
        this.labOrApplicationHoursDur = " ";
        this.studyHourseOutsideClassDur =  " ";
        this.fieldWorkDur =  " ";
        this.quizOrStudioCritiqueDur =  " ";
        this.homeworkOrAssignmentDur =  " ";
        this.presentationOrJuryDur =  " ";
        this.projectDur =  " ";
        this.portfolioDur =  " ";
        this.seminarOrWorkshopDur =  " ";
        this.oralExamDur =  " ";
        this.midtermDur =  " ";
        this.FinalDur =  " ";
        this.courseHoursWL =  " ";
        this.labOrApplicationHourWL =  " ";
        this.studyHourseOutsideClassWL =  " ";
        this.fieldWorkWL =  " ";
        this.quizOrStudioCritiqueWL =  " ";
        this.homeworkOrAssignmentWL =  " ";
        this.presentationOrJuryWL =  " ";
        this.projectWL =  " ";
        this.portfolioWL =  " ";
        this.seminarOrWorkshopWL =  " ";
        this.oralExamWL =  " ";
        this.midtermWL =  " ";
        this.FinalWL = " ";
        this.programCompetenciesOutcome1 =  " ";
        this.programCompetenciesOutcome1ContributionLevel1 =  " ";
        this.programCompetenciesOutcome1ContributionLevel2 =  " ";
        this.programCompetenciesOutcome1ContributionLevel3 =  " ";
        this.programCompetenciesOutcome1ContributionLevel4 =  " ";
        this.programCompetenciesOutcome1ContributionLevel5 =  " ";
        this.programCompetenciesOutcome1LOno =  " ";
        this.programCompetenciesOutcome2 =  " ";
        this.programCompetenciesOutcome2ContributionLevel1 =  " ";
        this.programCompetenciesOutcome2ContributionLevel2 =  " ";
        this.programCompetenciesOutcome2ContributionLevel3 =  " ";
        this.programCompetenciesOutcome2ContributionLevel4 =  " ";
        this.programCompetenciesOutcome2ContributionLevel5 =  " ";
        this.programCompetenciesOutcome2LOno =  " ";
        this.programCompetenciesOutcome3 =  " ";
        this.programCompetenciesOutcome3ContributionLevel1 =  " ";
        this.programCompetenciesOutcome3ContributionLevel2 =  " ";
        this.programCompetenciesOutcome3ContributionLevel3 =  " ";
        this.programCompetenciesOutcome3ContributionLevel4 =  " ";
        this.programCompetenciesOutcome3ContributionLevel5 =  " ";
        this.programCompetenciesOutcome3LOno =  " ";
        this.programCompetenciesOutcome4 =  " ";
        this.programCompetenciesOutcome4ContributionLevel1 =  " ";
        this.programCompetenciesOutcome4ContributionLevel2 =  " ";
        this.programCompetenciesOutcome4ContributionLevel3 =  " ";
        this.programCompetenciesOutcome4ContributionLevel4 =  " ";
        this.programCompetenciesOutcome4ContributionLevel5 =  " ";
        this.programCompetenciesOutcome4LOno =  " ";
        this.programCompetenciesOutcome5 =  " ";
        this.programCompetenciesOutcome5ContributionLevel1 =  " ";
        this.programCompetenciesOutcome5ContributionLevel2 =  " ";
        this.programCompetenciesOutcome5ContributionLevel3 =  " ";
        this.programCompetenciesOutcome5ContributionLevel4 =  " ";
        this.programCompetenciesOutcome5ContributionLevel5 =  " ";
        this.programCompetenciesOutcome5LOno =  " ";
        this.programCompetenciesOutcome6 =  " ";
        this.programCompetenciesOutcome6ContributionLevel1 =  " ";
        this.programCompetenciesOutcome6ContributionLevel2 =  " ";
        this.programCompetenciesOutcome6ContributionLevel3 =  " ";
        this.programCompetenciesOutcome6ContributionLevel4 =  " ";
        this.programCompetenciesOutcome6ContributionLevel5 =  " ";
        this.programCompetenciesOutcome6LOno =  " ";
        this.programCompetenciesOutcome7 =  " ";
        this.programCompetenciesOutcome7ContributionLevel1 =  " ";
        this.programCompetenciesOutcome7ContributionLevel2 =  " ";
        this.programCompetenciesOutcome7ContributionLevel3 =  " ";
        this.programCompetenciesOutcome7ContributionLevel4 =  " ";
        this.programCompetenciesOutcome7ContributionLevel5 =  " ";
        this.programCompetenciesOutcome7LOno =  " ";
        this.programCompetenciesOutcome8 =  " ";
        this.programCompetenciesOutcome8ContributionLevel1 =  " ";
        this.programCompetenciesOutcome8ContributionLevel2 =  " ";
        this.programCompetenciesOutcome8ContributionLevel3 =  " ";
        this.programCompetenciesOutcome8ContributionLevel4 =  " ";
        this.programCompetenciesOutcome8ContributionLevel5 =  " ";
        this.programCompetenciesOutcome8LOno =  " ";
        this.programCompetenciesOutcome9 =  " ";
        this.programCompetenciesOutcome9ContributionLevel1 =  " ";
        this.programCompetenciesOutcome9ContributionLevel2 =  " ";
        this.programCompetenciesOutcome9ContributionLevel3 =  " ";
        this.programCompetenciesOutcome9ContributionLevel4 =  " ";
        this.programCompetenciesOutcome9ContributionLevel5 =  " ";
        this.programCompetenciesOutcome9LOno =  " ";
        this.programCompetenciesOutcome10 =  " ";
        this.programCompetenciesOutcome10ContributionLevel1 =  " ";
        this.programCompetenciesOutcome10ContributionLevel2 =  " ";
        this.programCompetenciesOutcome10ContributionLevel3 =  " ";
        this.programCompetenciesOutcome10ContributionLevel4 =  " ";
        this.programCompetenciesOutcome10ContributionLevel5 =  " ";
        this.programCompetenciesOutcome10LOno =  " ";
        this.programCompetenciesOutcome11 =  " ";
        this.programCompetenciesOutcome11ContributionLevel1 =  " ";
        this.programCompetenciesOutcome11ContributionLevel2 =  " ";
        this.programCompetenciesOutcome11ContributionLevel3 =  " ";
        this.programCompetenciesOutcome11ContributionLevel4 =  " ";
        this.programCompetenciesOutcome11ContributionLevel5 =  " ";
        this.programCompetenciesOutcome11LOno =  " ";
        this.programCompetenciesOutcome12 =  " ";
        this.programCompetenciesOutcome12ContributionLevel1 =  " ";
        this.programCompetenciesOutcome12ContributionLevel2 =  " ";
        this.programCompetenciesOutcome12ContributionLevel3 =  " ";
        this.programCompetenciesOutcome12ContributionLevel4 =  " ";
        this.programCompetenciesOutcome12ContributionLevel5 =  " ";
        this.programCompetenciesOutcome12LOno =  " ";
        this.reasonForUpdate =  " ";
    }
    @Override
    public String toString() {
        return "CourseInformationx{" +
                "version='" + version + '\'' + // now we made version an int it gives an error when reading.
                ", courseName='" + courseName + '\'' +
                ", code='" + code + '\'' +
                ", season='" + season + '\'' +
                ", theory='" + theory + '\'' +
                ", lab='" + lab + '\'' +
                ", localCredits='" + localCredits + '\'' +
                ", ects='" + ects + '\'' +
                ", prerequisities='" + prerequisities + '\'' +
                ", courseLanguage='" + courseLanguage + '\'' +
                ", courseType='" + courseType + '\'' +
                ", courseLevel='" + courseLevel + '\'' +
                ", modeOfDelivery='" + modeOfDelivery + '\'' +
                ", teachingMethodsAndTechniques='" + teachingMethodsAndTechniques + '\'' +
                ", courseCoordinator='" + courseCoordinator + '\'' +
                ", courseLecturers='" + courseLecturers + '\'' +
                ", courseAssistants='" + courseAssistants + '\'' +"\n" +
                ", courseObjectives='" + courseObjectives + '\'' +
                ", learningOutcomes='" + learningOutcomes + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", CCCoreCourse='" + CCCoreCourse + '\'' +
                ", CCMajorAreaCourse='" + CCMajorAreaCourse + '\'' +
                ", CCSupportiveCourse='" + CCSupportiveCourse + '\'' +
                ", CCComAndManagementSkillsCourse='" + CCComAndManagementSkillsCourse + '\'' +
                ", CCTransferableSkillCourse='" + CCTransferableSkillCourse + '\''+"\n" +
                ", week1Subjects='" + week1Subjects + '\'' +
                ", week2Subjects='" + week2Subjects + '\'' +
                ", week3Subjects='" + week3Subjects + '\'' +
                ", week4Subjects='" + week4Subjects + '\'' +
                ", week5Subjects='" + week5Subjects + '\'' +
                ", week6Subjects='" + week6Subjects + '\'' +
                ", week7Subjects='" + week7Subjects + '\'' +
                ", week8Subjects='" + week8Subjects + '\'' +
                ", week9Subjects='" + week9Subjects + '\'' +
                ", week10Subjects='" + week10Subjects + '\'' +
                ", week11Subjects='" + week11Subjects + '\'' +
                ", week12Subjects='" + week12Subjects + '\'' +
                ", week13Subjects='" + week13Subjects + '\'' +
                ", week14Subjects='" + week14Subjects + '\'' +
                ", week15Subjects='" + week15Subjects + '\'' +
                ", week1ReqMat='" + week1ReqMat + '\'' +
                ", week2ReqMat='" + week2ReqMat + '\'' +
                ", week3ReqMat='" + week3ReqMat + '\'' +
                ", week4ReqMat='" + week4ReqMat + '\'' +
                ", week5ReqMat='" + week5ReqMat + '\'' +
                ", week6ReqMat='" + week6ReqMat + '\'' +
                ", week7ReqMat='" + week7ReqMat + '\'' +
                ", week8ReqMat='" + week8ReqMat + '\'' +
                ", week9ReqMat='" + week9ReqMat + '\'' +
                ", week10ReqMat='" + week10ReqMat + '\'' +
                ", week11ReqMat='" + week11ReqMat + '\'' +
                ", week12ReqMat='" + week12ReqMat + '\'' +
                ", week13ReqMat='" + week13ReqMat + '\'' +
                ", week14ReqMat='" + week14ReqMat + '\'' +
                ", week15ReqMat='" + week15ReqMat + '\'' +"\n "+
                ", courseNotesAndTextBooks='" + courseNotesAndTextBooks + '\'' +
                ", suggestedReadingsAndMaterials='" + suggestedReadingsAndMaterials + '\'' +
                ", noOfParticipation='" + noOfParticipation + '\'' +
                ", noOfLabOrApplication='" + noOfLabOrApplication + '\'' +
                ", noOfFieldWork='" + noOfFieldWork + '\'' +
                ", noOfQuizOrStudioCritique='" + noOfQuizOrStudioCritique + '\'' +
                ", noOfHwOrAssignment='" + noOfHwOrAssignment + '\'' +
                ", noOfPresentationOrJury='" + noOfPresentationOrJury + '\'' +
                ", noOfProject='" + noOfProject + '\'' +
                ", noOfPortfolio='" + noOfPortfolio + '\'' +
                ", noOfSeminarOrWorkshop='" + noOfSeminarOrWorkshop + '\'' +
                ", noOfOralExam='" + noOfOralExam + '\'' +
                ", noOfMidterm='" + noOfMidterm + '\'' +
                ", noOfFinalExam='" + noOfFinalExam + '\'' +
                ", noOfPresentationJury='" + noOfPresentationJury + '\'' +
                ", noOfTotalWeight='" + noOfTotalWeight + '\'' +
                ", weightOfParticipation='" + weightOfParticipation + '\'' +
                ", weightOfLabOrApplication='" + weightOfLabOrApplication + '\'' +
                ", weightOfFieldWork='" + weightOfFieldWork + '\'' +
                ", weightOfQuizOrStudioCritique='" + weightOfQuizOrStudioCritique + '\'' +
                ", weightOfHwOrAssignment='" + weightOfHwOrAssignment + '\'' +
                ", weightOfPresentationOrJury='" + weightOfPresentationOrJury + '\'' +
                ", weightOfProject='" + weightOfProject + '\'' +
                ", weightOfPortfolio='" + weightOfPortfolio + '\'' +
                ", weightOfSeminarOrWorkshop='" + weightOfSeminarOrWorkshop + '\'' +
                ", weightOfOralExam='" + weightOfOralExam + '\'' +
                ", weightOfMidterm='" + weightOfMidterm + '\'' +
                ", weightOfFinalExam='" + weightOfFinalExam + '\'' +
                ", weightOfPresentationJury='" + weightOfPresentationJury + '\'' +
                ", weightOfTotalWeight='" + weightOfTotalWeight + '\'' +
                ", LO1OfParticipation='" + LO1OfParticipation + '\'' +
                ", LO1OfLabOrApplication='" + LO1OfLabOrApplication + '\'' +
                ", LO1OfFieldWork='" + LO1OfFieldWork + '\'' +
                ", LO1OfQuizOrStudioCritique='" + LO1OfQuizOrStudioCritique + '\'' +
                ", LO1OfHwOrAssignment='" + LO1OfHwOrAssignment + '\'' +
                ", LO1OfPresentationOrJury='" + LO1OfPresentationOrJury + '\'' +
                ", LO1OfProject='" + LO1OfProject + '\'' +
                ", LO1OfPortfolio='" + L01OfPortfolio + '\'' +
                ", LO1OfSeminarOrWorkshop='" + LO1OfSeminarOrWorkshop + '\'' +
                ", LO1OfOralExam='" + LO1OfOralExam + '\'' +
                ", LO1OfMidterm='" + LO1OfMidterm + '\'' +
                ", LO1OfFinalExam='" + LO1OfFinalExam + '\'' +
                ", LO1OfPresentationJury='" + LO1OfPresentationJury + '\'' +
                ", LO1OfTotalWeight='" + LO1OfTotalWeight + '\'' +
                ", LO2OfParticipation='" + LO2OfParticipation + '\'' +
                ", LO2OfLabOrApplication='" + LO2OfLabOrApplication + '\'' +
                ", LO2OfFieldWork='" + LO2OfFieldWork + '\'' +
                ", LO2OfQuizOrStudioCritique='" + LO2OfQuizOrStudioCritique + '\'' +
                ", LO2OfHwOrAssignment='" + LO2OfHwOrAssignment + '\'' +
                ", LO2OfPresentationOrJury='" + LO2OfPresentationOrJury + '\'' +
                ", LO2OfProject='" + LO2OfProject + '\'' +
                ", LO2OfPortfolio='" + L02OfPortfolio + '\'' +
                ", LO2OfSeminarOrWorkshop='" + LO2OfSeminarOrWorkshop + '\'' +
                ", LO2OfOralExam='" + LO2OfOralExam + '\'' +
                ", LO2OfMidterm='" + LO2OfMidterm + '\'' +
                ", LO2OfFinalExam='" + LO2OfFinalExam + '\'' +
                ", LO2OfPresentationJury='" + LO2OfPresentationJury + '\'' +
                ", LO2OfTotalWeight='" + LO2OfTotalWeight + '\'' +
                ", LO3OfParticipation='" + LO3OfParticipation + '\'' +
                ", LO3OfLabOrApplication='" + LO3OfLabOrApplication + '\'' +
                ", LO3OfFieldWork='" + LO3OfFieldWork + '\'' +
                ", LO3OfQuizOrStudioCritique='" + LO3OfQuizOrStudioCritique + '\'' +
                ", LO3OfHwOrAssignment='" + LO3OfHwOrAssignment + '\'' +
                ", LO3OfPresentationOrJury='" + LO3OfPresentationOrJury + '\'' +
                ", LO3OfProject='" + LO3OfProject + '\'' +
                ", LO3OfPortfolio='" + L03OfPortfolio + '\'' +
                ", LO3OfSeminarOrWorkshop='" + LO3OfSeminarOrWorkshop + '\'' +
                ", LO3OfOralExam='" + LO3OfOralExam + '\'' +
                ", LO3OfMidterm='" + LO3OfMidterm + '\'' +
                ", LO3OfFinalExam='" + LO3OfFinalExam + '\'' +
                ", LO3OfPresentationJury='" + LO3OfPresentationJury + '\'' +
                ", LO3OfTotalWeight='" + LO3OfTotalWeight + '\'' +
                ", LO4OfParticipation='" + LO4OfParticipation + '\'' +
                ", LO4OfLabOrApplication='" + LO4OfLabOrApplication + '\'' +
                ", LO4OfFieldWork='" + LO4OfFieldWork + '\'' +
                ", LO4OfQuizOrStudioCritique='" + LO4OfQuizOrStudioCritique + '\'' +
                ", LO4OfHwOrAssignment='" + LO4OfHwOrAssignment + '\'' +
                ", LO4OfPresentationOrJury='" + LO4OfPresentationOrJury + '\'' +
                ", LO4OfProject='" + LO4OfProject + '\'' +
                ", LO4OfPortfolio='" + L04OfPortfolio + '\'' +
                ", LO4OfSeminarOrWorkshop='" + LO4OfSeminarOrWorkshop + '\'' +
                ", LO4OfOralExam='" + LO4OfOralExam + '\'' +
                ", LO4OfMidterm='" + LO4OfMidterm + '\'' +
                ", LO4OfFinalExam='" + LO4OfFinalExam + '\'' +
                ", LO4OfPresentationJury='" + LO4OfPresentationJury + '\'' +
                ", LO4OfTotalWeight='" + LO4OfTotalWeight + '\'' +
                ", LO5OfParticipation='" + LO5OfParticipation + '\'' +
                ", LO5OfLabOrApplication='" + LO5OfLabOrApplication + '\'' +
                ", LO5OfFieldWork='" + LO5OfFieldWork + '\'' +
                ", LO5OfQuizOrStudioCritique='" + LO5OfQuizOrStudioCritique + '\'' +
                ", LO5OfHwOrAssignment='" + LO5OfHwOrAssignment + '\'' +
                ", LO5OfPresentationOrJury='" + LO5OfPresentationOrJury + '\'' +
                ", LO5OfProject='" + LO5OfProject + '\'' +
                ", LO5OfPortfolio='" + L05OfPortfolio + '\'' +
                ", LO5OfSeminarOrWorkshop='" + LO5OfSeminarOrWorkshop + '\'' +
                ", LO5OfOralExam='" + LO5OfOralExam + '\'' +
                ", LO5OfMidterm='" + LO5OfMidterm + '\'' +
                ", LO5OfFinalExam='" + LO5OfFinalExam + '\'' +
                ", LO5OfPresentationJury='" + LO5OfPresentationJury + '\'' +
                ", LO5OfTotalWeight='" + LO5OfTotalWeight + '\'' +
                ", LO6OfParticipation='" + LO6OfParticipation + '\'' +
                ", LO6OfLabOrApplication='" + LO6OfLabOrApplication + '\'' +
                ", LO6OfFieldWork='" + LO6OfFieldWork + '\'' +
                ", LO6OfQuizOrStudioCritique='" + LO6OfQuizOrStudioCritique + '\'' +
                ", LO6OfHwOrAssignment='" + LO6OfHwOrAssignment + '\'' +
                ", LO6OfPresentationOrJury='" + LO6OfPresentationOrJury + '\'' +
                ", LO6OfProject='" + LO6OfProject + '\'' +
                ", LO6OfPortfolio='" + L06OfPortfolio + '\'' +
                ", LO6OfSeminarOrWorkshop='" + LO6OfSeminarOrWorkshop + '\'' +
                ", LO6OfOralExam='" + LO6OfOralExam + '\'' +
                ", LO6OfMidterm='" + LO6OfMidterm + '\'' +
                ", LO6OfFinalExam='" + LO6OfFinalExam + '\'' +
                ", LO6OfPresentationJury='" + LO6OfPresentationJury + '\'' +
                ", LO6OfTotalWeight='" + LO6OfTotalWeight + '\'' +
                ", LO7OfParticipation='" + LO7OfParticipation + '\'' +
                ", LO7OfLabOrApplication='" + LO7OfLabOrApplication + '\'' +
                ", LO7OfFieldWork='" + LO7OfFieldWork + '\'' +
                ", LO7OfQuizOrStudioCritique='" + LO7OfQuizOrStudioCritique + '\'' +
                ", LO7OfHwOrAssignment='" + LO7OfHwOrAssignment + '\'' +
                ", LO7OfPresentationOrJury='" + LO7OfPresentationOrJury + '\'' +
                ", LO7OfProject='" + LO7OfProject + '\'' +
                ", LO7OfPortfolio='" + L07OfPortfolio + '\'' +
                ", LO7OfSeminarOrWorkshop='" + LO7OfSeminarOrWorkshop + '\'' +
                ", LO7OfOralExam='" + LO7OfOralExam + '\'' +
                ", LO7OfMidterm='" + LO7OfMidterm + '\'' +
                ", LO7OfFinalExam='" + LO7OfFinalExam + '\'' +
                ", LO7OfPresentationJury='" + LO7OfPresentationJury + '\'' +
                ", LO7OfTotalWeight='" + LO7OfTotalWeight + '\'' +
                ", weightOfSemActivitiesOnFinalGrade1='" + weightOfSemActivitiesOnFinalGrade1 + '\'' +
                ", weightOfSemActivitiesOnFinalGrade2='" + weightOfSemActivitiesOnFinalGrade2 + '\'' +
                ", weightOfEndOfSemActivitiesOnFinalGrade1='" + weightOfEndOfSemActivitiesOnFinalGrade1 + '\'' +
                ", weightOfEndOfSemActivitiesOnFinalGrade2='" + weightOfEndOfSemActivitiesOnFinalGrade2 + '\'' +
                ", endOfTab4Total1='" + endOfTab4Total1 + '\'' +
                ", endOfTab4Total2='" + endOfTab4Total2 + '\''+"\n" +
                ", courseHours='" + courseHours + '\'' +
                ", labOrApplicationHours='" + labOrApplicationHours + '\'' +
                ", studyHourseOutsideClass='" + studyHourseOutsideClass + '\'' +
                ", fieldWork='" + fieldWork + '\'' +
                ", quizOrStudioCritique='" + quizOrStudioCritique + '\'' +
                ", homeworkOrAssignment='" + homeworkOrAssignment + '\'' +
                ", presentationOrJury='" + presentationOrJury + '\'' +
                ", project='" + project + '\'' +
                ", portfolio='" + portfolio + '\'' +
                ", seminarOrWorkshop='" + seminarOrWorkshop + '\'' +
                ", oralExam='" + oralExam + '\'' +
                ", midterm='" + midterm + '\'' +
                ", Final='" + Final + '\'' +
                ", TotalWorkload='" + TotalWorkload + '\'' +
                ", courseHoursDur='" + courseHoursDur + '\'' +
                ", labOrApplicationHoursDur='" + labOrApplicationHoursDur + '\'' +
                ", studyHourseOutsideClassDur='" + studyHourseOutsideClassDur + '\'' +
                ", fieldWorkDur='" + fieldWorkDur + '\'' +
                ", quizOrStudioCritiqueDur='" + quizOrStudioCritiqueDur + '\'' +
                ", homeworkOrAssignmentDur='" + homeworkOrAssignmentDur + '\'' +
                ", presentationOrJuryDur='" + presentationOrJuryDur + '\'' +
                ", projectDur='" + projectDur + '\'' +
                ", portfolioDur='" + portfolioDur + '\'' +
                ", seminarOrWorkshopDur='" + seminarOrWorkshopDur + '\'' +
                ", oralExamDur='" + oralExamDur + '\'' +
                ", midtermDur='" + midtermDur + '\'' +
                ", FinalDur='" + FinalDur + '\'' +
                ", courseHoursWL='" + courseHoursWL + '\'' +
                ", labOrApplicationHourWL='" + labOrApplicationHourWL + '\'' +
                ", studyHourseOutsideClassWL='" + studyHourseOutsideClassWL + '\'' +
                ", fieldWorkWL='" + fieldWorkWL + '\'' +
                ", quizOrStudioCritiqueWL='" + quizOrStudioCritiqueWL + '\'' +
                ", homeworkOrAssignmentWL='" + homeworkOrAssignmentWL + '\'' +
                ", presentationOrJuryWL='" + presentationOrJuryWL + '\'' +
                ", projectWL='" + projectWL + '\'' +
                ", portfolioWL='" + portfolioWL + '\'' +
                ", seminarOrWorkshopWL='" + seminarOrWorkshopWL + '\'' +
                ", oralExamWL='" + oralExamWL + '\'' +
                ", midtermWL='" + midtermWL + '\'' +
                ", FinalWL='" + FinalWL + '\'' +
                ", TotalWorkloadWL='" + TotalWorkloadWL + '\''+"\n" +
                ", programCompetenciesOutcome1='" + programCompetenciesOutcome1 + '\'' +
                ", programCompetenciesOutcome1ContributionLevel1='" + programCompetenciesOutcome1ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome1ContributionLevel2='" + programCompetenciesOutcome1ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome1ContributionLevel3='" + programCompetenciesOutcome1ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome1ContributionLevel4='" + programCompetenciesOutcome1ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome1ContributionLevel5='" + programCompetenciesOutcome1ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome1LOno='" + programCompetenciesOutcome1LOno + '\'' +
                ", programCompetenciesOutcome2='" + programCompetenciesOutcome2 + '\'' +
                ", programCompetenciesOutcome2ContributionLevel1='" + programCompetenciesOutcome2ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome2ContributionLevel2='" + programCompetenciesOutcome2ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome2ContributionLevel3='" + programCompetenciesOutcome2ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome2ContributionLevel4='" + programCompetenciesOutcome2ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome2ContributionLevel5='" + programCompetenciesOutcome2ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome2LOno='" + programCompetenciesOutcome2LOno + '\'' +
                ", programCompetenciesOutcome3='" + programCompetenciesOutcome3 + '\'' +
                ", programCompetenciesOutcome3ContributionLevel1='" + programCompetenciesOutcome3ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome3ContributionLevel2='" + programCompetenciesOutcome3ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome3ContributionLevel3='" + programCompetenciesOutcome3ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome3ContributionLevel4='" + programCompetenciesOutcome3ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome3ContributionLevel5='" + programCompetenciesOutcome3ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome3LOno='" + programCompetenciesOutcome3LOno + '\'' +
                ", programCompetenciesOutcome4='" + programCompetenciesOutcome4 + '\'' +
                ", programCompetenciesOutcome4ContributionLevel1='" + programCompetenciesOutcome4ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome4ContributionLevel2='" + programCompetenciesOutcome4ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome4ContributionLevel3='" + programCompetenciesOutcome4ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome4ContributionLevel4='" + programCompetenciesOutcome4ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome4ContributionLevel5='" + programCompetenciesOutcome4ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome4LOno='" + programCompetenciesOutcome4LOno + '\'' +
                ", programCompetenciesOutcome5='" + programCompetenciesOutcome5 + '\'' +
                ", programCompetenciesOutcome5ContributionLevel1='" + programCompetenciesOutcome5ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome5ContributionLevel2='" + programCompetenciesOutcome5ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome5ContributionLevel3='" + programCompetenciesOutcome5ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome5ContributionLevel4='" + programCompetenciesOutcome5ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome5ContributionLevel5='" + programCompetenciesOutcome5ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome5LOno='" + programCompetenciesOutcome5LOno + '\'' +
                ", programCompetenciesOutcome6='" + programCompetenciesOutcome6 + '\'' +
                ", programCompetenciesOutcome6ContributionLevel1='" + programCompetenciesOutcome6ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome6ContributionLevel2='" + programCompetenciesOutcome6ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome6ContributionLevel3='" + programCompetenciesOutcome6ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome6ContributionLevel4='" + programCompetenciesOutcome6ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome6ContributionLevel5='" + programCompetenciesOutcome6ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome6LOno='" + programCompetenciesOutcome6LOno + '\'' +
                ", programCompetenciesOutcome7='" + programCompetenciesOutcome7 + '\'' +
                ", programCompetenciesOutcome7ContributionLevel1='" + programCompetenciesOutcome7ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome7ContributionLevel2='" + programCompetenciesOutcome7ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome7ContributionLevel3='" + programCompetenciesOutcome7ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome7ContributionLevel4='" + programCompetenciesOutcome7ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome7ContributionLevel5='" + programCompetenciesOutcome7ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome7LOno='" + programCompetenciesOutcome7LOno + '\'' +
                ", programCompetenciesOutcome8='" + programCompetenciesOutcome8 + '\'' +
                ", programCompetenciesOutcome8ContributionLevel1='" + programCompetenciesOutcome8ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome8ContributionLevel2='" + programCompetenciesOutcome8ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome8ContributionLevel3='" + programCompetenciesOutcome8ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome8ContributionLevel4='" + programCompetenciesOutcome8ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome8ContributionLevel5='" + programCompetenciesOutcome8ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome8LOno='" + programCompetenciesOutcome8LOno + '\'' +
                ", programCompetenciesOutcome9='" + programCompetenciesOutcome9 + '\'' +
                ", programCompetenciesOutcome9ContributionLevel1='" + programCompetenciesOutcome9ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome9ContributionLevel2='" + programCompetenciesOutcome9ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome9ContributionLevel3='" + programCompetenciesOutcome9ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome9ContributionLevel4='" + programCompetenciesOutcome9ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome9ContributionLevel5='" + programCompetenciesOutcome9ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome9LOno='" + programCompetenciesOutcome9LOno + '\'' +
                ", programCompetenciesOutcome10='" + programCompetenciesOutcome10 + '\'' +
                ", programCompetenciesOutcome10ContributionLevel1='" + programCompetenciesOutcome10ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome10ContributionLevel2='" + programCompetenciesOutcome10ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome10ContributionLevel3='" + programCompetenciesOutcome10ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome10ContributionLevel4='" + programCompetenciesOutcome10ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome10ContributionLevel5='" + programCompetenciesOutcome10ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome10LOno='" + programCompetenciesOutcome10LOno + '\'' +
                ", programCompetenciesOutcome11='" + programCompetenciesOutcome11 + '\'' +
                ", programCompetenciesOutcome11ContributionLevel1='" + programCompetenciesOutcome11ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome11ContributionLevel2='" + programCompetenciesOutcome11ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome11ContributionLevel3='" + programCompetenciesOutcome11ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome11ContributionLevel4='" + programCompetenciesOutcome11ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome11ContributionLevel5='" + programCompetenciesOutcome11ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome11LOno='" + programCompetenciesOutcome11LOno + '\'' +
                ", programCompetenciesOutcome12='" + programCompetenciesOutcome12 + '\'' +
                ", programCompetenciesOutcome12ContributionLevel1='" + programCompetenciesOutcome12ContributionLevel1 + '\'' +
                ", programCompetenciesOutcome12ContributionLevel2='" + programCompetenciesOutcome12ContributionLevel2 + '\'' +
                ", programCompetenciesOutcome12ContributionLevel3='" + programCompetenciesOutcome12ContributionLevel3 + '\'' +
                ", programCompetenciesOutcome12ContributionLevel4='" + programCompetenciesOutcome12ContributionLevel4 + '\'' +
                ", programCompetenciesOutcome12ContributionLevel5='" + programCompetenciesOutcome12ContributionLevel5 + '\'' +
                ", programCompetenciesOutcome12LOno='" + programCompetenciesOutcome12LOno + '\''+"\n" +
                ", reasonForUpdate='" + reasonForUpdate + '\'' +
                '}';
    }
}
