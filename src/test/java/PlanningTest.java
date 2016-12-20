import com.daria.university.kursovaya.Main;
import com.daria.university.kursovaya.commands.PlanningCommand;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Programmers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlanningTest {
    Programmers programmers;
    List<String> programmersStuff = new ArrayList<String>();
    Designers designers = new Designers(Main.fillDesigners());
    PlanningCommand planningCommand;

    public void prepare(){
        programmersStuff.add("Emma Floyd");
        programmersStuff.add("Donald Myers");
        programmersStuff.add("Ricky Carlson");
        programmers = new Programmers(programmersStuff);
        planningCommand = new PlanningCommand(designers, programmers);
    }

    @Test
    public void testExecute(){
        prepare();
        planningCommand.execute();
        Assert.assertNotNull("Template wasn't created", designers.getTemplate());
        Assert.assertNotNull("PSD Template wasn't created", designers.getTemplate().getPsdTemplate());
        Assert.assertNotEquals("DeadLine wasn't set", programmers.getDeadLine(), -1);
    }

    @Test
    public void testUndo(){
        prepare();
        planningCommand.execute();
        planningCommand.undo();
        Assert.assertNull("Psd template wasn't reset", designers.getTemplate().getPsdTemplate());
        Assert.assertEquals("DeadLine wansn't reset", programmers.getDeadLine(), -1);
    }
}
