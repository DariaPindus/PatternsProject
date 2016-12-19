import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.decorators.EmployedDesigner;
import com.daria.university.kursovaya.decorators.Intern;
import org.junit.Assert;
import org.junit.Test;

public class DesignerTest {
    Designer intern = new Intern("John Smith");
    Designer empl = new EmployedDesigner("Gary Richardson");

    String str1 = "Simple idea by intern, knowing basic concepts.";
    String str2="Significant idea by employed designer with experience in this stuff";

    @Test
    public void testEqualsmethods(){
        intern.makeAnIdea();
        empl.makeAnIdea();
        Assert.assertEquals(intern.getIdea(), str1);
        Assert.assertEquals(empl.getIdea(), str2);
    }

}
