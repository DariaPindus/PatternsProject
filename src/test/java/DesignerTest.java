import com.daria.university.kursovaya.components.Template;
import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.decorators.EmployedDesigner;
import com.daria.university.kursovaya.decorators.Intern;
import com.daria.university.kursovaya.members.Designers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DesignerTest {
    Designer intern = new Intern("John Smith");
    Designer empl = new EmployedDesigner("Gary Richardson");

    String str1 = "Simple idea by intern, knowing basic concepts.";
    String str2="Significant idea by employed designer with experience in this stuff";

    List<Designer> desList = new ArrayList<Designer>();
    Designers des;

    @Test
    public void testEqualsmethods(){
        try {
            intern.makeAnIdea();
            empl.makeAnIdea();
            Assert.assertEquals(intern.getIdea(), str1);
            Assert.assertEquals(empl.getIdea(), str2);
        } catch (IllegalAccessException e){

        }
    }

    @Test
    public void testClearTemplateCode(){
        fillList();

        des.doMainTask(2);
        Assert.assertNotNull(des.getTemplate());

        des.clearTemplateCode();
        Assert.assertEquals(des.getTemplate().getCode().length(), 0);

    }

    private void fillList(){
        desList.add(intern);
        desList.add(empl);
        des = new Designers(desList);
    }

}
