package main.java.ttt.view;

import javafx.fxml.FXML;
import main.java.ttt.TaskTimeTracker;

public class TaskOverviewController {

	// Reference to main application
	private TaskTimeTracker taskTimeTracker;

	// ExecutorService
//	private static final int POLL_INTERVAL = 1;
//	private ScheduledExecutorService scheduler;
//	private static ScheduledFuture<?> scheduledFuture = null;


	// Constructor
	public TaskOverviewController() {

	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {

	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param taskTimeTracker
	 */
	public void setTaskTimeTracker(TaskTimeTracker taskTimeTracker) {
		this.taskTimeTracker = taskTimeTracker;
	}


}
