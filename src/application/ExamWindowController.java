package application;

import javafx.stage.Stage;

public class ExamWindowController {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    private Stage stage;

    public void init(Main main,Stage stage) {
        this.stage=stage;
    }

}
