package ru.fourbarman.burgercloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.fourbarman.burgercloud.model.Burger;
import ru.fourbarman.burgercloud.model.BurgerOrder;
import ru.fourbarman.burgercloud.model.Ingredient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ru.fourbarman.burgercloud.model.Ingredient.*;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("burgerOrder")
public class DesignBurgerController {
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("BBUN", "Black bun", Type.WRAP),
                new Ingredient("WBUN", "White bun", Type.WRAP),
                new Ingredient("PORCUT", "Pork cutlet", Type.PROTEIN),
                new Ingredient("CHCUT", "Chicken cutlet", Type.PROTEIN),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("TMTO", "Tomato", Type.VEGGIES),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );

        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(
                    type.toString().toLowerCase(),
                    filterByType(ingredients, type)
            );
        }
    }

    @ModelAttribute(name="burgerOrder")
    public BurgerOrder order() {
        return new BurgerOrder();
    }

    @ModelAttribute(name = "burger")
    public Burger burger() {
        return new Burger();
    }

    @GetMapping
    public String showDesignForm() {
        return "design";
    }

    private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
