package com.example.lab4;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class HelloController {

    public Slider slider1;
    public Slider slider2;
    public Slider slider3;
    public Slider slider4;
    public LineChart chart1;
    private XYChart.Series series;



    @FXML
    public void initialize(){

        series = new XYChart.Series();
        series.setName("sin");
        chart1.getData().add(series);
        slider4.setValue(50);

    }




    private void regenSin(){



        series.getData().clear();
        for (int i = 0; i < 200; i++){
            series.getData().add(new XYChart.Data(Integer.toString(i) , slider4.getValue() - 50 +
                    slider1.getValue() * Math.sin(slider2.getValue()* 0.005 * i + slider3.getValue() * 0.063)));

        }


    }

    public void sliderChanged() {

        regenSin();

    }
}