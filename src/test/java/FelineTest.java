import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline testFeline;

    @Test
    public void felineEatMeatTest() throws Exception{
        testFeline.eatMeat();
        Mockito.verify(testFeline).getFood("Хищник");

    }


    @Test
    public void felineGetFamilyTest() {
        String actualFamily = testFeline.getFamily();
        Assert.assertEquals("Кошачьи", actualFamily);

    }

    @Test
    public void FelineGetKittens_Without_ArgumentTest() {
        testFeline.getKittens();
        Mockito.verify(testFeline).getKittens(1);

    }

    @Test
    public void felineGetKittens_With_ArgumentTest() {
        testFeline.getKittens(7);
        Mockito.verify(testFeline).getKittens(7);
    }


}