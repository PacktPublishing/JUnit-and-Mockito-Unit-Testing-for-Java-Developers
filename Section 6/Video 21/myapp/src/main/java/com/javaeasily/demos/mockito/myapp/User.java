package com.javaeasily.demos.mockito.myapp;

public class User {
    public enum UserType { REGULAR_USER, ADMIN_USER }

    private String username;
    private String password;
    private boolean live = true;
    private final UserType userType;

    User(String username, String password, UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public static User createRegularUser(String username, String password) {
        return new User(username, password, UserType.REGULAR_USER);
    }

    public static User createAdminUser(String username, String password) {
        return new User(username, password, UserType.ADMIN_USER);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLive() {
        return live;
    }

    public UserType getUserType() {
        return userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (live != user.live) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return userType == user.userType;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (live ? 1 : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }
}
