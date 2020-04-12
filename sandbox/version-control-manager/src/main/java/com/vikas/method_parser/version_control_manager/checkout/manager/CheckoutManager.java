package com.vikas.method_parser.version_control_manager.checkout.manager;

import java.util.List;

public interface CheckoutManager {
    void checkout(List<String> repoURLs, String checkoutPath);
}
