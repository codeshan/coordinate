package sunrtnet;

import entity.Result;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:
 * Changelog:
 * Revision 1.0  2018/5/21 shanchanglu
 */
public class AlgorithmMain extends Application {

    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 800.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("Welcome To You!");
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        gotologin();
        stage.show();
    }
    //欢迎页面
    private void gotologin() {
        try {
            Welcome login = (Welcome) replaceSceneContent("Welcome.fxml");
            login.setApp(this);
        }catch (Exception ex){
            Logger.getLogger(AlgorithmMain.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    //确认算法页面
    public void startCalculate() {
        gotomain();
    }
    private void gotomain() {
        try {
            DecideAlgorithm main = (DecideAlgorithm) replaceSceneContent("DecideAlgorithm.fxml");
            main.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(AlgorithmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //跳转到计算窗口
    public void startCalculation(String value) {
        gotoCalculation(value);
    }

    private void gotoCalculation(String value) {
        try {
            Calculation calculation = (Calculation) replaceSceneContent("Calculation.fxml");
            calculation.setApp(this,value);
        }catch (Exception ex){
            Logger.getLogger(AlgorithmMain.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    //跳转到结果显示窗口
    public void startResult(List<Result> results, String value){
        try {
            ShowResult showResult = (ShowResult) replaceSceneContent("ShowResult.fxml");
            showResult.setApp(this,results,value);
        }catch (Exception ex){
            Logger.getLogger(AlgorithmMain.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    private Initializable replaceSceneContent(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = AlgorithmMain.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(AlgorithmMain.class.getResource(fxml));
        AnchorPane page;
        try {
            page = loader.load(in);
        }finally {
            in.close();
        }
        Scene scene = new Scene(page,900,700);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable)loader.getController();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
