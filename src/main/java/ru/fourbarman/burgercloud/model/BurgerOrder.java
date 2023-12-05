package ru.fourbarman.burgercloud.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/**
 * BurgerOrder.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version $Id$.
 * @since 05.12.2023.
 */
@Data
public class BurgerOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Burger> burgers = new ArrayList<>();

    public void addBurger(Burger burger) {
        this.burgers.add(burger);
    }
}
