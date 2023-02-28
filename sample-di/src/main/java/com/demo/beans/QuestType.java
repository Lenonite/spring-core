package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface QuestType {
    Type type() ;
    enum Type{
        Dragon,
        Dimsel,
        Matrimont,
        Yoyeyo
    }
}
