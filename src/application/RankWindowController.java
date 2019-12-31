package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import repository.IPersonRepository;
import repository.Person;
import repository.PersonRepository;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RankWindowController implements Initializable {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn colRank;
    @FXML
    private TableColumn colAccount;
    @FXML
    private TableColumn colScore;

    public void showList() {
        ObservableList<Person> list = FXCollections.observableArrayList();
        IPersonRepository repository = new PersonRepository();
        List<Person> persons = repository.getPersons();
        for (Person person:persons){  //构建值对象

            colRank.setCellValueFactory(new PropertyValueFactory("rank"));  //映射
            colAccount.setCellValueFactory(new PropertyValueFactory("account"));
            colScore.setCellValueFactory(new PropertyValueFactory("score"));

            list.add(person);  //list添加值对象
        }
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
