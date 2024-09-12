import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParamLionTest {

    String sex;
    static Feline feline;
    boolean expected;

     public ParamLionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    //Параметризованный тест на создание объекта класса "Лев" (Самец/Самка), проверка наличия гривы у объекта
    @Test
    public void LionHasMane_With_ParamTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(hasMane, expected);
    }

}



