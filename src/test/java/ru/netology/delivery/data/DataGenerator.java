package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static LocalDate generateDate(int shift) {
        LocalDate date = LocalDate.now();
        return date;
    }

    public static String generateCity(String locale) {

        String[] city= new String[]{"Архангельск","Астрахань","Белгород","Брянск", "Владимир",
                "Волгоград", "Вологда", "Воронеж", "Мелитополь", "Иваново", "Иркутск",
                "Калининград", "Калуга", "Кемерово", "Киров", "Кострома", "Курган", "Курск",
                "Липецк", "Магадан", "Мурманск","Нижний Новгород",
                "Великий Новгород", "Новосибирск","Омск", "Оренбург","Орёл","Пенза","Псков",
                "Ростов-на-Дону","Рязань","Самара","Саратов","Южно-Сахалинск","Екатеринбург","Смоленск","Тамбов",
                "Тверь","Томск","Тула","Тюмень","Ульяновск","Херсон","Челябинск","Ярославль","Москва",
                "Санкт-Петербург","Севастополь","Биробиджан","Нарьян-Мар","Ханты-Мансийск","Анадырь","Салехард"};
        Random rand = new Random();
            return city [rand.nextInt(city.length)];
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale("ru"));
        String name = String.valueOf(faker.name());
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
            UserInfo user = new UserInfo();


            return user;
        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }


}
