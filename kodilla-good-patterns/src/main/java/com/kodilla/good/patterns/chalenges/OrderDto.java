package com.kodilla.good.patterns.chalenges;

public class OrderDto {
    public User user;
    public boolean translactionConfirmed;

    public OrderDto(User user, boolean translactionConfirmed) {
        this.user = user;
        this.translactionConfirmed = translactionConfirmed;
    }

    public User getUser() {
        return user;
    }

    public boolean isTranslactionConfirmed() {
        return translactionConfirmed;
    }
}
