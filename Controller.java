package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    private Label dollarsum;

    @FXML
    private Label rublesum;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button reset;

    @FXML
    private Button convertto;

    public void initialize(URL fxmlLocationFile, ResourceBundle resources)
    {
        reset.setOnAction(
                event ->
                {
                    dollarsum.setText("");
                    rublesum.setText("");
                }
        );

        one.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+one.getText());
                }
        );
        two.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+two.getText());
                }
        );
        three.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+three.getText());
                }
        );
        four.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+four.getText());
                }
        );
        five.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+five.getText());
                }
        );
        six.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+six.getText());
                }
        );
        seven.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+seven.getText());
                }
        );
        eight.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+eight.getText());
                }
        );
        nine.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+nine.getText());
                }
        );
        zero.setOnAction(
                event ->
                {
                    dollarsum.setText(dollarsum.getText()+zero.getText());
                }
        );
        convertto.setOnAction(
                event ->
                {
                    int dol = Integer.parseInt(dollarsum.getText());
                    rublesum.setText(String.valueOf(dol*64));
                }
        );
    }
}