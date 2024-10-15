package com.intuit.app;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;

@ExtendWith(MockitoExtension.class)
public abstract class BaseTest {

    public static boolean isEquals(Collection<?> a, Collection<?> b) {
        return a.size() == b.size() && a.containsAll(b);
    }

}
