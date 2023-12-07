package ru.fourbarman.burgercloud.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.fourbarman.burgercloud.model.Ingredient;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("BBUN", new Ingredient("BBUN", "Black bun", Ingredient.Type.WRAP));
        ingredientMap.put("WBUN", new Ingredient("WBUN", "White bun", Ingredient.Type.WRAP));
        ingredientMap.put("PORCUT", new Ingredient("PORCUT", "Pork cutlet", Ingredient.Type.PROTEIN));
        ingredientMap.put("CHCUT", new Ingredient("CHCUT", "Chicken cutlet", Ingredient.Type.PROTEIN));
        ingredientMap.put("CHED", new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
        ingredientMap.put("JACK", new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
        ingredientMap.put("TMTO", new Ingredient("TMTO", "Tomato", Ingredient.Type.VEGGIES));
        ingredientMap.put("SLSA", new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
        ingredientMap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
