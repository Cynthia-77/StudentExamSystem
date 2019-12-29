package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class RankWindowController implements Initializable {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn colName;
    @FXML
    private TableColumn colAccount;
    @FXML
    private TableColumn colScore;

    public void showList() {
        ObservableList<Person> list = FXCollections.observableArrayList();
        Person person = new Person();  //构建值对象
        person.setName("小六");
        person.setAccount("123");
        person.setScore("99");

        colName.setCellValueFactory(new PropertyValueFactory("Name"));  //映射
        colAccount.setCellValueFactory(new PropertyValueFactory("account"));
        colScore.setCellValueFactory(new PropertyValueFactory("score"));

        list.add(person);  //list添加值对象
        tableView.setItems(list); //tableView添加list
    }

    @FXML
    private void Back(ActionEvent event) {
        main.rankBackToMain();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showList();
    }
}
