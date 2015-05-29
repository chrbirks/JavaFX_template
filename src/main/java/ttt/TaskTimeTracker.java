package main.java.ttt;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.java.ttt.view.RootLayoutController;
import main.java.ttt.view.TaskOverviewController;

public class TaskTimeTracker extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	private TaskOverviewController taskOverviewController;

	// Locations for Eclipse
	private static final String ROOT_LAYOUT_LOCATION = "/main/resources/ttt/view/RootLayout.fxml";
	private static final String TASK_OVERVIEW_LOCATION = "/main/resources/ttt/view/TaskOverview.fxml";

	// Locations for Maven jar
//	private static final String ROOT_LAYOUT_LOCATION = "/ttt/view/RootLayout.fxml";
//	private static final String TASK_OVERVIEW_LOCATION = "/ttt/view/TaskOverview.fxml";

    // ExecutorService
//	private static final int N_THREADS_CORE_POOL = 1;
//	private static ScheduledExecutorService scheduler = Executors
//			.newScheduledThreadPool(N_THREADS_CORE_POOL, new ThreadFactory() {
//				@Override
//				public Thread newThread(Runnable r) {
//					return new Thread(r, "TimeKeeperScheduler");
//				}
//			});
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TaskTimeTracker");

		initRootLayout();

		showTaskOverview();
	}

	@Override
	public void stop() {
		System.out.println("Closing application");
//		scheduler.shutdown();
		try {
			super.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initializes the root layout and tries to load the last opened task file.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(TaskTimeTracker.class
					.getResource(ROOT_LAYOUT_LOCATION));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);

			// Give the controller access to the main app.
			RootLayoutController controller = loader.getController();
			controller.setTaskTimeTracker(this);

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Shows the task overview inside the root layout.
	 */
	public void showTaskOverview() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(TaskTimeTracker.class
					.getResource(TASK_OVERVIEW_LOCATION));
			AnchorPane taskOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(taskOverview);

			// Give the controller access to the main app.
			taskOverviewController = loader.getController();
			taskOverviewController.setTaskTimeTracker(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * @param args
	 *            are not used
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
