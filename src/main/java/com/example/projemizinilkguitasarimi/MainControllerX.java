package com.example.projemizinilkguitasarimi;

import com.google.gson.Gson;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.*;
import java.net.URL;
import java.util.*;



public class MainControllerX {

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

    @FXML
    private Button OldVerMainButton;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("old,.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CompareSection.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void open(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        String selectedItem=ListView.getSelectionModel().getSelectedItem();
        String [] lookforlecture=new String[0];
        String selectedkey;
        if (comboBox.getValue()==null){
            lookforlecture=selectedItem.split("-");
            selectedkey=lookforlecture[0];

        }
        else {
            selectedkey=comboBox.getValue();
        }

        String path="Document/";
        String combinedPath=path+selectedkey+"/"+selectedItem;
        CourseInformationx course=readJsonFile(combinedPath);
        MainControllerX mainController = fxmlLoader.getController();
        //TAB1
        mainController.courseNameText2.setText(course.getCourseName());
        mainController.codeTextt2.setText(course.getCode());
        mainController.seasontext.setText(course.getSeason());
        mainController.theoryText2.setText(course.getTheory());
        mainController.applicationText2.setText(course.getLab());
        mainController.localCreditsText2.setText(course.getLocalCredits());
        mainController.ectsText2.setText(course.getEcts());
        mainController.prerequisitesText.setText(course.getPrerequisities());
        mainController.CourseLanguageText.setText(course.getCourseLanguage());
        mainController.CourseTypeText.setText(course.getCourseType());
        mainController.CourseLevelText.setText(course.getCourseLevel());
        mainController.ModeOfDeleveryText.setText(course.getModeOfDelivery());
        mainController.teachingMethodsText.setText(course.getTeachingMethodsAndTechniques());
        mainController.coursecoordinatorText.setText(course.getCourseCoordinator());
        mainController.courselecturerText.setText(course.getCourseLecturers());
        mainController.assistantText.setText(course.getCourseAssistants());
        //Tab2
        mainController.courseobjectivesText.setText(course.getCourseObjectives());
        mainController.learningoutcomesText.setText(course.getLearningOutcomes());
        mainController.coursedescriptionText.setText(course.getCourseDescription());
        mainController.coreCourseText.setText(course.getCCCoreCourse());
        mainController.majorAreaCourseText.setText(course.getCCMajorAreaCourse());
        mainController.supportiveCourseText.setText(course.getCCSupportiveCourse());
        mainController.communicationandManagementSkillsCourseText.setText(course.getCCComAndManagementSkillsCourse());
        mainController.transferableSkillCourseText.setText(course.getCCTransferableSkillCourse());

        //Tab3
        mainController.subject1.setText(course.getWeek1Subjects());
        mainController.reqMaterial1.setText(course.getWeek1ReqMat());
        mainController.subject11.setText(course.getWeek2Subjects());
        mainController.reqMaterial11.setText(course.getWeek2ReqMat());
        mainController.subject21.setText(course.getWeek3Subjects());
        mainController.reqMaterial21.setText(course.getWeek3ReqMat());
        mainController.subject31.setText(course.getWeek4Subjects());
        mainController.reqMaterial31.setText(course.getWeek4ReqMat());
        mainController.subject41.setText(course.getWeek5Subjects());
        mainController.reqMaterial41.setText(course.getWeek5ReqMat());
        mainController.subject51.setText(course.getWeek6Subjects());
        mainController.reqMaterial51.setText(course.getWeek6ReqMat());
        mainController.subject71.setText(course.getWeek8Subjects());
        mainController.reqMaterial71.setText(course.getWeek8ReqMat());
        mainController.subject81.setText(course.getWeek9Subjects());
        mainController.reqMaterial81.setText(course.getWeek9ReqMat());
        mainController.subject91.setText(course.getWeek10Subjects());
        mainController.reqMaterial91.setText(course.getWeek10ReqMat());
        mainController.subject101.setText(course.getWeek11Subjects());
        mainController.reqMaterial101.setText(course.getWeek11ReqMat());
        mainController.subject111.setText(course.getWeek12Subjects());
        mainController.reqMaterial111.setText(course.getWeek12ReqMat());
        mainController.subject121.setText(course.getWeek13Subjects());
        mainController.reqMaterial121.setText(course.getWeek13ReqMat());
        mainController.subject131.setText(course.getWeek14Subjects());
        mainController.reqMaterial131.setText(course.getWeek14ReqMat());
        mainController.subject141.setText(course.getWeek15Subjects());
        mainController.reqMaterial141.setText(course.getWeek15ReqMat());
        mainController.courseNotesText.setText(course.getCourseNotesAndTextBooks());
        mainController.suggestedReadingsText.setText(course.getSuggestedReadingsAndMaterials());

        //Tab4
        mainController.participateNumText.setText(course.getNoOfParticipation());
        mainController.participateWText.setText(course.getWeightOfParticipation());
        mainController.participateo1Text.setText(course.getLO1OfParticipation());
        mainController.participateo2Text.setText(course.getLO2OfParticipation());
        mainController.participateo3Text.setText(course.getLO3OfParticipation());
        mainController.participateo4Text.setText(course.getLO4OfParticipation());
        mainController.participateo5Text.setText(course.getLO5OfParticipation());
        mainController.participateo6Text.setText(course.getLO6OfParticipation());
        mainController.participateo7Text.setText(course.getLO7OfParticipation());
        mainController.labNumText.setText(course.getNoOfLabOrApplication());
        mainController.labWText.setText(course.getWeightOfLabOrApplication());
        mainController.labo1Text.setText(course.getLO1OfLabOrApplication());
        mainController.labo2Text.setText(course.getLO2OfLabOrApplication());
        mainController.labo3Text.setText(course.getLO3OfLabOrApplication());
        mainController.labo4Text.setText(course.getLO4OfLabOrApplication());
        mainController.labo5Text.setText(course.getLO5OfLabOrApplication());
        mainController.labo6Text.setText(course.getLO6OfLabOrApplication());
        mainController.labo7Text.setText(course.getLO7OfLabOrApplication());
        mainController.fieldNumText.setText(course.getNoOfFieldWork());
        mainController.fieldWText.setText(course.getWeightOfFieldWork());
        mainController.fieldo1Text.setText(course.getLO1OfFieldWork());
        mainController.fieldo2Text.setText(course.getLO2OfFieldWork());
        mainController.fieldo3Text.setText(course.getLO3OfFieldWork());
        mainController.fieldo4Text.setText(course.getLO4OfFieldWork());
        mainController.fieldo5Text.setText(course.getLO5OfFieldWork());
        mainController.fieldo6Text.setText(course.getLO6OfFieldWork());
        mainController.fieldo7Text.setText(course.getLO7OfFieldWork());
        mainController.quizNumText.setText(course.getNoOfQuizOrStudioCritique());
        mainController.quizWText.setText(course.getWeightOfQuizOrStudioCritique());
        mainController.quizo1Text.setText(course.getLO1OfQuizOrStudioCritique());
        mainController.quizo2Text.setText(course.getLO2OfQuizOrStudioCritique());
        mainController.quizo3Text.setText(course.getLO3OfQuizOrStudioCritique());
        mainController.quizo4Text.setText(course.getLO4OfQuizOrStudioCritique());
        mainController.quizo5Text.setText(course.getLO5OfQuizOrStudioCritique());
        mainController.quizo6Text.setText(course.getLO6OfQuizOrStudioCritique());
        mainController.quiz7Text.setText(course.getLO7OfQuizOrStudioCritique());
        mainController.homeworkNumText.setText(course.getNoOfHwOrAssignment());
        mainController.homeworkWText.setText(course.getWeightOfHwOrAssignment());
        mainController.homeworko1Text.setText(course.getLO1OfHwOrAssignment());
        mainController.homeworko2Text.setText(course.getLO2OfHwOrAssignment());
        mainController.homeworko3Text.setText(course.getLO3OfHwOrAssignment());
        mainController.homeworko4Text.setText(course.getLO4OfHwOrAssignment());
        mainController.homeworko5Text.setText(course.getLO5OfHwOrAssignment());
        mainController.homeworko6Text.setText(course.getLO6OfHwOrAssignment());
        mainController.homeworko7Text.setText(course.getLO7OfHwOrAssignment());
        mainController.juryNumText.setText(course.getNoOfPresentationOrJury());
        mainController.juryWText.setText(course.getWeightOfPresentationOrJury());
        mainController.juryo1Text.setText(course.getLO1OfPresentationOrJury());
        mainController.juryo2Text.setText(course.getLO2OfPresentationOrJury());
        mainController.juryo3Text.setText(course.getLO3OfPresentationOrJury());
        mainController.juryo4Text.setText(course.getLO4OfPresentationOrJury());
        mainController.juryo5Text.setText(course.getLO5OfPresentationOrJury());
        mainController.juryo6Text.setText(course.getLO6OfPresentationOrJury());
        mainController.juryo7Text.setText(course.getLO7OfPresentationOrJury());
        mainController.ProjectNumText.setText(course.getNoOfProject());
        mainController.ProjectNumText.setText(course.getNoOfProject());
        mainController.projectWText.setText(course.getWeightOfProject());
        mainController.projecto1Text.setText(course.getLO1OfProject());
        mainController.projecto2Text.setText(course.getLO2OfProject());
        mainController.projecto3Text.setText(course.getLO3OfProject());
        mainController.projecto4Text.setText(course.getLO4OfProject());
        mainController.projecto5Text.setText(course.getLO5OfProject());
        mainController.projecto6Text.setText(course.getLO6OfProject());
        mainController.projecto7Text.setText(course.getLO7OfProject());
        mainController.porfolioNumText.setText(course.getNoOfPortfolio());
        mainController.portfolioWText.setText(course.getWeightOfPortfolio());
        mainController.portfolioO1Text.setText(course.getL01OfPortfolio());
        mainController.portfolioO2Tex.setText(course.getL02OfPortfolio());
        mainController.portfolioO3Text.setText(course.getL03OfPortfolio());
        mainController.portfolioO4Text.setText(course.getL04OfPortfolio());
        mainController.portfolioO5Text.setText(course.getL05OfPortfolio());
        mainController.portfolioO6Text.setText(course.getL06OfPortfolio());
        mainController.portfolioO7Text.setText(course.getL07OfPortfolio());
        mainController.seminarNumText.setText(course.getNoOfSeminarOrWorkshop());
        mainController.seminarWText.setText(course.getWeightOfSeminarOrWorkshop());
        mainController.seminaro1Text.setText(course.getLO1OfSeminarOrWorkshop());
        mainController.seminaro2Text.setText(course.getLO2OfSeminarOrWorkshop());
        mainController.seminaro3Text.setText(course.getLO3OfSeminarOrWorkshop());
        mainController.seminaro4Text.setText(course.getLO4OfSeminarOrWorkshop());
        mainController.seminaro5Text.setText(course.getLO5OfSeminarOrWorkshop());
        mainController.seminaro6Text.setText(course.getLO6OfSeminarOrWorkshop());
        mainController.seminaro7Text.setText(course.getLO7OfSeminarOrWorkshop());
        mainController.oralNumText.setText(course.getNoOfOralExam());
        mainController.oralWText.setText(course.getWeightOfOralExam());
        mainController.oralo1Text.setText(course.getLO1OfOralExam());
        mainController.oralo2Text.setText(course.getLO2OfOralExam());
        mainController.oralo3Text.setText(course.getLO3OfOralExam());
        mainController.oralo4Text.setText(course.getLO4OfOralExam());
        mainController.oralo5Text.setText(course.getLO5OfOralExam());
        mainController.oralo6Text.setText(course.getLO6OfOralExam());
        mainController.oralo7Text.setText(course.getLO7OfOralExam());
        mainController.midtermNum.setText(course.getNoOfMidterm());
        mainController.midtermW.setText(course.getWeightOfMidterm());
        mainController.midtermo1Text.setText(course.getLO1OfMidterm());
        mainController.midtermo2Text.setText(course.getLO2OfMidterm());
        mainController.midtermo3Text.setText(course.getLO3OfMidterm());
        mainController.midtermo4Text.setText(course.getLO4OfMidterm());
        mainController.midtermo5Text.setText(course.getLO5OfMidterm());
        mainController.midtermo6Text.setText(course.getLO6OfMidterm());
        mainController.midtermo7Text.setText(course.getLO7OfMidterm());
        mainController.finalNumText.setText(course.getNoOfFinalExam());
        mainController.finalWText.setText(course.getWeightOfFinalExam());
        mainController.finalo1Text.setText(course.getLO1OfFinalExam());
        mainController.finalo2Text.setText(course.getLO2OfFinalExam());
        mainController.finalo3Text.setText(course.getLO3OfFinalExam());
        mainController.finalo4Text.setText(course.getLO4OfFinalExam());
        mainController.finalo5Text.setText(course.getLO5OfFinalExam());
        mainController.finalo6Text.setText(course.getLO6OfFinalExam());
        mainController.finalo7Text.setText(course.getLO7OfFinalExam());
        mainController.totalNumText.setText(course.getNoOfTotalWeight());
        mainController.totalWWText.setText(course.getWeightOfTotalWeight());
        mainController.totalo1Text.setText(course.getLO1OfTotalWeight());
        mainController.totalo2Text.setText(course.getLO2OfTotalWeight());
        mainController.totalo3Text.setText(course.getLO3OfTotalWeight());
        mainController.totalo4Text.setText(course.getLO4OfTotalWeight());
        mainController.totalo5Text.setText(course.getLO5OfTotalWeight());
        mainController.totalo6Text.setText(course.getLO6OfTotalWeight());
        mainController.totalo7Text.setText(course.getLO7OfTotalWeight());
        mainController.finalgrade1.setText(course.getWeightOfSemActivitiesOnFinalGrade1());
        mainController.finalgrade2.setText(course.getWeightOfSemActivitiesOnFinalGrade2());
        mainController.finalEGrade1.setText(course.getWeightOfEndOfSemActivitiesOnFinalGrade1());
        mainController.finalEGrade2.setText(course.getWeightOfEndOfSemActivitiesOnFinalGrade2());
        mainController.totalG1.setText(course.getEndOfTab4Total1());
        mainController.totalG2.setText(course.getEndOfTab4Total2());
        // TAB5
        mainController.cdNumText.setText(course.getCourseHours());
        mainController.cdText.setText(course.getCourseHoursDur());
        mainController.cwText.setText(course.getCourseHoursWL());
        mainController.lNumText.setText(course.getLabOrApplicationHours());
        mainController.ldText.setText(course.getLabOrApplicationHoursDur());
        mainController.lwText.setText(course.getLabOrApplicationHourWL());
        mainController.snText.setText(course.getStudyHourseOutsideClass());
        mainController.sdText.setText(course.getStudyHourseOutsideClassDur());
        mainController.swText.setText(course.getStudyHourseOutsideClassWL());
        mainController.fnText.setText(course.getFieldWork());
        mainController.fdText.setText(course.getFieldWorkDur());
        mainController.fwText.setText(course.getFieldWorkWL());
        mainController.qnText1.setText(course.getQuizOrStudioCritique());
        mainController.qdText1.setText(course.getQuizOrStudioCritiqueDur());
        mainController.qwText.setText(course.getStudyHourseOutsideClassWL());
        mainController.hnText.setText(course.getHomeworkOrAssignment());
        mainController.hdText.setText(course.getHomeworkOrAssignmentDur());
        mainController.hwText.setText(course.getHomeworkOrAssignmentWL());
        mainController.prnText.setText(course.getPresentationOrJury());
        mainController.prdText.setText(course.getPresentationOrJuryDur());
        mainController.prwText.setText(course.getPresentationOrJuryWL());
        mainController.pronText.setText(course.getProject());
        mainController.prodText.setText(course.getProjectDur());
        mainController.prowText.setText(course.getProjectWL());
        mainController.portnText.setText(course.getPortfolio());
        mainController.portdText11.setText(course.getPortfolioDur());
        mainController.portwText11.setText(course.getPortfolioWL());
        mainController.semnText.setText(course.getSeminarOrWorkshop());
        mainController.semdText.setText(course.getSeminarOrWorkshopDur());
        mainController.semwText.setText(course.getSeminarOrWorkshopWL());
        mainController.ornText.setText(course.getOralExam());
        mainController.ordText.setText(course.getOralExamDur());
        mainController.orwText.setText(course.getOralExamWL());
        mainController.midnText.setText(course.getMidterm());
        mainController.middText.setText(course.getMidtermDur());
        mainController.midwText.setText(course.getMidtermWL());
        mainController.fnText.setText(course.getFinal());
        mainController.fdText.setText(course.getFinalDur());
        mainController.fwText.setText(course.getFinalWL());
        mainController.totalWWText.setText(course.getTotalWorkload());
        //Tab6
        mainController.CoursePOMText1.setText(course.getProgramCompetenciesOutcome1());
        mainController.CoursePOMText11.setText(course.getProgramCompetenciesOutcome1ContributionLevel1());
        mainController.CoursePOMText12.setText(course.getProgramCompetenciesOutcome1ContributionLevel2());
        mainController.CoursePOMText13.setText(course.getProgramCompetenciesOutcome1ContributionLevel3());
        mainController.CoursePOMText14.setText(course.getProgramCompetenciesOutcome1ContributionLevel4());
        mainController.CoursePOMText15.setText(course.getProgramCompetenciesOutcome1ContributionLevel5());
        mainController.CoursePOMText1LO.setText(course.getProgramCompetenciesOutcome1LOno());
        mainController.CoursePOMText2.setText(course.getProgramCompetenciesOutcome2());
        mainController.CoursePOMText21.setText(course.getProgramCompetenciesOutcome2ContributionLevel1());
        mainController.CoursePOMText22.setText(course.getProgramCompetenciesOutcome2ContributionLevel2());
        mainController.CoursePOMText23.setText(course.getProgramCompetenciesOutcome2ContributionLevel3());
        mainController.CoursePOMText24.setText(course.getProgramCompetenciesOutcome2ContributionLevel4());
        mainController.CoursePOMText25.setText(course.getProgramCompetenciesOutcome2ContributionLevel5());
        mainController.CoursePOMText2LO.setText(course.getProgramCompetenciesOutcome2LOno());
        mainController.CoursePOMText3.setText(course.getProgramCompetenciesOutcome3());
        mainController.CoursePOMText31.setText(course.getProgramCompetenciesOutcome3ContributionLevel1());
        mainController.CoursePOMText32.setText(course.getProgramCompetenciesOutcome3ContributionLevel2());
        mainController.CoursePOMText33.setText(course.getProgramCompetenciesOutcome3ContributionLevel3());
        mainController.CoursePOMText34.setText(course.getProgramCompetenciesOutcome3ContributionLevel4());
        mainController.CoursePOMText35.setText(course.getProgramCompetenciesOutcome3ContributionLevel5());
        mainController.CoursePOMText32LO.setText(course.getProgramCompetenciesOutcome3LOno());
        mainController.CoursePOMText4.setText(course.getProgramCompetenciesOutcome4());
        mainController.CoursePOMText41.setText(course.getProgramCompetenciesOutcome4ContributionLevel1());
        mainController.CoursePOMText42.setText(course.getProgramCompetenciesOutcome4ContributionLevel2());
        mainController.CoursePOMText43.setText(course.getProgramCompetenciesOutcome4ContributionLevel3());
        mainController.CoursePOMText44.setText(course.getProgramCompetenciesOutcome4ContributionLevel4());
        mainController.CoursePOMText45.setText(course.getProgramCompetenciesOutcome4ContributionLevel5());
        mainController.CoursePOMText4LO.setText(course.getProgramCompetenciesOutcome4LOno());
        mainController.CoursePOMText5.setText(course.getProgramCompetenciesOutcome5());
        mainController.CoursePOMText51.setText(course.getProgramCompetenciesOutcome5ContributionLevel1());
        mainController.CoursePOMText52.setText(course.getProgramCompetenciesOutcome5ContributionLevel2());
        mainController.CoursePOMText53.setText(course.getProgramCompetenciesOutcome5ContributionLevel3());
        mainController.CoursePOMText54.setText(course.getProgramCompetenciesOutcome5ContributionLevel4());
        mainController.CoursePOMText55.setText(course.getProgramCompetenciesOutcome5ContributionLevel5());
        mainController.CoursePOMText5LO.setText(course.getProgramCompetenciesOutcome5LOno());
        mainController.CoursePOMText6.setText(course.getProgramCompetenciesOutcome6());
        mainController.CoursePOMText61.setText(course.getProgramCompetenciesOutcome6ContributionLevel1());
        mainController.CoursePOMText62.setText(course.getProgramCompetenciesOutcome6ContributionLevel2());
        mainController.CoursePOMText63.setText(course.getProgramCompetenciesOutcome6ContributionLevel3());
        mainController.CoursePOMText64.setText(course.getProgramCompetenciesOutcome6ContributionLevel4());
        mainController.CoursePOMText65.setText(course.getProgramCompetenciesOutcome6ContributionLevel5());
        mainController.CoursePOMText6LO.setText(course.getProgramCompetenciesOutcome6LOno());
        mainController.CoursePOMText7.setText(course.getProgramCompetenciesOutcome7());
        mainController.CoursePOMText71.setText(course.getProgramCompetenciesOutcome7ContributionLevel1());
        mainController.CoursePOMText72.setText(course.getProgramCompetenciesOutcome7ContributionLevel2());
        mainController.CoursePOMText73.setText(course.getProgramCompetenciesOutcome7ContributionLevel3());
        mainController.CoursePOMText74.setText(course.getProgramCompetenciesOutcome7ContributionLevel4());
        mainController.CoursePOMText75.setText(course.getProgramCompetenciesOutcome7ContributionLevel5());
        mainController.CoursePOMText7LO.setText(course.getProgramCompetenciesOutcome7LOno());
        mainController.CoursePOMText8.setText(course.getProgramCompetenciesOutcome8());
        mainController.CoursePOMText81.setText(course.getProgramCompetenciesOutcome8ContributionLevel1());
        mainController.CoursePOMText82.setText(course.getProgramCompetenciesOutcome8ContributionLevel2());
        mainController.CoursePOMText83.setText(course.getProgramCompetenciesOutcome8ContributionLevel3());
        mainController.CoursePOMText84.setText(course.getProgramCompetenciesOutcome8ContributionLevel4());
        mainController.CoursePOMText85.setText(course.getProgramCompetenciesOutcome8ContributionLevel5());
        mainController.CoursePOMText8LO.setText(course.getProgramCompetenciesOutcome8LOno());
        mainController.CoursePOMText9.setText(course.getProgramCompetenciesOutcome9());
        mainController.CoursePOMText91.setText(course.getProgramCompetenciesOutcome9ContributionLevel1());
        mainController.CoursePOMText92.setText(course.getProgramCompetenciesOutcome9ContributionLevel2());
        mainController.CoursePOMText93.setText(course.getProgramCompetenciesOutcome9ContributionLevel3());
        mainController.CoursePOMText94.setText(course.getProgramCompetenciesOutcome9ContributionLevel4());
        mainController.CoursePOMText95.setText(course.getProgramCompetenciesOutcome9ContributionLevel5());
        mainController.CoursePOMText9LO.setText(course.getProgramCompetenciesOutcome9LOno());
        mainController.CoursePOMText10.setText(course.getProgramCompetenciesOutcome10());
        mainController.CoursePOMText101.setText(course.getProgramCompetenciesOutcome10ContributionLevel1());
        mainController.CoursePOMText102.setText(course.getProgramCompetenciesOutcome10ContributionLevel2());
        mainController.CoursePOMText103.setText(course.getProgramCompetenciesOutcome10ContributionLevel3());
        mainController.CoursePOMText104.setText(course.getProgramCompetenciesOutcome10ContributionLevel4());
        mainController.CoursePOMText105.setText(course.getProgramCompetenciesOutcome10ContributionLevel5());
        mainController.CoursePOMText10LO.setText(course.getProgramCompetenciesOutcome10LOno());
        mainController.CoursePOMText110.setText(course.getProgramCompetenciesOutcome11());
        mainController.CoursePOMText111.setText(course.getProgramCompetenciesOutcome11ContributionLevel1());
        mainController.CoursePOMText112.setText(course.getProgramCompetenciesOutcome11ContributionLevel2());
        mainController.CoursePOMText113.setText(course.getProgramCompetenciesOutcome11ContributionLevel3());
        mainController.CoursePOMText114.setText(course.getProgramCompetenciesOutcome11ContributionLevel4());
        mainController.CoursePOMText115.setText(course.getProgramCompetenciesOutcome11ContributionLevel5());
        mainController.CoursePOMText11LO.setText(course.getProgramCompetenciesOutcome11LOno());
        mainController.CoursePOMText120.setText(course.getProgramCompetenciesOutcome12());
        mainController.CoursePOMText121.setText(course.getProgramCompetenciesOutcome12ContributionLevel1());
        mainController.CoursePOMText122.setText(course.getProgramCompetenciesOutcome12ContributionLevel2());
        mainController.CoursePOMText123.setText(course.getProgramCompetenciesOutcome12ContributionLevel3());
        mainController.CoursePOMText124.setText(course.getProgramCompetenciesOutcome12ContributionLevel4());
        mainController.CoursePOMText125.setText(course.getProgramCompetenciesOutcome12ContributionLevel5());
        mainController.CoursePOMText12LO.setText(course.getProgramCompetenciesOutcome12LOno());
        mainController.CoursePOMText130.setText(course.getProgramCompetenciesOutcome13());
        mainController.CoursePOMText131.setText(course.getProgramCompetenciesOutcome13ContributionLevel1());
        mainController.CoursePOMText132.setText(course.getProgramCompetenciesOutcome13ContributionLevel2());
        mainController.CoursePOMText133.setText(course.getProgramCompetenciesOutcome13ContributionLevel3());
        mainController.CoursePOMText134.setText(course.getProgramCompetenciesOutcome13ContributionLevel4());
        mainController.CoursePOMText135.setText(course.getProgramCompetenciesOutcome13ContributionLevel5());
        mainController.CoursePOMText13LO.setText(course.getProgramCompetenciesOutcome13LOno());
        //TAB SAVE
        mainController.SaveAllText.setText(course.getReasonForUpdate());


        stage.setScene(scene);
        stage.show();

    }



    @FXML
    void trButtonA(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-viewTurkishVer2.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void engButtonA(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void HelpButton(ActionEvent event) {

        File file = new File("src/main/resources/com/example/projemizinilkguitasarimi/SE302 Design Document TeamNo_6.docx (1) (1).pdf");
        if (file.exists()){
            try{
                new ProcessBuilder("cmd","/c",file.getAbsolutePath()).start();
            }
            catch (IOException e ){
                e.printStackTrace();
            }
        }


    }
    @FXML
    private Label file1;
    @FXML
    private Label file2;

    @FXML
    private Label warning;


    @FXML
    private javafx.scene.control.ListView<String> SaveTab;

    @FXML
    private javafx.scene.control.ListView<String> Tab1list = new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> Tab2list = new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> Tab3list= new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> Tab4list= new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> Tab5list= new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> Tab6list= new ListView<>();

    @FXML
    private javafx.scene.control.ListView<String> ListView = new ListView<>();
    @FXML
    private ComboBox<String> comboBox = new ComboBox<>();
    static String[] Keys = new String[100];
    static String[] values = new String[100];
    static HashMap fileMap;



    @FXML
    private TextField searchText;

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


    @FXML
    public void CreateNewCourse()throws IOException {
        Gson gson = new Gson();
        String path = "Document/";
        String code =codeTextt2.getText().toUpperCase();
        String combinedPath = path + code.toUpperCase();
        String newFilePath;

        File directory=new File(combinedPath);
        if (directory.exists()){

            int lastVersion=versionCheck(combinedPath)+1;
            newFilePath = code +"-V"+lastVersion+ ".json";
        }
        else{
            newFilePath= code+"-V0.json";
        }
        CourseInformationx course=new CourseInformationx();
        fillCourse(course);
        String newJson = gson.toJson(course);



        //Create new directory according to course code
        File dir = new File(combinedPath);
        dir.mkdirs();
        File file = new File(dir, newFilePath);

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(newJson);
            System.out.println("JSON written to file successfully.");
        }
    }
    public int versionCheck(String path){

        File directory = new File(path);
        String[] list = directory.list();
        String[] versions = new String[0];
        for (String member : list) {
            versions =member.split("-V");
        }
        String lastVersion=versions[1];
        int lastChar=0;
        if (lastVersion.length()==6){
            lastChar = Integer.parseInt(lastVersion.substring(lastVersion.length() -6,lastVersion.length()-5));
        } else if (lastVersion.length()==7) {
            lastChar = Integer.parseInt(lastVersion.substring(lastVersion.length() -7,lastVersion.length()-5));
        } else if (lastVersion.length()==8) {
            lastChar = Integer.parseInt(lastVersion.substring(lastVersion.length() -8,lastVersion.length()-5));
        }

        System.out.println(lastChar);
        System.out.println(lastVersion);
        return lastChar;
    }



}
