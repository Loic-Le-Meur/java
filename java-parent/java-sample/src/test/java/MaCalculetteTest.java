import org.junit.Assert;
import org.junit.Test;

public class MaCalculetteTest {

    @Test
    public void additionTest(){
        int a = 2;
        int b = 3;
        int test = MaCalculette.addition(a,b);
        Assert.assertEquals(5,test);
    }

    @Test
    public void soustractionTest(){
        int a = 2;
        int b = 3;
        int test = MaCalculette.soustraction(a,b);
        Assert.assertEquals(-1,test);
    }

    @Test
    public void divisionTest(){
        float a = 3;
        float b = 2;
        float test = MaCalculette.division(a,b);
        System.out.println(test);
        Assert.assertEquals(1.5,test,0.1);
    }
}
