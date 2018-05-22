package sunrtnet;

import contants.AlgorithmValue;
import entity.Result;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:
 * Changelog:
 * Revision 1.0  2018/5/22 shanchanglu
 */
public class ShowResult implements Initializable {

    public Label algorithm;
    private AlgorithmMain application;
    private List<Result> results;

    public void setApp(AlgorithmMain application, List<Result> results, String value){
        if (AlgorithmValue.ROAD_MIDDLE_UN_SUPER_HIGH_UPLINK.equals(value)){
            algorithm.setText("路中无超高上行");
        }
        this.results = results;
        this.application = application;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
