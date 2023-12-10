package com.example.projemizinilkguitasarimi;

public class CourseInformationx {
	private String version;
    // The data on TAB1

    private String courseName;
    private String code;
    private String season;
    private String theory;
    private String lab;
    private String localCredits;
    private String ects;
    private String prerequisities;

    

    //the ones in tickbox
    private String courseLanguage;
    private String courseType;
    private String courseLevel;
    private String modeOfDelivery;
    //

    private String teachingMethodsAndTechniques;
    private String courseCoordinator;

    //this part will be editted
    private String courseLecturers[];
    private String courseAssistants[];

    //the data on TAB2

    private String courseObjectives;
    private String learningOutcomes;
    private String courseDescription;
    private String courseCategory; // <---tickbox

    //the data on TAB3
    private String weeklySubjectsAndRequiredMaterials;
    private String courseNotesAndTextBooks;
    private String suggestedReadingsAndMaterials;

    //the data on TAB4 Assessment
    private String weightOfParticipation;
    private String weightOfLabOrApplication;
    private String weightOfFieldWork;
    private String weightOfQuizOrStudioCritique;
    private String weightOfHwOrAssignment;
    private String weightOfPresentationOrJury;
    private String weightOfProject;
    private String weightOfSeminarOrWorkshop;
    private String weightOfOralExam;
    private String weightOfMidterm;
    private String weightOfFinalExam;
    private String TotalWeight;

    //the data on TAB5 ECTS / Workload Table
    private String courseHours;
    private String labOrApplicationHours;
    private String studyHourseOutsideClass;
    private String fieldWork;
    private String quizOrStudioCritique;
    private String homeworkOrAssignment;
    private String presentationOrJury;
    private String project;
    private String portfolio;
    private String seminarOrWorkshop;
    private String oralExam;
    private String midterm;
    private String Final;
    private String TotalWorkload;

    //the data on TAB6 Course outcome matrix
    private String week;
    private String programOutcomes;
    private String contributionLevel;
    private String LO;

    //the data on the SAVE TAB
    private String reasonForUpdate;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
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

    public String[] getCourseLecturers() {
        return courseLecturers;
    }

    public void setCourseLecturers(String[] courseLecturers) {
        this.courseLecturers = courseLecturers;
    }

    public String[] getCourseAssistants() {
        return courseAssistants;
    }

    public void setCourseAssistants(String[] courseAssistants) {
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

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public String getWeeklySubjectsAndRequiredMaterials() {
        return weeklySubjectsAndRequiredMaterials;
    }

    public void setWeeklySubjectsAndRequiredMaterials(String weeklySubjectsAndRequiredMaterials) {
        this.weeklySubjectsAndRequiredMaterials = weeklySubjectsAndRequiredMaterials;
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

    public String getTotalWeight() {
        return TotalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        TotalWeight = totalWeight;
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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getProgramOutcomes() {
        return programOutcomes;
    }

    public void setProgramOutcomes(String programOutcomes) {
        this.programOutcomes = programOutcomes;
    }

    public String getContributionLevel() {
        return contributionLevel;
    }

    public void setContributionLevel(String contributionLevel) {
        this.contributionLevel = contributionLevel;
    }

    public String getLO() {
        return LO;
    }

    public void setLO(String LO) {
        this.LO = LO;
    }

    public String getReasonForUpdate() {
        return reasonForUpdate;
    }

    public void setReasonForUpdate(String reasonForUpdate) {
        this.reasonForUpdate = reasonForUpdate;
    }

    public CourseInformationx(String version, String courseName, String code, String season, String theory, String lab, String localCredits, String ects, String prerequisities, String courseLanguage, String courseType, String courseLevel, String modeOfDelivery, String teachingMethodsAndTechniques, String courseCoordinator, String[] courseLecturers, String[] courseAssistants, String courseObjectives, String learningOutcomes, String courseDescription, String courseCategory, String weeklySubjectsAndRequiredMaterials, String courseNotesAndTextBooks, String suggestedReadingsAndMaterials, String weightOfParticipation, String weightOfLabOrApplication, String weightOfFieldWork, String weightOfQuizOrStudioCritique, String weightOfHwOrAssignment, String weightOfPresentationOrJury, String weightOfProject, String weightOfSeminarOrWorkshop, String weightOfOralExam, String weightOfMidterm, String weightOfFinalExam, String totalWeight, String courseHours, String labOrApplicationHours, String studyHourseOutsideClass, String fieldWork, String quizOrStudioCritique, String homeworkOrAssignment, String presentationOrJury, String project, String portfolio, String seminarOrWorkshop, String oralExam, String midterm, String aFinal, String totalWorkload, String week, String programOutcomes, String contributionLevel, String LO, String reasonForUpdate) {
        this.version = version;
        this.courseName = courseName;
        this.code = code;
        this.season = season;
        this.theory = theory;
        this.lab = lab;
        this.localCredits = localCredits;
        this.ects = ects;
        this.prerequisities = prerequisities;
        this.courseLanguage = courseLanguage;
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.modeOfDelivery = modeOfDelivery;
        this.teachingMethodsAndTechniques = teachingMethodsAndTechniques;
        this.courseCoordinator = courseCoordinator;
        this.courseLecturers = courseLecturers;
        this.courseAssistants = courseAssistants;
        this.courseObjectives = courseObjectives;
        this.learningOutcomes = learningOutcomes;
        this.courseDescription = courseDescription;
        this.courseCategory = courseCategory;
        this.weeklySubjectsAndRequiredMaterials = weeklySubjectsAndRequiredMaterials;
        this.courseNotesAndTextBooks = courseNotesAndTextBooks;
        this.suggestedReadingsAndMaterials = suggestedReadingsAndMaterials;
        this.weightOfParticipation = weightOfParticipation;
        this.weightOfLabOrApplication = weightOfLabOrApplication;
        this.weightOfFieldWork = weightOfFieldWork;
        this.weightOfQuizOrStudioCritique = weightOfQuizOrStudioCritique;
        this.weightOfHwOrAssignment = weightOfHwOrAssignment;
        this.weightOfPresentationOrJury = weightOfPresentationOrJury;
        this.weightOfProject = weightOfProject;
        this.weightOfSeminarOrWorkshop = weightOfSeminarOrWorkshop;
        this.weightOfOralExam = weightOfOralExam;
        this.weightOfMidterm = weightOfMidterm;
        this.weightOfFinalExam = weightOfFinalExam;
        TotalWeight = totalWeight;
        this.courseHours = courseHours;
        this.labOrApplicationHours = labOrApplicationHours;
        this.studyHourseOutsideClass = studyHourseOutsideClass;
        this.fieldWork = fieldWork;
        this.quizOrStudioCritique = quizOrStudioCritique;
        this.homeworkOrAssignment = homeworkOrAssignment;
        this.presentationOrJury = presentationOrJury;
        this.project = project;
        this.portfolio = portfolio;
        this.seminarOrWorkshop = seminarOrWorkshop;
        this.oralExam = oralExam;
        this.midterm = midterm;
        Final = aFinal;
        TotalWorkload = totalWorkload;
        this.week = week;
        this.programOutcomes = programOutcomes;
        this.contributionLevel = contributionLevel;
        this.LO = LO;
        this.reasonForUpdate = reasonForUpdate;
    }

    @Override
    public String toString() {
        return
                "version='" + version + '\'' +
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
                ", courseLecturers=" + java.util.Arrays.toString(courseLecturers) +
                ", courseAssistants=" + java.util.Arrays.toString(courseAssistants) +
                ", courseObjectives='" + courseObjectives + '\'' +
                ", learningOutcomes='" + learningOutcomes + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseCategory='" + courseCategory + '\'' +
                ", weeklySubjectsAndRequiredMaterials='" + weeklySubjectsAndRequiredMaterials + '\'' +
                ", courseNotesAndTextBooks='" + courseNotesAndTextBooks + '\'' +
                ", suggestedReadingsAndMaterials='" + suggestedReadingsAndMaterials + '\'' +
                ", weightOfParticipation='" + weightOfParticipation + '\'' +
                ", weightOfLabOrApplication='" + weightOfLabOrApplication + '\'' +
                ", weightOfFieldWork='" + weightOfFieldWork + '\'' +
                ", weightOfQuizOrStudioCritique='" + weightOfQuizOrStudioCritique + '\'' +
                ", weightOfHwOrAssignment='" + weightOfHwOrAssignment + '\'' +
                ", weightOfPresentationOrJury='" + weightOfPresentationOrJury + '\'' +
                ", weightOfProject='" + weightOfProject + '\'' +
                ", weightOfSeminarOrWorkshop='" + weightOfSeminarOrWorkshop + '\'' +
                ", weightOfOralExam='" + weightOfOralExam + '\'' +
                ", weightOfMidterm='" + weightOfMidterm + '\'' +
                ", weightOfFinalExam='" + weightOfFinalExam + '\'' +
                ", TotalWeight='" + TotalWeight + '\'' +
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
                ", week='" + week + '\'' +
                ", programOutcomes='" + programOutcomes + '\'' +
                ", contributionLevel='" + contributionLevel + '\'' +
                ", LO='" + LO + '\'' +
                ", reasonForUpdate='" + reasonForUpdate + '\'' +
                '}';
    }
}