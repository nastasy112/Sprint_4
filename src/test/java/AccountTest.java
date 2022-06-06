import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] checkNameToEmbossForName() {
        return new Object[][] {
                { "Тимоти Шаламе", true},
                { "Ти", false},
                { "Пакахонтес Лоуренсес", false},
                { " ТимотиШаламе", false},
                { "ТимотиШаламе ", false},
                { "Хайко фон дер Ляйен", false},
                { "ТимотейШевроле", false},
                {"", false}
        };
    }

    @Test
    public void checkAccountConstructor(){
        Account account = new Account(name);

        boolean actualResult = account.checkNameToEmboss();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
