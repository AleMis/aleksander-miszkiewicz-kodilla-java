package com.kodilla.stream.immutable;

public final class FormUser {

    private final String userName;
    private final String realName;

    public FormUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }


}
