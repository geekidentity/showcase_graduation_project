package com.geekidentity.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)
public @interface CellStyle {
	int index() default -1;
	String title();
	
	Class<?> type() default Object.class;
}
