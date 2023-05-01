package ru.netology.javaqa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Максим";
        post.passport = "1234 № 12345678";
        post.patronymic = "Владимирович";
        post.phone = "8(123)45678910";
        post.surname = "Северный";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "4";
        post.birthday.year = "1996";

    }
}