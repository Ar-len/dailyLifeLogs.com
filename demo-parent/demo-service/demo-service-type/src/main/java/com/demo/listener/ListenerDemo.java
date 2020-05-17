package com.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerDemo implements ServletRequestListener {
    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("destory");
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("init");
    }
}
