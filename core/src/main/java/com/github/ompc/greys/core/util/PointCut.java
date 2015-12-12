package com.github.ompc.greys.core.util;

import com.github.ompc.greys.core.util.matcher.Matcher;

/**
 * 切入点
 * Created by oldmanpushcart@gmail.com on 15/10/24.
 */
public class PointCut {

    // 类匹配
    private final Matcher<Class<?>> classMatcher;

    // 方法匹配
    private final Matcher<GaMethod> gaMethodMatcher;

    /**
     * 构造切入点
     *
     * @param classMatcher  类匹配
     * @param gaMethodMatcher 方法匹配
     */
    public PointCut(Matcher<Class<?>> classMatcher, Matcher<GaMethod> gaMethodMatcher) {
        this.classMatcher = classMatcher;
        this.gaMethodMatcher = gaMethodMatcher;
    }

    public Matcher<Class<?>> getClassMatcher() {
        return classMatcher;
    }

    public Matcher<GaMethod> getGaMethodMatcher() {
        return gaMethodMatcher;
    }
}
