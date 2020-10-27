import java.sql.*;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DBUtil {
// User Name and Password
private static String user="stevendavies";
private static String password="Bonnied029$";

public static int insertNewCharacterRace(CharModel newCharacterRace) throws SQLException {

    Connection conn = null;
    PreparedStatement ps = null;
    int raceId = -1;
    ResultSet rs = null;

    try{

        // 1 Define the Connection String

        conn= DriverManager.getConnection("jdbc:mysql://107.180.0.227:3306/Comp1011_Assign1", user,password) ;

        // 2 Create the SQL Command Info

        String sql =  "INSERT INTO `tblCharsStat`(`race`, `class`, `number`) \n" +
                "VALUES (?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?),(?,?,?)";

        // 3 Create the Prepared Statement (SQl Injection Protection)

        ps = conn.prepareStatement(sql, new String [] {"raceID"});

        // 4 Bind the Values

        ps.setString(1, newCharacterRace.getCharRace());
        ps.setString(2, "FIGHTER");
        ps.setInt(3, Integer.parseInt(newCharacterRace.getTotalFighter()));

        ps.setString(4, newCharacterRace.getCharRace());
        ps.setString(5, "ROGUE");
        ps.setInt(6, Integer.parseInt(newCharacterRace.getTotalRogue()));

        ps.setString(7, newCharacterRace.getCharRace());
        ps.setString(8, "WIZARD");
        ps.setInt(9, Integer.parseInt(newCharacterRace.getTotalWizard()));

        ps.setString(10, newCharacterRace.getCharRace());
        ps.setString(11, "BARBARIAN");
        ps.setInt(12, Integer.parseInt(newCharacterRace.getTotalBarbarian()));

        ps.setString(13, newCharacterRace.getCharRace());
        ps.setString(14, "CLERIC");
        ps.setInt(15, Integer.parseInt(newCharacterRace.getTotalCleric()));

        ps.setString(16, newCharacterRace.getCharRace());
        ps.setString(17, "RANGER");
        ps.setInt(18, Integer.parseInt(newCharacterRace.getTotalRanger()));

        ps.setString(19, newCharacterRace.getCharRace());
        ps.setString(20, "PALADIN");
        ps.setInt(21, Integer.parseInt(newCharacterRace.getTotalPaladin()));

        ps.setString(22, newCharacterRace.getCharRace());
        ps.setString(23, "WARLOCK");
        ps.setInt(24, Integer.parseInt(newCharacterRace.getTotalWarlock()));

        ps.setString(25, newCharacterRace.getCharRace());
        ps.setString(26, "MONK");
        ps.setInt(27, Integer.parseInt(newCharacterRace.getTotalMonk()));

        ps.setString(28, newCharacterRace.getCharRace());
        ps.setString(29, "BARD");
        ps.setInt(30, Integer.parseInt(newCharacterRace.getTotalBard()));

        ps.setString(31, newCharacterRace.getCharRace());
        ps.setString(32, "SORCERER");
        ps.setInt(33, Integer.parseInt(newCharacterRace.getTotalSorcerer()));

        ps.setString(34, newCharacterRace.getCharRace());
        ps.setString(35, "DRUID");
        ps.setInt(36, Integer.parseInt(newCharacterRace.getTotalDruid()));

        // 5 execute the SQL and write to the DB

        ps.executeUpdate();

        // 6 Get the returned Character RaceId

        rs = ps.getGeneratedKeys();

        while(rs.next())
        {
           raceId = rs.getInt(1);
        }

    }
    catch (SQLException e)
    {
        e.printStackTrace();
    } finally {
        // Clear All Objects/Connections
        if (conn != null)
        {
            conn.close();
        }
        if (ps != null)
        {
            ps.close();
        }
        if (rs !=null)
        {
            rs.close();
        }
        return raceId;
    }

}

public static ArrayList<CharModel> getAllCharInfo() throws SQLException {

    ArrayList<CharModel> charactersStats = new ArrayList<>();

    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {

        // 1 Define the Connection String
        conn = DriverManager.getConnection("jdbc:mysql://107.180.0.227:3306/Comp1011_Assign1", user, password);
        // 2 Create the SQL Command to Retrieve Data

        statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        // 3 Execute the SQL to get the data and place in

        ResultSet rs = statement.executeQuery("SELECT * FROM tblCharsStat");

        rs.last();

        int totalRowsResult = rs.getRow() / 12 ;

        resultSet = statement.executeQuery("SELECT * FROM tblCharsStat");
        // 4 Loop over Data (12 Rows make up 1 Object)
        resultSet.first();


        for (int b = 1; b <= totalRowsResult ; b++)
        {
            ArrayList<String> arrlist = new ArrayList<String>(13);

            arrlist.add(resultSet.getString(String.valueOf("iCharsStatId")));
            arrlist.add(resultSet.getString("race"));

            for (int i = 0; i < 12; i++) {
                arrlist.add(resultSet.getString(String.valueOf("number")));
                resultSet.next();
            }
            CharModel newCharCharacter = new CharModel(Integer.parseInt(arrlist.get(0)), arrlist.get(1) , arrlist.get(2), arrlist.get(3), arrlist.get(4), arrlist.get(5), arrlist.get(6), arrlist.get(7), arrlist.get(8), arrlist.get(9), arrlist.get(10), arrlist.get(11), arrlist.get(12),arrlist.get(13));
            charactersStats.add(newCharCharacter);
        }

    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    finally {
        if (conn != null)
        {
            conn.close();
        }
        if (statement != null)
        {
            statement.close();
        }
        if (resultSet !=null)
        {
            resultSet.close();
        }
        return charactersStats;
    }
}
    public static int getRows(ResultSet res){
        int totalRows = 0;
        try {
            res.last();
            totalRows = res.getRow();
            res.beforeFirst();
        }
        catch(Exception ex)  {
            return 0;
        }
        return totalRows ;
    }
}
