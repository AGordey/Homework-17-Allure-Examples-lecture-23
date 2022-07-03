package com.github.AGordey;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthTest {

    @Test
    @AllureId("10865")
    @DisplayName("Авторизация")
    @Tags({@Tag("shop"), @Tag("critical")})
    @Owner("allure8")
    public void AuthTest() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку авторизация", () -> {
            step("Вводим логин *Testlogin*");
            step("Вводим пароль *Testpassword*");
            step("Ставим галочку *Im not robot*");
        });
        step("Нажимаем кнопку Войти");
        step("Открыта главная страница сайта с профилем пользователя");
        step("Проверить соответствие введенным *Testlogin* и *Testpassword*");
    }

    @Test
    @AllureId("10879")
    @DisplayName("Работа поиска")
    @Tags({@Tag("shop"), @Tag("critical")})
    @Owner("allure8")
    public void SearchTest () {
        step("Открываем главную страницу");
        step("Нажимаем кнопку авторизация", () -> {
            step("Вводим логин *Testlogin*");
            step("Вводим пароль *Testpassword*");
            step("Ставим галочку *Im not robot*");
        });
        step("Нажимаем кнопку Войти");
        step("Открыта главная страница сайта с профилем пользователя");
        step("Выполняем поиковый запрос", () -> {
            step("Вводим в поисковую строку значение для поиска");
            step("Нажимаем кнопку Найти");
            step("Открыта страница с результатами поиска в соответствии с поисковым запросом");
        });
        step("Проверяем результаты поискового запроса на соответствие поисковому значению");
    }

    @Test
    @AllureId("10880")
    @DisplayName("Добавление артикулов в корзину")
    @Tags({@Tag("shop"), @Tag("critical")})
    @Owner("allure8")
    public void AddToCardTest () {
        step("Открываем главную страницу");
        step("Нажимаем кнопку авторизация", () -> {
            step("Вводим логин *Testlogin*");
            step("Вводим пароль *Testpassword*");
            step("Ставим галочку *Im not robot*");
        });
        step("Нажимаем кнопку Войти");
        step("Открыта главная страница сайта с профилем пользователя");
        step("Открываем каталог с товарами", () -> {
            step("Выбираем товар ");
            step("Переходим на его страницу");
            step("Нажимаем на кнопку Добавить в корзину");
            step("Кнопка меняет цвет");
            step("Появляется уведомление о добавлении в корзину");
        });
        step("Открываем корзину ");
        step("Проверяем наличие добавленного товара в корзине");
    }
}
