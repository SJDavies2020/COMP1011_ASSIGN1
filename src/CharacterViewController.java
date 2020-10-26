import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class CharacterViewController implements Initializable {

        @FXML
        private TableView <Charmodel> tableView;

        @FXML
        private TableColumn<Charmodel,String> race;

        @FXML
        private TableColumn<Charmodel, String> fighter;

        @FXML
        private TableColumn<Charmodel, String> rogue;

        @FXML
        private TableColumn<Charmodel, String> wizard;

        @FXML
        private TableColumn<Charmodel, String> barbarian;

        @FXML
        private TableColumn<Charmodel, String> cleric;

        @FXML
        private TableColumn<Charmodel, String> ranger;

        @FXML
        private TableColumn<Charmodel, String> paladin;

        @FXML
        private TableColumn<Charmodel, String> warlock;

        @FXML
        private TableColumn<Charmodel, String> bard;

        @FXML
        private TableColumn<Charmodel, String> sorcerer;

        @FXML
        private TableColumn<Charmodel, String> druid;

        @FXML
        private TableColumn<Charmodel, String> monk;

        @FXML
        private Label lblHeader;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}


