package com.example.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "HelloFilter",  urlPatterns="/helloServlet")
public class HelloFilter implements Filter {
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("Executing doFilter method");
        chain.doFilter(req, resp);
        System.out.println("Done executing doFilter method");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
