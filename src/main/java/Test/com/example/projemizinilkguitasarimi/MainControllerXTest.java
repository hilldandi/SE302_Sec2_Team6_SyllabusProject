package com.example.projemizinilkguitasarimi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerXTest {

    @Test
    void switchToScene1() {
    }

    @Test
    void switchToScene2() {
    }

    @Test
    void switchToScene3() {
    }

    @Test
    void switchToScene4() {
    }

    @Test
    void compareButton() {
    }

    @Test
    void editButton() {
    }

    @Test
    void helpButton() {
    }

    @Test
    void saveAll() {
    }

    @Test
    void compareVersionsTAB1Test() {
        MainControllerX controllerX = new MainControllerX();

        controllerX.CompareVersionsTAB1Test();
    }

    @Test
    void createNewCourse() {
        MainControllerX controllerX = new MainControllerX();
        controllerX.read();
    }

    @Test
    void versionCheck() {
    }

    @Test
    void readJsonFile(){
        MainControllerX controllerX = new MainControllerX();
        controllerX.readJsonFile("Document/CE323/CE323.json");
    }

    @Test
    void read() {
        MainControllerX controllerX = new MainControllerX();
        CourseInformationx course = controllerX.readJsonFile("Document/CE323/CE323.json");

    }

    @Test
    void fillCourse() {
    }
}