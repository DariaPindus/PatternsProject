import com.daria.university.kursovaya.Main;
import com.daria.university.kursovaya.commands.ExecutionCommand;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Programmers;
import com.daria.university.kursovaya.service.StringsGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExecutionTest {
    Designers designers = new Designers(Main.fillDesigners());
    Programmers programmers;
    List<String> programmersStuff = new ArrayList<String>();
    ExecutionCommand executionCommand;

    public void prepare(){
        programmersStuff.add("Emma Floyd");
        programmersStuff.add("Donald Myers");
        programmersStuff.add("Ricky Carlson");
        programmers = new Programmers(programmersStuff);
        executionCommand = new ExecutionCommand(designers, programmers);
    }

    @Test
    public void testDesignersExecution(){
        prepare();
        executionCommand.execute();
        Assert.assertNotNull(designers.getTemplate().getCode());
        Assert.assertNotNull("Code wasn't written", programmers.getCode());
        Assert.assertNotNull("DB wasn't written", programmers.getDataBase());
    }

    @Test
    public void testWritingDataBase(){
        System.out.println("String Generator consists : " + StringsGenerator.stringsForDB.size() + " elements");
        String str = StringsGenerator.stringsForDB.get(new Random().nextInt(9));
        System.out.println(str);
        Assert.assertNotNull(str);
    }

    @Test
    public void testUndo(){
        prepare();
        executionCommand.execute();
        executionCommand.undo();
        Assert.assertEquals("Code is not empty", designers.getTemplate().getCode().length(), 0);
        Assert.assertEquals("Programmers' code is not empty", programmers.getCode().length(), 0);
        Assert.assertEquals("DB is not empty", programmers.getDataBase().length(), 0);
    }
}
