import java.sql.SQLException;
import org.apache.commons.lang3.*;

public class Charmodel {

    private int raceID;
    private String charRace;
    private String totalFighter;
    private String totalRogue;
    private String totalWizard;
    private String totalBarbarian;
    private String totalCleric;
    private String totalRanger;
    private String totalPaladin;
    private String totalWarlock;
    private String totalMonk;
    private String totalBard;
    private String totalSorcerer;
    private String totalDruid;


    public Charmodel(int raceID, String charRace, String totalFighter, String totalRogue, String totalWizard, String totalBarbarian, String totalCleric, String totalRanger, String totalPaladin, String totalWarlock, String totalMonk, String totalBard, String totalSorcerer, String totalDruid) {

        setRaceID(raceID);
        setCharRace(charRace);
        setTotalFighter(totalFighter);
        setTotalRogue(totalRogue);
        setTotalWizard(totalWizard);
        setTotalBarbarian(totalBarbarian);
        setTotalCleric(totalCleric);
        setTotalRanger(totalRanger);
        setTotalPaladin(totalPaladin);
        setTotalWarlock(totalWarlock);
        setTotalMonk(totalMonk);
        setTotalBard(totalBard);
        setTotalSorcerer(totalSorcerer);
        setTotalDruid(totalDruid);

    }

    /**
     * The Method will write to the Database when called.
     * @param chrRac
     * @param totFighter
     * @param totRogue
     * @param totWizard
     * @param totBarbarian
     * @param totCleric
     * @param totRanger
     * @param totPaladin
     * @param totWarlock
     * @param totMonk
     * @param totBard
     * @param totSorcerer
     * @param totDruid
     * @throws SQLException
     */



public Charmodel(String chrRac, String totFighter, String totRogue, String totWizard, String totBarbarian, String totCleric, String totRanger,String totPaladin, String totWarlock, String totMonk, String totBard, String totSorcerer, String totDruid) throws SQLException {

    setCharRace(chrRac);
    setTotalFighter(totFighter);
    setTotalRogue(totRogue);
    setTotalWizard(totWizard);
    setTotalBarbarian(totBarbarian);
    setTotalCleric(totCleric);
    setTotalRanger(totRanger);
    setTotalPaladin(totPaladin);
    setTotalWarlock(totWarlock);
    setTotalMonk(totMonk);
    setTotalBard(totBard);
    setTotalSorcerer(totSorcerer);
    setTotalDruid(totDruid);

    raceID = DBUtil.insertNewCharacterRace(this);

}

    public int getRaceID() {
        return raceID;
    }

    public void setRaceID(int raceID) {

        this.raceID = raceID;
    }

    public String getCharRace() {return charRace;
    }
    public void setCharRace(String charRac) {
        if (charRac.matches("[A-z]*")) {
            this.charRace = charRac;

        }
        else{
             throw new IllegalArgumentException("Input must only be text!");
            }
    }

    public String getTotalFighter() {
            return totalFighter;
    }

    public void setTotalFighter(String totalFighter) {
        if (totalFighter.matches("[0-9]")) {
        this.totalFighter = totalFighter;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalRogue() {
        return totalRogue;
    }

    public void setTotalRogue(String totalRogue) {
        if (totalRogue.matches("[0-9]")) {
            this.totalRogue = totalRogue;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }
    }

    public String getTotalWizard() {
        return totalWizard;
    }

    public void setTotalWizard(String totalWizard) {
        if (totalWizard.matches("[0-9]")) {
            this.totalWizard = totalWizard;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalBarbarian() {
        return totalBarbarian;
    }

    public void setTotalBarbarian(String totalBarbarian) {
        if (totalBarbarian.matches("[0-9]")) {
            this.totalBarbarian = totalBarbarian;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalCleric() {
        return totalCleric;
    }

    public void setTotalCleric(String totalCleric) {
        if (totalCleric.matches("[0-9]")) {
            this.totalCleric = totalCleric;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalRanger() {
        return totalRanger;
    }

    public void setTotalRanger(String totalRanger) {
        if (totalRanger.matches("[0-9]")) {
            this.totalRanger = totalRanger;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalPaladin() {
        return totalPaladin;
    }

    public void setTotalPaladin(String totalPaladin) {
        if (totalPaladin.matches("[0-9]")) {
            this.totalPaladin = totalPaladin;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalWarlock() {
        return totalWarlock;
    }

    public void setTotalWarlock(String totalWarlock) {
        if (totalWarlock.matches("[0-9]")) {
            this.totalWarlock = totalWarlock;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String  getTotalMonk() {
        return totalMonk;
    }

    public void setTotalMonk(String totalMonk) {
        if (totalMonk.matches("[0-9]")) {
            this.totalMonk = totalMonk;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String  getTotalBard() {
        return totalBard;
    }

    public void setTotalBard(String  totalBard) {
        if (totalBard.matches("[0-9]")) {
            this.totalBard = totalBard;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String  getTotalSorcerer() {
        return totalSorcerer;
    }

    public void setTotalSorcerer(String  totalSorcerer) {
        if (totalSorcerer.matches("[0-9]")) {
            this.totalSorcerer = totalSorcerer;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }

    public String getTotalDruid() {
        return totalDruid;
    }

    public void setTotalDruid(String  totalDruid) {
        if (totalDruid.matches("[0-9]")) {
            this.totalDruid = totalDruid;
        }
        else{
            throw new IllegalArgumentException("Input must only be an Integer!");
        }

    }
}
