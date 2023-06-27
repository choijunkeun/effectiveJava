package ch2.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

import static ch2.item2.NyPizza.Size.SMALL;
import static ch2.item2.Pizza.Topping.*;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 하위 클래스는 self()클래스를 오버라이딩 하여 this를 반환하도록 해야한다.
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calPizza = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println("nyPizza = " + nyPizza);
        System.out.println("calPizza = " + calPizza);

    }
}
