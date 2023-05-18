import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    Bun bun = new Bun("black bun", 100);

    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"black bun", 100F},
        };
    }
    @Test
    public void getNameTest(){
        String ActualName = bun.getName();
        assertEquals(ActualName, name);
    }
    @Test
    public void getPriceTest() {
        float actualPrice = bun.getPrice();
        assertEquals(actualPrice, price, 0F);
    }
}

