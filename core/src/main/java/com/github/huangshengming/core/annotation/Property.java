package com.github.huangshengming.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: hsm
 * @Description:
 * @Date: 2020/9/26
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface Property
{
    String name() default "";

    //Class<? extends TypeConverter> converter() default TypeConverter.NoneTypeConverter.class;
}
