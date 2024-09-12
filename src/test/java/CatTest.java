import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

  @Mock
  private Feline feline;


    //Тест метода GetSound класса Cat, сравнение возвращаемого строкового значения
    @Test
    public void catGetSoundTest() {
        Cat testCat = new Cat(feline);
        String actualCatSound = testCat.getSound();
        Assert.assertEquals("Мяу", actualCatSound);
    }

    //Тест метода GetFood класса Cat. Проверка вызова метода eatMeat
    @Test
    public void catGetFoodTest() throws Exception {
        Cat testCat = new Cat(feline);
        testCat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}