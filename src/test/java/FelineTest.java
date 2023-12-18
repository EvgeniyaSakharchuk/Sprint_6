import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void isFelineFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals("Семейство Feline называется Кошачьи", expected, feline.getFamily());
    }

    @Test
    public void countKittensWithArgs() {
        Feline feline = new Feline();
        int expected = 3;
        Assert.assertEquals("Если указано количество котят, то оно вернётся.",
                expected, feline.getKittens(expected));
    }

    @Test
    public void countKittensNoArgs() {
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals("Если нет количества котят, то котёнок - один.", expected, feline.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("не корректный спиок еды",feline.eatMeat(), feline.getFood("Хищник"));
    }
}
