import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundTest() {
        var cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

}
