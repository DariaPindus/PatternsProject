import com.daria.university.kursovaya.Main;
import com.daria.university.kursovaya.commands.AnalyzeCommand;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Manager;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AnalyzeCommandTest {

    Designers designers = new Designers(Main.fillDesigners());
    Manager manager = new Manager("New Name");

    List<String> requirements = new ArrayList<String>();
    AnalyzeCommand analyze;

    public void prepare(){
        requirements.add("First dumb req");
        requirements.add("Seconf req");
        requirements.add("Third req");
        analyze = new AnalyzeCommand(designers, manager, requirements);
    }

    @Test
    public void testExecute(){
        prepare();
        analyze.execute();
        Assert.assertNotNull("Requirements weren't set", manager.getRequirements());
        Assert.assertEquals("Report wasn't set correctly", manager.getReport(), "We've created plan according to all clients requirements.");
    }

    @Test
    public void testUndo(){
        prepare();
        analyze.undo();
        Assert.assertNull("Requirements weren't cleared", manager.getRequirements());
        Assert.assertNull("Report wasn't cleared", manager.getReport());
    }

    @Test
    public void testRepeated(){
        prepare();
        analyze.execute();
        analyze.undo();
        analyze.execute();
        Assert.assertNotNull("Requirements weren't set", manager.getRequirements());
        Assert.assertEquals("Report wasn't set correctly", manager.getReport(), "We've created plan according to all clients requirements.");
    }
}
