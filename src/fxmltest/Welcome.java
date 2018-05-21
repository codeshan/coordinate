package fxmltest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:
 * Changelog:
 * Revision 1.0  2018/5/21 shanchanglu
 */
public class Welcome implements Initializable {

    private AlgorithmMain application;

    public void setApp(AlgorithmMain application){
        this.application = application;
    }

    @FXML
    public void startCalculate(ActionEvent actionEvent) {
        application.startCalculate();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
