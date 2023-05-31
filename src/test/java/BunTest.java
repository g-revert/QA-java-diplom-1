import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    private final Bun bun;
    private final String expectedName;
    private final float expectedPrice;

    public BunTest(Bun bun, String expectedName, float expectedPrice) {
        this.bun = bun;
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][]{
                {new Bun("black bun", 100), "black bun", 100},
                {new Bun("", -100), "", -100},
                {new Bun(null, 0F), null, 0F},
                {new Bun("black white purple cosmic burger_123", 0.1F), "black white purple cosmic burger_123", 0.1F},
                {new Bun("]-=';[.", 300F), "]-=';[.", 300F},
                {new Bun("1122334455667788", -0.1F), "1122334455667788", -0.1F},

        };
    }

    @Test
    public void getNameTest(){
        String ActualName = bun.getName();
        assertEquals(expectedName, ActualName);
    }

    @Test
    public void getPriceTest(){
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice, 0F);
    }

}

