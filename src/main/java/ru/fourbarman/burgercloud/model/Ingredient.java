package ru.fourbarman.burgercloud.model;

import lombok.Data;
/**
 * Ingredient.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version $Id$.
 * @since 05.12.2023.
 */
@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
