package ch2.item2;

import java.util.Objects;

import static ch2.item2.NyPizza.Size.SMALL;
import static ch2.item2.Pizza.Topping.ONION;
import static ch2.item2.Pizza.Topping.SAUSAGE;

public class NyPizza extends Pizza{
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }


}
