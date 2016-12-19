import com.daria.university.kursovaya.members.Manager;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ManagerTest {
    Manager manager = new Manager("Manager Name");

    @Test
    public void testReportSetting(){
        manager.doMainTask(new Random().nextInt(3)+1);
        Assert.assertNotNull("Test message", manager.getReport());
    }
}
