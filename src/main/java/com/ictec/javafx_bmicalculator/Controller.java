package com.ictec.javafx_bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label BMIvalue;
    @FXML
    private Label Category;

    @FXML
    private TextField Height;
    @FXML
    private TextField Weight;
    @FXML
    private Label Error;



    @FXML
    protected void onCalculateButtonClick() {
        if(Height.getText().isEmpty() || Weight.getText().isEmpty()){
                Error.setText("Please Fill all the fields");
        }else {
            Error.setText("");
            float height = Float.parseFloat(Height.getText());
            float weight = Float.parseFloat(Weight.getText());

            double bmi=weight/Math.pow(height,2);

            BMIvalue.setText(Math.round(bmi*100.0)/100.0+"bmi");

            if(bmi<18.5) {
                Category.setText("Underweight");
            }else if(bmi<24.9){
                Category.setText("Healthy");
            }else if(bmi<29.9){
                Category.setText("Overweight");
            }else{
                Category.setText("Obesity");
            }
        }
    }
    @FXML
    protected void onResetButtonClick(){
        BMIvalue.setText("");
        Category.setText("");
        Error.setText("");
        Height.setText("");
        Weight.setText("");
    }
}