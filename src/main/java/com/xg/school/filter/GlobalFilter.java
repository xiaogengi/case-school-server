package com.xg.school.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: case-school-server
 * @description:
 * @author: gengzhaokai
 * @create: 2020-09-09 16:43
 **/
//@WebFilter(filterName="GlobalFilter",urlPatterns="/*")
//@Order(-1)
public class GlobalFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(req, res);
    }
}
