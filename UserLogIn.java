
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class UserLogIn extends Application {
	public void start(Stage primaryStage) {
		Alert output= new Alert(AlertType.INFORMATION);
		TextInputDialog dialog = new TextInputDialog();
		dialog.setContentText("Enter Your User Name:");
		dialog.showAndWait();
		String username = dialog.getResult();

		String name="foinni";
		String pass = "123";

		if (username.equals(name)) {
			dialog.setContentText("Enter Your Password");
			dialog.showAndWait();
			String password=dialog.getResult();
			if (password.equals(pass)) {
				output.setContentText("Welcome to CSC200!");
				output.showAndWait();
			}

		} else {
			output.setContentText("Wrong User Name " + "Bye! ");
			output.showAndWait();

		}

	}

}
