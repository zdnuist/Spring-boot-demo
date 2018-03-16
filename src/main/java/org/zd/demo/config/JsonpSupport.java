package org.zd.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by zd on 2018/3/16.
 */
@ControllerAdvice(basePackages = "org.zd.demo")
public class JsonpSupport extends AbstractJsonpResponseBodyAdvice {

    public JsonpSupport(){
        super("callback", "jsoup");
    }
}
