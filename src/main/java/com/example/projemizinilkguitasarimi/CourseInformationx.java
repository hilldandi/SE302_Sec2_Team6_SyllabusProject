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
}