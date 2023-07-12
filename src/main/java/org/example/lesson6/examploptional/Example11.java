package org.example.lesson6.examploptional;

import java.util.function.Function;

public class Example11 {
    public static void main(String[] args) {
        City bachmut = new City("Bachmut");
        Address address = new Address(bachmut);
//        Address address = new Address(null);
        User user = new User(address);
        String name = null;
        if (user != null) {
            Address address1 = user.getAddress();
            if (address1 != null) {
                City city = address1.getCity();
                if (city != null) {
                    name = city.getName();
                }
            }
        }
        System.out.println(name);


        String cityName = MyOptional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .getOrDefault("Defalt city");

        System.out.println(cityName);


    }
}

class User {
    private final Address address;

    User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private final City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}

class City {
    private final String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MyOptional<T> {
    private static final MyOptional EMPTY = new MyOptional(null);

    private T value;

    private MyOptional(T value) {
        this.value = value;
    }

    public static <E> MyOptional<E> of(E value) {
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            return new MyOptional<>(value);
        }
    }

    public static <E> MyOptional<E> ofNullable(E value) {
        return value == null ? EMPTY : new MyOptional<>(value);
    }

    public <R> MyOptional<R> map(Function<T, R> convertor) {
        return value == null ? EMPTY : new MyOptional<>(convertor.apply(value));
    }

    public T get() {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        return value;
    }

    public T getOrDefault(T defaultValue) {
        return value == null ? defaultValue : value;
    }
}
