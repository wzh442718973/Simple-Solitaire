
package com.ardently.love.mon;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;





 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BVPurpleSpider {
     
    String value();
}

