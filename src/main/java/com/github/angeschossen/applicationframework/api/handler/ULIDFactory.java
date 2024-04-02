package com.github.angeschossen.applicationframework.api.handler;

import com.github.angeschossen.applicationframework.api.util.ULID;
import org.jetbrains.annotations.NotNull;

public interface ULIDFactory {

    @NotNull
    ULID randomULID();

    @NotNull
    ULID fromString(@NotNull String s);
}
