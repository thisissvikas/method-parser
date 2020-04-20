package com.vikas.method_parser.tags_manager.provider;

import java.util.ArrayList;
import java.util.List;

public class TagsProviderFactory {
    public static List<TagsProvider> getAllProviders(){
        List<TagsProvider> providers = new ArrayList<>();
        providers.add(new CTAGSProvider());
        providers.add(new UCTAGSProvider());
        return providers;
    }
}
