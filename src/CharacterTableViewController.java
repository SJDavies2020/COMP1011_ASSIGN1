import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CharacterTableViewController implements Initializable {

        @FXML
        private TableView <CharModel> tableView;

        @FXML
        private TableColumn<CharModel, Integer> race;

        @FXML
        private TableColumn<CharModel, String> fighter;

        @FXML
        private TableColumn<CharModel, String> rogue;

        @FXML
        private TableColumn<CharModel, String> wizard;

        @FXML
        private TableColumn<CharModel, String> barbarian;

        @FXML
        private TableColumn<CharModel, String> cleric;

        @FXML
        private TableColumn<CharModel, String> ranger;

        @FXML
        private TableColumn<CharModel, String> paladin;

        @FXML
        private TableColumn<CharModel, String> warlock;

        @FXML
        private TableColumn<CharModel, String> bard;

        @FXML
        private TableColumn<CharModel, String> sorcerer;

        @FXML
        private TableColumn<CharModel, String> druid;

        @FXML
        private TableColumn<CharModel, String> monk;

        @FXML
        private Label lblHeader;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
            race.setCellValueFactory(new PropertyValueFactory<CharModel,Integer>("raceID"));
            fighter.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalFighter"));
            rogue.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalRogue"));
            wizard.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalWizard"));
            barbarian.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalBarbarian"));
            cleric.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalCleric"));
            ranger.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalRanger"));
            paladin.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalPaladin"));
            warlock.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalWarlock"));
            bard.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalBard"));
            sorcerer.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalSorcerer"));
            druid.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalDruid"));
            monk.setCellValueFactory(new PropertyValueFactory<CharModel,String>("totalMonk"));

            try {
                    tableView.getItems().addAll(DBUtil.getAllCharInfo());
            } catch (SQLException e) {
                    e.printStackTrace();
            }
    }
}


