import java.sql.SQLException;
public class testNewRace {
    public static void main(String[] args) {
        try{
            Charmodel newRace = new Charmodel("HobGoblin", 100,100,100,100,100,100,100,100,100,100,100,100);
            System.out.println("The New Race ID is: " + newRace.getRaceID());
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
