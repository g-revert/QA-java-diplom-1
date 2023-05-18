import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseTest {

    private List<Bun> buns = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();

    @Spy
    private Database database;

    @Test
    public void availableBunsTest() {
        buns.add(new Bun("123", 123F));
        buns.add(new Bun("234", 124F));
        buns.add(new Bun("345", 125F));

        assertEquals(buns.size(), database.availableBuns().size());
    }

    @Test
    public void availableIngredientsTest() {
        ingredients.add(new Ingredient(SAUCE, "d", 150F));
        ingredients.add(new Ingredient(FILLING, "d", 150F));
        ingredients.add(new Ingredient(FILLING, "d", 156F));
        ingredients.add(new Ingredient(SAUCE, "d", 140F));
        ingredients.add(new Ingredient(FILLING, "d", 444F));
        ingredients.add(new Ingredient(SAUCE, "d", 135F));

        assertEquals(ingredients.size(), database.availableIngredients().size());
    }
}
