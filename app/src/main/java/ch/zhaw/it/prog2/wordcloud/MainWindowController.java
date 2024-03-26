package ch.zhaw.it.prog2.wordcloud;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label labelTitle;

    @FXML
    private TextField textEntry;

    @FXML
    private TextArea textHistory;

    private StringProperty titleText;

    public MainWindowController() {
        titleText = new SimpleStringProperty();
    }

    @FXML
    private void initialize() {
        labelTitle.textProperty().bind(titleText);
        titleText.bind(textEntry.textProperty());
    }

    @FXML
    void addText(ActionEvent event) {
        String text = textEntry.getText();
        if (!text.isEmpty()) {
            textHistory.appendText(text + "\n");
        }
    }

    @FXML
    void clearTextEntry(ActionEvent event) {
        textEntry.clear();
    }
}