package com.pramod.book.auth;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate-account");

    EmailTemplateName(String name) {
        this.name = name;
    }

    private final String name;
}
