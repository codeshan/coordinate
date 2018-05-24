package sunrtnet;

import contants.AlgorithmValue;
import entity.Result;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

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
    @FXML
    public Label algorithm;
    @FXML
    public TableView<Result> tableView = new TableView<>();
    @FXML
    public TableColumn i;
    @FXML
    public TableColumn ii;
    @FXML
    public TableColumn iii;
    @FXML
    public TableColumn ix;
    @FXML
    public TableColumn iy;
    @FXML
    public TableColumn iz;
    @FXML
    public TableColumn iix;
    @FXML
    public TableColumn iiy;
    @FXML
    public TableColumn iiz;
    @FXML
    public TableColumn iiix;
    @FXML
    public TableColumn iiiy;
    @FXML
    public TableColumn iiiz;
    private ObservableList<Result> data;

    private AlgorithmMain application;


    public void setApp(AlgorithmMain application, List<Result> results, String value){
        if (AlgorithmValue.ROAD_MIDDLE_UN_SUPER_HIGH_UPLINK.equals(value)){
            algorithm.setText("路中无超高上行");
        }
        this.application = application;
        this.data = FXCollections.observableArrayList(results);
        tableView.setItems(data);
        ix.setCellValueFactory(new PropertyValueFactory<>("ix"));
        iy.setCellValueFactory(new PropertyValueFactory<>("iy"));
        iz.setCellValueFactory(new PropertyValueFactory<>("iz"));
        iix.setCellValueFactory(new PropertyValueFactory<>("iix"));
        iiy.setCellValueFactory(new PropertyValueFactory<>("iiy"));
        iiz.setCellValueFactory(new PropertyValueFactory<>("iiz"));
        iiix.setCellValueFactory(new PropertyValueFactory<>("iiix"));
        iiiy.setCellValueFactory(new PropertyValueFactory<>("iiiy"));
        iiiz.setCellValueFactory(new PropertyValueFactory<>("iiiz"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
