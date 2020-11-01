import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BarChartViewController implements Initializable
{
    /**
     * FXML Definiton to Link the Scene info
     */

    @FXML
    private BarChart<?, ?> barChart1;

    @FXML
    private CategoryAxis ClassAxis;

    @FXML
    private NumberAxis totalCharAxis;

    private XYChart.Series maxChoice;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        /**
         * Variable Difintion to store the results from the calculated values
         */

        int totalFighter = 0;
        int totalRogue = 0;
        int totalWizard =0 ;
        int totalBarbarian=0 ;
        int totalCleric=0 ;
        int totalRanger=0 ;
        int totalPaladin=0 ;
        int totalWarlock=0 ;
        int totalMonk=0 ;
        int totalBard=0 ;
        int totalSorcerer=0 ;
        int totalDruid = 0;

       try {

           /**
            * Get the Database Table Via the DBUtil Class
            *
            */

           ArrayList<CharModel> charactersStats = new ArrayList<>(DBUtil.getAllCharInfo());
           System.out.println(charactersStats);

           /**
            * Iterate thru the Ret Database Table
            */

           for (int i = 0; i < charactersStats.size(); i++) {
               totalFighter += Integer.parseInt(charactersStats.get(i).getTotalFighter());
               totalRogue += Integer.parseInt(charactersStats.get(i).getTotalRogue());
               totalWizard += Integer.parseInt(charactersStats.get(i).getTotalWizard());
               totalBarbarian += Integer.parseInt(charactersStats.get(i).getTotalBarbarian());
               totalCleric += Integer.parseInt(charactersStats.get(i).getTotalCleric());
               totalRanger += Integer.parseInt(charactersStats.get(i).getTotalRanger());
               totalPaladin += Integer.parseInt(charactersStats.get(i).getTotalPaladin());
               totalWarlock += Integer.parseInt(charactersStats.get(i).getTotalWarlock());
               totalMonk += Integer.parseInt(charactersStats.get(i).getTotalMonk());
               totalBard += Integer.parseInt(charactersStats.get(i).getTotalBard());
               totalSorcerer += Integer.parseInt(charactersStats.get(i).getTotalRanger());
               totalDruid += Integer.parseInt(charactersStats.get(i).getTotalDruid());
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        /**
         * Define the Bar Chart and Add the Total Values to the Chart
         */

        maxChoice = new XYChart.Series();

        maxChoice.getData().add(new XYChart.Data("Fighter",totalFighter));
        maxChoice.getData().add(new XYChart.Data("Rogue",totalRogue));
        maxChoice.getData().add(new XYChart.Data("Wizard",totalWizard));
        maxChoice.getData().add(new XYChart.Data("Barbarian",totalBarbarian));
        maxChoice.getData().add(new XYChart.Data("Cleric",totalCleric));
        maxChoice.getData().add(new XYChart.Data("Ranger",totalRanger));
        maxChoice.getData().add(new XYChart.Data("Paladin",totalPaladin));
        maxChoice.getData().add(new XYChart.Data("Warlock",totalWarlock));
        maxChoice.getData().add(new XYChart.Data("Monk",totalMonk));
        maxChoice.getData().add(new XYChart.Data("Bard",totalBard));
        maxChoice.getData().add(new XYChart.Data("Sorcerer",totalSorcerer));
        maxChoice.getData().add(new XYChart.Data("Druid",totalDruid));

        barChart1.getData().addAll(maxChoice);

    }
}
