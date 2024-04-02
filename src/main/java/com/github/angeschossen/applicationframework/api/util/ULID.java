package com.github.angeschossen.applicationframework.api.util;

import com.github.angeschossen.applicationframework.api.handler.APIHandler;
import org.jetbrains.annotations.NotNull;

public interface ULID {

    @NotNull
    static ULID randomULID() {
        return APIHandler.getInstance().getFactory().randomULID();
    }

    @NotNull
    static ULID fromString(@NotNull String s) {
        return APIHandler.getInstance().getFactory().fromString(s);
    }
}
