package rommel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class Controller {
	public void buttonClicked(){
		System.out.println("Stop it.");
	}
	ObservableList<String> officeToVisitList=FXCollections.observableArrayList("ITDC","DCS","OUR");
	@FXML
	private ChoiceBox<String> visitBox;
	private Button XSetAttendance;
	
	@FXML
	private void initialize(){
		visitBox.setValue("ITDC");
		visitBox.setItems(officeToVisitList);
	}
	public void setClicked(){
		System.out.print("Hello");
	}
}
