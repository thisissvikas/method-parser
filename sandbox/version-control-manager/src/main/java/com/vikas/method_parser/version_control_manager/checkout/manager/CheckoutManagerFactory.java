package com.vikas.method_parser.version_control_manager.checkout.manager;

public class CheckoutManagerFactory {
    public static CheckoutManager getCheckoutManager(){
        return new GITCheckoutManager();
    }
}
