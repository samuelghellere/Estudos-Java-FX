package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTesteAction() {
		//Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.ERROR); 
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
	}
}
