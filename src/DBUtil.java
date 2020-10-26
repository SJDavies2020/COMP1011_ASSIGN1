import java.sql.*;

public class DBUtil {
// User Name and Password
private static String user="stevendavies";
private static String password="Bonnied029$";

public static int insertNewCharacterRace(Charmodel newCharacterRace) throws SQLException {

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


}
