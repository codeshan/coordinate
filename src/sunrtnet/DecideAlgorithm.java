package sunrtnet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import utils.ConfirmAlgorithmUtil;

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
public class DecideAlgorithm implements Initializable {

    public ChoiceBox designPlan;
    public ChoiceBox isSuperHigh;
    public ChoiceBox preDirection;


    private AlgorithmMain application;

    public void setApp(AlgorithmMain application){
        this.application = application;
    }

    @FXML
    public void nextStep(ActionEvent actionEvent) {
        System.out.println(designPlan.getValue());
        System.out.println(isSuperHigh.getValue());
        System.out.println(preDirection.getValue());
        String value = ConfirmAlgorithmUtil.confirm(String.valueOf(designPlan.getValue()), String.valueOf(isSuperHigh.getValue()), String.valueOf(preDirection.getValue()));
        application.startCalculation(value);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
