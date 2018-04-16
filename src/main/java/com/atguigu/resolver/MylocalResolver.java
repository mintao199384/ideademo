package com.atguigu.resolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Component("localeResolver")
public class MylocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        Locale locale = null;
        String localeStr = request.getParameter("locale");
        if (localeStr!=null && !localeStr.equals("")){

            String[] split = localeStr.split("_");
            locale = new Locale(split[0],split[1]);
        }else {
            locale = request.getLocale();
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
        throw new UnsupportedOperationException(
                "Cannot change HTTP accept header - use a different locale resolution strategy");
    }
}
