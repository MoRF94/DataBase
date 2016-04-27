import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victo on 27.04.2016.
 */
public class SecurityTest {

    @Test
    public void getPersonInformation(){
        Security security = new Security("Виктор", "Мацкевич", 21, 4);
        Assert.assertEquals(security.getPersonInformation(), "Виктор Мацкевич 21");
    }

    @Test
    public void computeSalary(){
        Security security = new Security("Илья", "Таций", 22, 4);
        Assert.assertEquals(security.computeSalary(), 458, 0.01);
    }

    @Test
    public void sendAgeSecurity(){
        Security security = new Security("Илья", "Таций", 22, 4);
        security.setAge(9);
        Assert.assertEquals(security.getAge(), 22.0, 0.1);
        Assert.assertEquals(security.getAge(), 2.0, 0.1);
    }
}
