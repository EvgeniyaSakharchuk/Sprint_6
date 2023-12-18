import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;


import java.util.List;

@RunWith(Parameterized.class)
public class TestLionWithParam {
    public boolean hasMane;
    public String sex;
    Feline feline = Mockito.mock(Feline.class);


    public TestLionWithParam(String sex, boolean hasMane){
        this.sex =sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters()
    public static Object[][] getManeTest() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void LionHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(lion.doesHaveMane(), hasMane);
    }
}
