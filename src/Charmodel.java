import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;
import org.apache.commons.lang3.*;

public class Charmodel {

    private String charRace;
    private int totalFighter;
    private int totalRogue;
    private int totalWizard;
    private int totalBarbarian;
    private int totalCleric;
    private int totalRanger;
    private int totalPaladin;
    private int totalWarlock;
    private int totalMonk;
    private int totalBard;
    private int totalSorcerer;
    private int totalDruid;


public void characterModel(String chrRac, int totFighter, int totRogue,int totWizard,int totBarbarian,int totCleric,int totRanger,int totPaladin,int totWarlock,int totMonk,int totBard,int totSorcerer,int totDruid)
{
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

}

    public String getCharRace() {return charRace;
    }
    public void setCharRace(String charRac) {
        if (StringUtils.isNumeric(charRac)) {
            throw new IllegalArgumentException("Input must only be text!");
        } else {
            this.charRace = charRac;
        }
    }

    public int getTotalFighter() {
        return totalFighter;
    }

    public void setTotalFighter(int totalFighter) {
        this.totalFighter = totalFighter;
    }

    public int getTotalRogue() {
        return totalRogue;
    }

    public void setTotalRogue(int totalRogue) {
        this.totalRogue = totalRogue;
    }

    public int getTotalWizard() {
        return totalWizard;
    }

    public void setTotalWizard(int totalWizard) {
        this.totalWizard = totalWizard;
    }

    public int getTotalBarbarian() {
        return totalBarbarian;
    }

    public void setTotalBarbarian(int totalBarbarian) {
        this.totalBarbarian = totalBarbarian;
    }

    public int getTotalCleric() {
        return totalCleric;
    }

    public void setTotalCleric(int totalCleric) {
        this.totalCleric = totalCleric;
    }

    public int getTotalRanger() {
        return totalRanger;
    }

    public void setTotalRanger(int totalRanger) {
        this.totalRanger = totalRanger;
    }

    public int getTotalPaladin() {
        return totalPaladin;
    }

    public void setTotalPaladin(int totalPaladin) {
        this.totalPaladin = totalPaladin;
    }

    public int getTotalWarlock() {
        return totalWarlock;
    }

    public void setTotalWarlock(int totalWarlock) {
        this.totalWarlock = totalWarlock;
    }

    public int getTotalMonk() {
        return totalMonk;
    }

    public void setTotalMonk(int totalMonk) {
        this.totalMonk = totalMonk;
    }

    public int getTotalBard() {
        return totalBard;
    }

    public void setTotalBard(int totalBard) {
        this.totalBard = totalBard;
    }

    public int getTotalSorcerer() {
        return totalSorcerer;
    }

    public void setTotalSorcerer(int totalSorcerer) {
        this.totalSorcerer = totalSorcerer;
    }

    public int getTotalDruid() {
        return totalDruid;
    }

    public void setTotalDruid(int totalDruid) {
        this.totalDruid = totalDruid;
    }
}
