package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static LocalDate generateDate(int shift) {
        LocalDate date = LocalDate.now();
        return date;
    }git 

    public static String generateCity(String locale) {
        Faker faker = new Faker(new Locale("ru"));
        String city = faker.address().city();
        return city;
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale("ru"));
        String name= String.valueOf(faker.name());
        return name;
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().cellPhone();
        return phone;
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return user(
                    generateCity(locale),
                    generateName(locale),
                    generatePhone(locale)
            );
        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}