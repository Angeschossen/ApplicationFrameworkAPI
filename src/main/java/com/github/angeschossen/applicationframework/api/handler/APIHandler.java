package com.github.angeschossen.applicationframework.api.handler;

public class APIHandler {
    private final ULIDFactory ULIDFactory;
    private static APIHandler instance;

    public static APIHandler getInstance() {
        return instance;
    }

    public ULIDFactory getFactory() {
        return ULIDFactory;
    }

    public APIHandler(ULIDFactory ULIDFactory) {
        if (instance != null) {
            throw new IllegalStateException("Already initialized");
        }

        APIHandler.instance = this;
        this.ULIDFactory = ULIDFactory;
    }
}
