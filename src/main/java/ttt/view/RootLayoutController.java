package main.java.ttt.view;


import main.java.ttt.TaskTimeTracker;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;

public class RootLayoutController {

	/**
	 * The controller for the root layout. The root layout provides the basic
	 * application layout containing a menu bar and space where other JavaFX
	 * elements can be placed.
	 * 
	 */

	// Reference to the main application
	private TaskTimeTracker taskTimeTracker;

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param taskTimeTracker
	 */
	public void setTaskTimeTracker(TaskTimeTracker taskTimeTracker) {
		this.taskTimeTracker = taskTimeTracker;
	}

//	/**
//	 * Opens a FileChooser to let the user select a task file to load.
//	 */
//	@FXML
//	private void handleOpen() {
//		FileChooser fileChooser = new FileChooser();
//
//		// Set extension filter
//		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
//				"XML files (*.xml)", "*.xml");
//		fileChooser.getExtensionFilters().add(extFilter);
//
//		// Show save file dialog
//		File file = fileChooser.showOpenDialog(taskTimeTracker.getPrimaryStage());
//
//		if (file != null) {
//			taskManager.loadTaskDataFromFile(file);
//		}
//	}

//	/**
//	 * Saves the file to the task file that is currently open. If there is no
//	 * open file, the "save as" dialog is shown.
//	 */
//	@FXML
//	private void handleSave() {
//		File taskFile = taskManager.getTaskFilePath();
//		if (taskFile != null) {
//			taskManager.saveTaskDataToFile(taskFile);
//		} else {
//			handleSaveAs();
//		}
//	}

//	/**
//	 * Opens a FileChooser to let the user select a file to save to.
//	 */
//	@FXML
//	private void handleSaveAs() {
//		FileChooser fileChooser = new FileChooser();
//
//		// Set extension filter
//		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
//				"XML files (*.xml)", "*.xml");
//		fileChooser.getExtensionFilters().add(extFilter);
//
//		// Show save file dialog
//		File file = fileChooser.showSaveDialog(taskTimeTracker.getPrimaryStage());
//
//		if (file != null) {
//			// Make sure it has the correct extension
//			if (!file.getPath().endsWith(".xml")) {
//				file = new File(file.getPath() + ".xml");
//			}
//			taskManager.saveTaskDataToFile(file);
//		}
//	}

	/**
	 * Closes the application.
	 */
	@FXML
	private void handleExit() {
		System.exit(0);
	}
}
