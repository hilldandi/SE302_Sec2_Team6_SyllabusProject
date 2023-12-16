package com.example.projemizinilkguitasarimi;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainControllerX {

    public void switchToScene1(ActionEvent event ) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=((Stage) ( (Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene2(ActionEvent event ) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("start.fxml"));
        stage=((Stage) ( (Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /* they add i main
        public static void main(String[] args) {
        Gson gson = new Gson();

        // Add a new object with user input
        CourseInformationx updatedCourse = createNewCourse();
        String newJson = gson.toJson(updatedCourse);

        // Write the updated JSON to a new file
        String newFilePath = updatedCourse.getCode() + ".json";
        writeJsonToFile(newJson, newFilePath);

        // Read and print the updated JSON
        CourseInformationx updatedFromJson = readJsonFile(newFilePath);
        System.out.println("Updated data:\n" + updatedFromJson);
    }
     */
            //read ve write fonksiyonlarını koydum
    private static CourseInformationx readJsonFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            return new Gson().fromJson(fileReader, CourseInformationx.class);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating a new object.");
            return new CourseInformationx();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void writeJsonToFile(String json, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(json);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void CreateNewCourse()throws IOException {//Ezgi versiyon kontrolu için burayı doldur
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Version: ");
        String version = scanner.nextLine();

        // Create a new CourseInformationx object
        CourseInformationx newCourse = new CourseInformationx();
        newCourse.setCourseName(courseName);
        newCourse.setVersion(String.valueOf(version));

        // Populate other properties
        addNewCourse(newCourse);

        String code =codeTextt2.getText();
        CourseInformationx course=new CourseInformationx();
        fillCourse(course);
        String newJson = gson.toJson(course);
        String newFilePath = updatedCourse.getCourseName() +"-v"+ updatedCourse.getVersion() + ".json";

        //Create new directory according to course code
        File dir = new File("SE302_Sec2_Team6_SyllabusProject-course_information/"+code);
        dir.mkdirs();
        File file = new File(dir, newFilePath);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(newJson);
            System.out.println("JSON written to file successfully.");
        }
    @FXML
    public void fillCourse(CourseInformationx course) {
        //Tab1
        course.setCourseName(courseNameText2.getText());
        course.setCode(codeTextt2.getText());
        course.setSeason(seasontext.getText());
        course.setTheory(theoryText2.getText());
        course.setLab(applicationText2.getText());
        course.setLocalCredits(localCreditsText2.getText());
        course.setEcts(ectsText2.getText());
        course.setPrerequisities(prerequisitesText.getText());
        course.setCourseLanguage(CourseLanguageText.getText());
        course.setCourseType(CourseTypeText.getText());
        course.setCourseLevel(CourseLevelText.getText());
        course.setModeOfDelivery(ModeOfDeleveryText.getText());
        course.setTeachingMethodsAndTechniques(teachingMethodsText.getText());
        course.setCourseCoordinator(coursecoordinatorText.getText());
        course.setCourseLecturers(courselecturerText.getText());
        course.setCourseAssistants(assistantText.getText());
        //Tab2
        course.setCourseObjectives(courseobjectivesText.getText());
        course.setLearningOutcomes(learningoutcomesText.getText());
        course.setCourseDescription(coursedescriptionText.getText());
        course.setCCCoreCourse(coreCourseText.getText());
        course.setCCMajorAreaCourse(majorAreaCourseText.getText());
        course.setCCSupportiveCourse(supportiveCourseText.getText());
        course.setCCComAndManagementSkillsCourse(communicationandManagementSkillsCourseText.getText());
        course.setCCTransferableSkillCourse(transferableSkillCourseText.getText());
        //Tab3
        course.setWeek1Subjects(subject1.getText());
        course.setWeek1ReqMat(reqMaterial1.getText());
        course.setWeek2Subjects(subject11.getText());
        course.setWeek2ReqMat(reqMaterial11.getText());
        course.setWeek3Subjects(subject21.getText());
        course.setWeek3ReqMat(reqMaterial21.getText());
        course.setWeek4Subjects(subject31.getText());
        course.setWeek4ReqMat(reqMaterial31.getText());
        course.setWeek5Subjects(subject41.getText());
        course.setWeek5ReqMat(reqMaterial41.getText());
        course.setWeek6Subjects(subject51.getText());
        course.setWeek6ReqMat(reqMaterial51.getText());
        course.setWeek7Subjects(subject61.getText());
        course.setWeek7ReqMat(reqMaterial61.getText());
        course.setWeek8Subjects(subject71.getText());
        course.setWeek8ReqMat(reqMaterial71.getText());
        course.setWeek9Subjects(subject81.getText());
        course.setWeek9ReqMat(reqMaterial81.getText());
        course.setWeek10Subjects(subject91.getText());
        course.setWeek10ReqMat(reqMaterial91.getText());
        course.setWeek11Subjects(subject101.getText());
        course.setWeek11ReqMat(reqMaterial101.getText());
        course.setWeek12Subjects(subject111.getText());
        course.setWeek12ReqMat(reqMaterial111.getText());
        course.setWeek13Subjects(subject121.getText());
        course.setWeek13ReqMat(reqMaterial121.getText());
        course.setWeek14Subjects(subject131.getText());
        course.setWeek14ReqMat(reqMaterial131.getText());
        course.setWeek15Subjects(subject141.getText());
        course.setWeek15ReqMat(reqMaterial141.getText());
        course.setCourseNotesAndTextBooks(courseNotesText.getText());
        course.setSuggestedReadingsAndMaterials(suggestedReadingsText.getText());
        //Tab4
        course.setNoOfParticipation(participateNumText.getText());
        course.setWeightOfParticipation(participateWText.getText());
        course.setLO1OfParticipation(participateo1Text.getText());
        course.setLO2OfParticipation(participateo2Text.getText());
        course.setLO3OfParticipation(participateo3Text.getText());
        course.setLO4OfParticipation(participateo4Text.getText());
        course.setLO5OfParticipation(participateo5Text.getText());
        course.setLO6OfParticipation(participateo6Text.getText());
        course.setLO7OfParticipation(participateo7Text.getText());
        course.setNoOfLabOrApplication(labNumText.getText());
        course.setWeightOfLabOrApplication(labWText.getText());
        course.setLO1OfLabOrApplication(labo1Text.getText());
        course.setLO2OfLabOrApplication(labo2Text.getText());
        course.setLO3OfLabOrApplication(labo3Text.getText());
        course.setLO4OfLabOrApplication(labo4Text.getText());
        course.setLO5OfLabOrApplication(labo5Text.getText());
        course.setLO6OfLabOrApplication(labo6Text.getText());
        course.setLO7OfLabOrApplication(labo7Text.getText());
        course.setNoOfFieldWork(fieldNumText.getText());
        course.setWeightOfFieldWork(fieldWText.getText());
        course.setLO1OfFieldWork(fieldo1Text.getText());
        course.setLO2OfFieldWork(fieldo2Text.getText());
        course.setLO3OfLabOrApplication(fieldo3Text.getText());
        course.setLO4OfLabOrApplication(fieldo4Text.getText());
        course.setLO5OfLabOrApplication(fieldo3Text.getText());
        course.setLO6OfLabOrApplication(fieldo6Text.getText());
        course.setLO7OfLabOrApplication(fieldo7Text.getText());
        course.setNoOfQuizOrStudioCritique(quizNumText.getText());
        course.setWeightOfQuizOrStudioCritique(quizWText.getText());
        course.setLO1OfQuizOrStudioCritique(quizo1Text.getText());
        course.setLO2OfQuizOrStudioCritique(quizo2Text.getText());
        course.setLO3OfQuizOrStudioCritique(quizo3Text.getText());
        course.setLO4OfQuizOrStudioCritique(quizo4Text.getText());
        course.setLO5OfQuizOrStudioCritique(quizo5Text.getText());
        course.setLO6OfQuizOrStudioCritique(quizo6Text.getText());
        course.setLO7OfQuizOrStudioCritique(quiz7Text.getText());
        course.setNoOfHwOrAssignment(homeworkNumText.getText());
        course.setWeightOfHwOrAssignment(homeworkWText.getText());
        course.setLO1OfHwOrAssignment(homeworko1Text.getText());
        course.setLO2OfHwOrAssignment(homeworko2Text.getText());
        course.setLO3OfHwOrAssignment(homeworko3Text.getText());
        course.setLO4OfHwOrAssignment(homeworko4Text.getText());
        course.setLO5OfHwOrAssignment(homeworko5Text.getText());
        course.setLO6OfHwOrAssignment(homeworko6Text.getText());
        course.setLO7OfHwOrAssignment(homeworko7Text.getText());
        course.setNoOfPresentationOrJury(juryNumText.getText());
        course.setWeightOfPresentationOrJury(juryWText.getText());
        course.setLO1OfPresentationOrJury(juryo1Text.getText());
        course.setLO2OfPresentationOrJury(juryo2Text.getText());
        course.setLO3OfPresentationOrJury(juryo3Text.getText());
        course.setLO4OfPresentationOrJury(juryo4Text.getText());
        course.setLO5OfPresentationOrJury(juryo5Text.getText());
        course.setLO6OfPresentationOrJury(juryo6Text.getText());
        course.setLO7OfPresentationOrJury(juryo6Text.getText());
        course.setNoOfProject(ProjectNumText.getText());
        course.setWeightOfProject(projectWText.getText());
        course.setLO1OfProject(projecto1Text.getText());
        course.setLO2OfProject(projecto2Text.getText());
        course.setLO3OfProject(projecto3Text.getText());
        course.setLO4OfProject(projecto4Text.getText());
        course.setLO5OfProject(projecto5Text.getText());
        course.setLO6OfProject(projecto6Text.getText());
        course.setLO7OfProject(projecto7Text.getText());
        course.setNoOfSeminarOrWorkshop(seminarNumText.getText());
        course.setWeightOfSeminarOrWorkshop(seminarWText.getText());
        course.setLO1OfSeminarOrWorkshop(seminaro1Text.getText());
        course.setLO2OfSeminarOrWorkshop(seminaro2Text.getText());
        course.setLO3OfSeminarOrWorkshop(seminaro3Text.getText());
        course.setLO4OfSeminarOrWorkshop(seminaro4Text.getText());
        course.setLO5OfSeminarOrWorkshop(seminaro5Text.getText());
        course.setLO6OfSeminarOrWorkshop(seminaro6Text.getText());
        course.setLO7OfSeminarOrWorkshop(seminaro7Text.getText());
        course.setNoOfOralExam(oralNumText.getText());
        course.setWeightOfOralExam(oralWText.getText());
        course.setLO1OfOralExam(oralo1Text.getText());
        course.setLO2OfOralExam(oralo2Text.getText());
        course.setLO3OfOralExam(oralo3Text.getText());
        course.setLO4OfOralExam(oralo4Text.getText());
        course.setLO5OfOralExam(oralo5Text.getText());
        course.setLO6OfOralExam(oralo6Text.getText());
        course.setLO7OfOralExam(oralo7Text.getText());
        course.setNoOfMidterm(midtermNum.getText());
        course.setWeightOfMidterm(midtermW.getText());
        course.setLO1OfMidterm(midtermo1Text.getText());
        course.setLO2OfMidterm(midtermo2Text.getText());
        course.setLO3OfMidterm(midtermo3Text.getText());
        course.setLO4OfMidterm(midtermo4Text.getText());
        course.setLO5OfMidterm(midtermo5Text.getText());
        course.setLO6OfMidterm(midtermo6Text.getText());
        course.setLO7OfMidterm(midtermo7Text.getText());
        course.setNoOfFinalExam(finalNumText.getText());
        course.setWeightOfFinalExam(finalWText.getText());
        course.setLO1OfFinalExam(finalo1Text.getText());
        course.setLO2OfFinalExam(finalo2Text.getText());
        course.setLO3OfFinalExam(finalo3Text.getText());
        course.setLO4OfFinalExam(finalo4Text.getText());
        course.setLO5OfFinalExam(finalo5Text.getText());
        course.setLO6OfFinalExam(finalo6Text.getText());
        course.setLO7OfFinalExam(finalo7Text.getText());
        course.setNoOfTotalWeight(totalNumText.getText());
        course.setWeightOfTotalWeight(totalWWText.getText());
        course.setLO1OfTotalWeight(totalo1Text.getText());
        course.setLO2OfTotalWeight(totalo2Text.getText());
        course.setLO3OfTotalWeight(totalo3Text.getText());
        course.setLO4OfTotalWeight(totalo4Text.getText());
        course.setLO5OfTotalWeight(totalo5Text.getText());
        course.setLO6OfTotalWeight(totalo6Text.getText());
        course.setLO7OfTotalWeight(totalo7Text.getText());
        course.setWeightOfSemActivitiesOnFinalGrade1(finalgrade1.getText());
        course.setWeightOfSemActivitiesOnFinalGrade2(finalgrade2.getText());
        course.setWeightOfEndOfSemActivitiesOnFinalGrade1(finalEGrade1.getText());
        course.setWeightOfEndOfSemActivitiesOnFinalGrade2(finalEGrade2.getText());
        course.setEndOfTab4Total1(totalG1.getText());
        course.setEndOfTab4Total2(totalG2.getText());
        //Tab5
        course.setCourseHoursDur(cdText.getText());
        course.setCourseHoursWL(cwText.getText());
        course.setLabOrApplicationHoursDur(ldText.getText());
        course.setLabOrApplicationHourWL(lwText.getText());
        course.setStudyHourseOutsideClass(snText.getText());
        course.setStudyHourseOutsideClassDur(sdText.getText());
        course.setStudyHourseOutsideClassWL(swText.getText());
        course.setFieldWork(fnText.getText());
        course.setFieldWorkDur(fdText.getText());
        course.setFieldWorkWL(fwText.getText());
        course.setQuizOrStudioCritique(qnText1.getText());
        course.setQuizOrStudioCritiqueDur(qdText1.getText());
        course.setStudyHourseOutsideClassWL(qwText.getText());
        course.setHomeworkOrAssignment(hnText.getText());
        course.setHomeworkOrAssignmentDur(hdText.getText());
        course.setHomeworkOrAssignmentWL(hwText.getText());
        course.setPresentationOrJury(prnText.getText());
        course.setPresentationOrJuryDur(prdText.getText());
        course.setPresentationOrJuryWL(prwText.getText());
        course.setProject(pronText.getText());
        course.setProjectDur(prodText.getText());
        course.setProjectWL(prowText.getText());
        course.setPortfolio(portnText.getText());
        course.setPortfolioDur(portdText11.getText());
        course.setPortfolioWL(portwText11.getText());
        course.setSeminarOrWorkshop(semnText.getText());
        course.setSeminarOrWorkshopDur(semdText.getText());
        course.setSeminarOrWorkshopWL(semwText.getText());
        course.setOralExam(ornText.getText());
        course.setOralExamDur(ordText.getText());
        course.setOralExamWL(orwText.getText());
        course.setMidterm(midnText.getText());
        course.setMidtermDur(middText.getText());
        course.setMidtermWL(midwText.getText());
        course.setFinal(fnText.getText());
        course.setFinalDur(fdText.getText());
        course.setFinalWL(fwText.getText());
        course.setTotalWorkload(totalWWText.getText());
        //Tab6
        course.setProgramCompetenciesOutcome1(CoursePOMText1.getText());
        course.setProgramCompetenciesOutcome1ContributionLevel1(CoursePOMText11.getText());
        course.setProgramCompetenciesOutcome1ContributionLevel2(CoursePOMText12.getText());
        course.setProgramCompetenciesOutcome1ContributionLevel3(CoursePOMText13.getText());
        course.setProgramCompetenciesOutcome1ContributionLevel4(CoursePOMText14.getText());
        course.setProgramCompetenciesOutcome1ContributionLevel5(CoursePOMText15.getText());
        course.setProgramCompetenciesOutcome1LOno(CoursePOMText1LO.getText());
        course.setProgramCompetenciesOutcome2(CoursePOMText2.getText());
        course.setProgramCompetenciesOutcome2ContributionLevel1(CoursePOMText21.getText());
        course.setProgramCompetenciesOutcome2ContributionLevel2(CoursePOMText22.getText());
        course.setProgramCompetenciesOutcome2ContributionLevel3(CoursePOMText23.getText());
        course.setProgramCompetenciesOutcome2ContributionLevel4(CoursePOMText24.getText());
        course.setProgramCompetenciesOutcome2ContributionLevel5(CoursePOMText25.getText());
        course.setProgramCompetenciesOutcome2LOno(CoursePOMText2LO.getText());
        course.setProgramCompetenciesOutcome3(CoursePOMText3.getText());
        course.setProgramCompetenciesOutcome3ContributionLevel1(CoursePOMText31.getText());
        course.setProgramCompetenciesOutcome3ContributionLevel2(CoursePOMText32.getText());
        course.setProgramCompetenciesOutcome3ContributionLevel3(CoursePOMText33.getText());
        course.setProgramCompetenciesOutcome3ContributionLevel4(CoursePOMText34.getText());
        course.setProgramCompetenciesOutcome3ContributionLevel5(CoursePOMText35.getText());
        course.setProgramCompetenciesOutcome3LOno(CoursePOMText32LO.getText());
        course.setProgramCompetenciesOutcome4(CoursePOMText4.getText());
        course.setProgramCompetenciesOutcome4ContributionLevel1(CoursePOMText41.getText());
        course.setProgramCompetenciesOutcome4ContributionLevel2(CoursePOMText42.getText());
        course.setProgramCompetenciesOutcome4ContributionLevel3(CoursePOMText43.getText());
        course.setProgramCompetenciesOutcome4ContributionLevel4(CoursePOMText44.getText());
        course.setProgramCompetenciesOutcome4ContributionLevel5(CoursePOMText45.getText());
        course.setProgramCompetenciesOutcome4LOno(CoursePOMText4LO.getText());
        course.setProgramCompetenciesOutcome5(CoursePOMText5.getText());
        course.setProgramCompetenciesOutcome5ContributionLevel1(CoursePOMText51.getText());
        course.setProgramCompetenciesOutcome5ContributionLevel2(CoursePOMText52.getText());
        course.setProgramCompetenciesOutcome5ContributionLevel3(CoursePOMText53.getText());
        course.setProgramCompetenciesOutcome5ContributionLevel4(CoursePOMText54.getText());
        course.setProgramCompetenciesOutcome5ContributionLevel5(CoursePOMText55.getText());
        course.setProgramCompetenciesOutcome5LOno(CoursePOMText5LO.getText());
        course.setProgramCompetenciesOutcome6(CoursePOMText6.getText());
        course.setProgramCompetenciesOutcome6ContributionLevel1(CoursePOMText61.getText());
        course.setProgramCompetenciesOutcome6ContributionLevel2(CoursePOMText62.getText());
        course.setProgramCompetenciesOutcome6ContributionLevel3(CoursePOMText63.getText());
        course.setProgramCompetenciesOutcome6ContributionLevel4(CoursePOMText64.getText());
        course.setProgramCompetenciesOutcome6ContributionLevel5(CoursePOMText65.getText());
        course.setProgramCompetenciesOutcome6LOno(CoursePOMText6LO.getText());
        course.setProgramCompetenciesOutcome7(CoursePOMText7.getText());
        course.setProgramCompetenciesOutcome7ContributionLevel1(CoursePOMText71.getText());
        course.setProgramCompetenciesOutcome7ContributionLevel2(CoursePOMText72.getText());
        course.setProgramCompetenciesOutcome7ContributionLevel3(CoursePOMText73.getText());
        course.setProgramCompetenciesOutcome7ContributionLevel4(CoursePOMText74.getText());
        course.setProgramCompetenciesOutcome7ContributionLevel5(CoursePOMText75.getText());
        course.setProgramCompetenciesOutcome7LOno(CoursePOMText7LO.getText());
        course.setProgramCompetenciesOutcome8(CoursePOMText8.getText());
        course.setProgramCompetenciesOutcome8ContributionLevel1(CoursePOMText81.getText());
        course.setProgramCompetenciesOutcome8ContributionLevel2(CoursePOMText82.getText());
        course.setProgramCompetenciesOutcome8ContributionLevel3(CoursePOMText83.getText());
        course.setProgramCompetenciesOutcome8ContributionLevel4(CoursePOMText84.getText());
        course.setProgramCompetenciesOutcome8ContributionLevel5(CoursePOMText85.getText());
        course.setProgramCompetenciesOutcome8LOno(CoursePOMText8LO.getText());
        course.setProgramCompetenciesOutcome9(CoursePOMText9.getText());
        course.setProgramCompetenciesOutcome9ContributionLevel1(CoursePOMText91.getText());
        course.setProgramCompetenciesOutcome9ContributionLevel2(CoursePOMText92.getText());
        course.setProgramCompetenciesOutcome9ContributionLevel3(CoursePOMText93.getText());
        course.setProgramCompetenciesOutcome9ContributionLevel4(CoursePOMText94.getText());
        course.setProgramCompetenciesOutcome9ContributionLevel5(CoursePOMText95.getText());
        course.setProgramCompetenciesOutcome9LOno(CoursePOMText9LO.getText());
        course.setProgramCompetenciesOutcome10(CoursePOMText10.getText());
        course.setProgramCompetenciesOutcome10ContributionLevel1(CoursePOMText101.getText());
        course.setProgramCompetenciesOutcome10ContributionLevel2(CoursePOMText102.getText());
        course.setProgramCompetenciesOutcome10ContributionLevel3(CoursePOMText103.getText());
        course.setProgramCompetenciesOutcome10ContributionLevel4(CoursePOMText104.getText());
        course.setProgramCompetenciesOutcome10ContributionLevel5(CoursePOMText105.getText());
        course.setProgramCompetenciesOutcome10LOno(CoursePOMText10LO.getText());
        course.setProgramCompetenciesOutcome11(CoursePOMText11.getText());
        course.setProgramCompetenciesOutcome11ContributionLevel1(CoursePOMText111.getText());
        course.setProgramCompetenciesOutcome11ContributionLevel2(CoursePOMText112.getText());
        course.setProgramCompetenciesOutcome11ContributionLevel3(CoursePOMText113.getText());
        course.setProgramCompetenciesOutcome11ContributionLevel4(CoursePOMText114.getText());
        course.setProgramCompetenciesOutcome11ContributionLevel5(CoursePOMText115.getText());
        course.setProgramCompetenciesOutcome11LOno(CoursePOMText11LO.getText());
        course.setProgramCompetenciesOutcome12(CoursePOMText12.getText());
        course.setProgramCompetenciesOutcome12ContributionLevel1(CoursePOMText121.getText());
        course.setProgramCompetenciesOutcome12ContributionLevel2(CoursePOMText122.getText());
        course.setProgramCompetenciesOutcome12ContributionLevel3(CoursePOMText123.getText());
        course.setProgramCompetenciesOutcome12ContributionLevel4(CoursePOMText124.getText());
        course.setProgramCompetenciesOutcome12ContributionLevel5(CoursePOMText125.getText());
        course.setProgramCompetenciesOutcome12LOno(CoursePOMText12LO.getText());
        course.setProgramCompetenciesOutcome13(CoursePOMText13.getText());
        course.setProgramCompetenciesOutcome13ContributionLevel1(CoursePOMText131.getText());
        course.setProgramCompetenciesOutcome13ContributionLevel2(CoursePOMText132.getText());
        course.setProgramCompetenciesOutcome13ContributionLevel3(CoursePOMText133.getText());
        course.setProgramCompetenciesOutcome13ContributionLevel4(CoursePOMText134.getText());
        course.setProgramCompetenciesOutcome13ContributionLevel5(CoursePOMText135.getText());
        course.setProgramCompetenciesOutcome13LOno(CoursePOMText13LO.getText());
        //Tab save
        course.setReasonForUpdate(SaveAllText.getText());

    }






    @FXML
    private TextField CourseLanguageText;

    @FXML
    private TextField CourseLevelText;

    @FXML
    private TextArea CoursePOMText1;

    @FXML
    private TextArea CoursePOMText10;

    @FXML
    private TextField CoursePOMText101;

    @FXML
    private TextField CoursePOMText102;

    @FXML
    private TextField CoursePOMText103;

    @FXML
    private TextField CoursePOMText104;

    @FXML
    private TextField CoursePOMText105;

    @FXML
    private TextField CoursePOMText10LO;

    @FXML
    private TextField CoursePOMText11;

    @FXML
    private TextArea CoursePOMText110;

    @FXML
    private TextField CoursePOMText111;

    @FXML
    private TextField CoursePOMText112;

    @FXML
    private TextField CoursePOMText113;

    @FXML
    private TextField CoursePOMText114;

    @FXML
    private TextField CoursePOMText115;

    @FXML
    private TextField CoursePOMText11LO;

    @FXML
    private TextField CoursePOMText12;

    @FXML
    private TextArea CoursePOMText120;

    @FXML
    private TextField CoursePOMText121;

    @FXML
    private TextField CoursePOMText122;

    @FXML
    private TextField CoursePOMText123;

    @FXML
    private TextField CoursePOMText124;

    @FXML
    private TextField CoursePOMText125;

    @FXML
    private TextField CoursePOMText12LO;

    @FXML
    private TextField CoursePOMText13;

    @FXML
    private TextArea CoursePOMText130;

    @FXML
    private TextField CoursePOMText131;

    @FXML
    private TextField CoursePOMText132;

    @FXML
    private TextField CoursePOMText133;

    @FXML
    private TextField CoursePOMText134;

    @FXML
    private TextField CoursePOMText135;

    @FXML
    private TextField CoursePOMText13LO;

    @FXML
    private TextField CoursePOMText14;

    @FXML
    private TextField CoursePOMText15;

    @FXML
    private TextField CoursePOMText1LO;

    @FXML
    private TextArea CoursePOMText2;

    @FXML
    private TextField CoursePOMText21;

    @FXML
    private TextField CoursePOMText22;

    @FXML
    private TextField CoursePOMText23;

    @FXML
    private TextField CoursePOMText24;

    @FXML
    private TextField CoursePOMText25;

    @FXML
    private TextField CoursePOMText2LO;

    @FXML
    private TextArea CoursePOMText3;

    @FXML
    private TextField CoursePOMText31;

    @FXML
    private TextField CoursePOMText32;

    @FXML
    private TextField CoursePOMText32LO;

    @FXML
    private TextField CoursePOMText33;

    @FXML
    private TextField CoursePOMText34;

    @FXML
    private TextField CoursePOMText35;

    @FXML
    private TextArea CoursePOMText4;

    @FXML
    private TextField CoursePOMText41;

    @FXML
    private TextField CoursePOMText42;

    @FXML
    private TextField CoursePOMText43;

    @FXML
    private TextField CoursePOMText44;

    @FXML
    private TextField CoursePOMText45;

    @FXML
    private TextField CoursePOMText4LO;

    @FXML
    private TextArea CoursePOMText5;

    @FXML
    private TextField CoursePOMText51;

    @FXML
    private TextField CoursePOMText52;

    @FXML
    private TextField CoursePOMText53;

    @FXML
    private TextField CoursePOMText54;

    @FXML
    private TextField CoursePOMText55;

    @FXML
    private TextField CoursePOMText5LO;

    @FXML
    private TextArea CoursePOMText6;

    @FXML
    private TextField CoursePOMText61;

    @FXML
    private TextField CoursePOMText62;

    @FXML
    private TextField CoursePOMText63;

    @FXML
    private TextField CoursePOMText64;

    @FXML
    private TextField CoursePOMText65;

    @FXML
    private TextField CoursePOMText6LO;

    @FXML
    private TextArea CoursePOMText7;

    @FXML
    private TextField CoursePOMText71;

    @FXML
    private TextField CoursePOMText72;

    @FXML
    private TextField CoursePOMText73;

    @FXML
    private TextField CoursePOMText74;

    @FXML
    private TextField CoursePOMText75;

    @FXML
    private TextField CoursePOMText7LO;

    @FXML
    private TextArea CoursePOMText8;

    @FXML
    private TextField CoursePOMText81;

    @FXML
    private TextField CoursePOMText82;

    @FXML
    private TextField CoursePOMText83;

    @FXML
    private TextField CoursePOMText84;

    @FXML
    private TextField CoursePOMText85;

    @FXML
    private TextField CoursePOMText8LO;

    @FXML
    private TextArea CoursePOMText9;

    @FXML
    private TextField CoursePOMText91;

    @FXML
    private TextField CoursePOMText92;

    @FXML
    private TextField CoursePOMText93;

    @FXML
    private TextField CoursePOMText94;

    @FXML
    private TextField CoursePOMText95;

    @FXML
    private TextField CoursePOMText9LO;

    @FXML
    private TextField CourseTypeText;








    @FXML
    private TextField ModeOfDeleveryText;


    @FXML
    private TextArea ProjectNumText;

    @FXML
    private TextArea SaveAllText;





    @FXML
    private TextField applicationText2;



    @FXML
    private TextField assistantText;

    @FXML
    private TextField cdText;



    @FXML
    private TextField codeTextt2;


    @FXML
    private TextField communicationandManagementSkillsCourseText;


    @FXML
    private TextField coreCourseText;







    @FXML
    private TextField courseNameText2;


    @FXML
    private TextArea courseNotesText;




    @FXML
    private TextField coursecoordinatorText;


    @FXML
    private TextArea coursedescriptionText;


    @FXML
    private TextField courselecturerText;


    @FXML
    private TextArea courseobjectivesText;

    @FXML
    private TextField cwText;




    @FXML
    private TextField ectsText2;


    @FXML
    private Button engButton;


    @FXML
    private TextField exdText;

    @FXML
    private TextField exnText;

    @FXML
    private TextField exwText;

    @FXML
    private TextField fdText;


    @FXML
    private TextArea fieldNumText;


    @FXML
    private TextArea fieldWText;

    @FXML
    private TextArea fieldo1Text;

    @FXML
    private TextArea fieldo2Text;

    @FXML
    private TextArea fieldo3Text;

    @FXML
    private TextArea fieldo4Text;

    @FXML
    private TextArea fieldo5Text;

    @FXML
    private TextArea fieldo6Text;

    @FXML
    private TextArea fieldo7Text;

    @FXML
    private TextField finalEGrade1;

    @FXML
    private TextField finalEGrade2;



    @FXML
    private TextArea finalNumText;

    @FXML
    private TextArea finalWText;

    @FXML
    private TextField finalgrade1;

    @FXML
    private TextField finalgrade2;


    @FXML
    private TextArea finalo1Text;

    @FXML
    private TextArea finalo2Text;

    @FXML
    private TextArea finalo3Text;

    @FXML
    private TextArea finalo4Text;

    @FXML
    private TextArea finalo5Text;

    @FXML
    private TextArea finalo6Text;

    @FXML
    private TextArea finalo7Text;

    @FXML
    private TextField fnText;

    @FXML
    private TextField fwText;



    @FXML
    private TextField hdText;

    @FXML
    private TextField hnText;



    @FXML
    private TextArea homeworkNumText;



    @FXML
    private TextArea homeworkWText;

    @FXML
    private TextArea homeworko1Text;

    @FXML
    private TextArea homeworko2Text;

    @FXML
    private TextArea homeworko3Text;

    @FXML
    private TextArea homeworko4Text;

    @FXML
    private TextArea homeworko5Text;

    @FXML
    private TextArea homeworko6Text;

    @FXML
    private TextArea homeworko7Text;





    @FXML
    private TextField hwText;



    @FXML
    private TextArea juryNumText;

    @FXML
    private TextArea juryWText;

    @FXML
    private TextArea juryo1Text;

    @FXML
    private TextArea juryo2Text;

    @FXML
    private TextArea juryo3Text;

    @FXML
    private TextArea juryo4Text;

    @FXML
    private TextArea juryo5Text;

    @FXML
    private TextArea juryo6Text;

    @FXML
    private TextArea juryo7Text;




    @FXML
    private TextArea labNumText;


    @FXML
    private TextArea labWText;

    @FXML
    private TextArea labo1Text;

    @FXML
    private TextArea labo2Text;

    @FXML
    private TextArea labo3Text;

    @FXML
    private TextArea labo4Text;

    @FXML
    private TextArea labo5Text;

    @FXML
    private TextArea labo6Text;

    @FXML
    private TextArea labo7Text;

    @FXML
    private TextField ldText;


    @FXML
    private TextArea learningoutcomesText;




    @FXML
    private TextField localCreditsText2;

    @FXML
    private TextField lwText;


    @FXML
    private TextField majorAreaCourseText;



    @FXML
    private TextField middText;

    @FXML
    private TextField midnText;


    @FXML
    private TextArea midtermNum;

    @FXML
    private TextArea midtermW;

    @FXML
    private TextArea midtermo1Text;

    @FXML
    private TextArea midtermo2Text;

    @FXML
    private TextArea midtermo3Text;

    @FXML
    private TextArea midtermo4Text;

    @FXML
    private TextArea midtermo5Text;

    @FXML
    private TextArea midtermo6Text;

    @FXML
    private TextArea midtermo7Text;

    @FXML
    private TextField midwText;







    @FXML
    private TextArea oralNumText;


    @FXML
    private TextArea oralWText;

    @FXML
    private TextArea oralo1Text;

    @FXML
    private TextArea oralo2Text;

    @FXML
    private TextArea oralo3Text;

    @FXML
    private TextArea oralo4Text;

    @FXML
    private TextArea oralo5Text;

    @FXML
    private TextArea oralo6Text;

    @FXML
    private TextArea oralo7Text;

    @FXML
    private TextField ordText;

    @FXML
    private TextField ornText;

    @FXML
    private TextField orwText;


    @FXML
    private TextArea participateNumText;

    @FXML
    private TextArea participateWText;

    @FXML
    private TextArea participateo1Text;

    @FXML
    private TextArea participateo2Text;

    @FXML
    private TextArea participateo3Text;

    @FXML
    private TextArea participateo4Text;

    @FXML
    private TextArea participateo5Text;

    @FXML
    private TextArea participateo6Text;

    @FXML
    private TextArea participateo7Text;


    @FXML
    private TextField portdText11;

    @FXML
    private TextField portnText;

    @FXML
    private TextField portwText11;

    @FXML
    private TextField prdText;


    @FXML
    private TextField prerequisitesText;





    @FXML
    private TextField prnText;

    @FXML
    private TextField prodText;


    @FXML
    private TextArea projectWText;

    @FXML
    private TextArea projecto1Text;

    @FXML
    private TextArea projecto2Text;

    @FXML
    private TextArea projecto3Text;

    @FXML
    private TextArea projecto4Text;

    @FXML
    private TextArea projecto5Text;

    @FXML
    private TextArea projecto6Text;

    @FXML
    private TextArea projecto7Text;

    @FXML
    private TextField pronText;

    @FXML
    private TextField prowText;

    @FXML
    private TextField prwText;

    @FXML
    private TextField qdText1;

    @FXML
    private TextField qnText1;

    @FXML
    private TextArea quiz7Text;


    @FXML
    private TextArea quizNumText;


    @FXML
    private TextArea quizWText;

    @FXML
    private TextArea quizo1Text;

    @FXML
    private TextArea quizo2Text;

    @FXML
    private TextArea quizo3Text;

    @FXML
    private TextArea quizo4Text;

    @FXML
    private TextArea quizo5Text;

    @FXML
    private TextArea quizo6Text;

    @FXML
    private TextField qwText;

    @FXML
    private TextArea reqMaterial1;

    @FXML
    private TextArea reqMaterial101;

    @FXML
    private TextArea reqMaterial11;

    @FXML
    private TextArea reqMaterial111;

    @FXML
    private TextArea reqMaterial121;

    @FXML
    private TextArea reqMaterial131;

    @FXML
    private TextArea reqMaterial141;

    @FXML
    private TextArea reqMaterial21;

    @FXML
    private TextArea reqMaterial31;

    @FXML
    private TextArea reqMaterial41;

    @FXML
    private TextArea reqMaterial51;

    @FXML
    private TextArea reqMaterial61;

    @FXML
    private TextArea reqMaterial71;

    @FXML
    private TextArea reqMaterial81;

    @FXML
    private TextArea reqMaterial91;

    @FXML
    private TextField sdText;


    @FXML
    private TextField seasontext;

    @FXML
    private TextField semdText;




    @FXML
    private TextArea seminarNumText;


    @FXML
    private TextArea seminarWText;

    @FXML
    private TextArea seminaro1Text;

    @FXML
    private TextArea seminaro2Text;

    @FXML
    private TextArea seminaro3Text;

    @FXML
    private TextArea seminaro4Text;

    @FXML
    private TextArea seminaro5Text;

    @FXML
    private TextArea seminaro6Text;

    @FXML
    private TextArea seminaro7Text;

    @FXML
    private TextField semnText;

    @FXML
    private TextField semwText;

    @FXML
    private TextField snText;


    @FXML
    private TextArea subject1;

    @FXML
    private TextArea subject101;

    @FXML
    private TextArea subject11;

    @FXML
    private TextArea subject111;

    @FXML
    private TextArea subject121;

    @FXML
    private TextArea subject131;

    @FXML
    private TextArea subject141;

    @FXML
    private TextArea subject21;

    @FXML
    private TextArea subject31;

    @FXML
    private TextArea subject41;

    @FXML
    private TextArea subject51;

    @FXML
    private TextArea subject61;

    @FXML
    private TextArea subject71;

    @FXML
    private TextArea subject81;

    @FXML
    private TextArea subject91;


    @FXML
    private TextArea suggestedReadingsText;


    @FXML
    private TextField supportiveCourseText;

    @FXML
    private TextField swText;


    @FXML
    private TextArea teachingMethodsText;



    @FXML
    private TextField theoryText2;

    @FXML
    private TextField totalG1;

    @FXML
    private TextField totalG2;



    @FXML
    private TextArea totalNumText;


    @FXML
    private TextArea totalWWText;

    @FXML
    private TextField totallWText;

    @FXML
    private TextArea totalo1Text;

    @FXML
    private TextArea totalo2Text;

    @FXML
    private TextArea totalo3Text;

    @FXML
    private TextArea totalo4Text;

    @FXML
    private TextArea totalo5Text;

    @FXML
    private TextArea totalo6Text;

    @FXML
    private TextArea totalo7Text;

    @FXML
    private Button trButton;


    @FXML
    private TextField transferableSkillCourseText;







}


