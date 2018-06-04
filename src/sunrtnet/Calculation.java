package sunrtnet;

import contants.AlgorithmValue;
import entity.OneOneParam;
import entity.OneTwoParam;
import entity.Result;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import utils.CalculationResultUtils;

import java.net.URL;
import java.util.ArrayList;
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
public class Calculation implements Initializable {

    @FXML
    public TextArea first;

    private String algorithmValue;
    private AlgorithmMain application;

    public void setApp(AlgorithmMain application, String value){
        this.algorithmValue = value;
        this.application = application;
    }

    public void getResult(ActionEvent actionEvent) {

        List<Result> results = new ArrayList<>();

        String paramStr = first.getText();
        String[] paramArray = paramStr.split("\n");
        if (AlgorithmValue.ROAD_MIDDLE_UN_SUPER_HIGH_UPLINK.equals(algorithmValue) || AlgorithmValue.ROAD_MIDDLE_UN_SUPER_HIGH_DOWNLINK.equals(algorithmValue)){
            //路中无超高
            List<OneOneParam> params = new ArrayList<>();
            OneOneParam param;
            int i = 1;
            for (String temp : paramArray){
                String[] strs = temp.split("\t");
                param = new OneOneParam();
                param.setFlowNum(i++);
                param.setRoadMiddleX(Double.valueOf(strs[0]));
                param.setRoadMiddleY(Double.valueOf(strs[1]));
                param.setPz(Double.valueOf(strs[2]));
                param.setDesignH(Double.valueOf(strs[3]));
                param.setE(Double.valueOf(strs[4]));
                param.setF(Double.valueOf(strs[5]));
                param.setY(strs[6]);
                param.setD(Double.valueOf(strs[7]));
                param.setV(strs[8]);
                params.add(param);
            }
            results = CalculationResultUtils.oneOne(params, algorithmValue);
        } else if (AlgorithmValue.ROAD_MIDDLE_SUPER_HIGH_UNLINK.equals(algorithmValue) || AlgorithmValue.ROAD_MIDDLE_SUPER_HIGH_DOWNLINK.equals(algorithmValue)){
            //路中有超高
            List<OneTwoParam> params = new ArrayList<>();
            OneTwoParam param;
            int i = 1;
            for (String temp : paramArray){
                String[] strs = temp.split("\t");
                param = new OneTwoParam();
                param.setFlowNum(i++);
                param.setRoadMiddleX(Double.valueOf(strs[0]));
                param.setRoadMiddleY(Double.valueOf(strs[1]));
                param.setPz(Double.valueOf(strs[2]));
                param.setDesignH(Double.valueOf(strs[3]));

            }
        } else if (AlgorithmValue.ROAD_SIDE_UN_SUPER_HIGH_UNLINK.equals(algorithmValue) || AlgorithmValue.ROAD_SIDE_UN_SUPER_HIGH_DOWNLINK.equals(algorithmValue)){
            //路测无超高
        }else if (AlgorithmValue.ROAD_SIDE_SUPER_HIGH_UNLINK.equals(algorithmValue) || AlgorithmValue.ROAD_SIDE_SUPER_HIGH_DOWNLINK.equals(algorithmValue)){
            //路测有超高
        }

        application.startResult(results,algorithmValue);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
