import com.example.Feline;
import com.example.Lion;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import java.util.regex.Matcher;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    String sex;
    @Mock
    Feline feline;
    Lion lion;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);
        lion = new Lion("Самец", feline);
    }
    @Test
    public void getKittens() {
        int expected = 1;
        Assert.assertEquals("У льва один котенок", expected, lion.getKittens());
    }
    @Test(expected = Exception.class)
    public void lionExceptionTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String>expectedFood = feline.getFood("Хищник");
        List<String>actualFood = lion.getFood();
        Assert.assertEquals("не корректный спиок еды",expectedFood, actualFood);
    }

}
