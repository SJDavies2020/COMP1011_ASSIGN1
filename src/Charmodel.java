import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;
import org.apache.commons.lang3.*;

public class Charmodel {

    private String charClass;
    private String charRace;
    private int total;

public void characterModel(String charCls, String charRac, int tot)
{
    setCharClass(charCls);
    setCharRace(charRac);
    setTotal(tot);
}
    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charCls) {
        if (StringUtils.isNumeric(charCls)) {
            throw new IllegalArgumentException("Input must only be text!");
        } else {
            this.charClass = charCls;
        }
       this.charClass = charClass;
    }
    public String getCharRace() {return charRace;
    }
    public void setCharRace(String charRac) {
        if (StringUtils.isNumeric(charRac)) {
            throw new IllegalArgumentException("Input must only be text!");
        } else {
            this.charClass = charRac;
        }
    }
    public int getTotal() {return total;
    }
    public void setTotal(int total) {
        if (total>0)
            this.total = total;
        else
            throw new IllegalArgumentException("student number must be greater than 0");
    }

}
