package io.java.movieratingdataservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public void getUserRating(List<Rating> ratings) {
    }
}
