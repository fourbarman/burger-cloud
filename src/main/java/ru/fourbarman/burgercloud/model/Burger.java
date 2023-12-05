package ru.fourbarman.burgercloud.model;

import lombok.Data;

import java.util.List;
/**
 * Burger.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version $Id$.
 * @since 05.12.2023.
 */
@Data
public class Burger {
    private final String name;
    private List<Ingredient> ingredients;
}
