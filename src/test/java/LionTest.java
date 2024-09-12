import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    private Feline feline;

    //Проверка исключения в методе - передача некорректного значения в аргумент половой принадлежности льва
    @Test
    public void Lion_InvalidSexTest() {
          try {
                 Lion lion = new Lion("Львенок", feline);
          }
          catch (Exception invalidSex) {
                assertEquals("Используйте допустимые значения пола животного - самец или самка", invalidSex.getMessage());
        };
    }

    //Тест на получение списка продуктов питания льва, класс "хищник"
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> resultFood = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, resultFood);
    }

    //Тест на вызов метода GetKittens
    @Test
    public void GetKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

}



