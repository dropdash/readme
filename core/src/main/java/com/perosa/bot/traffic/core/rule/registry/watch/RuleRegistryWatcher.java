package com.perosa.bot.traffic.core.rule.registry.watch;

import com.perosa.bot.traffic.core.common.CoreConfiguration;

public interface RuleRegistryWatcher {

    static void init() {

        if(new CoreConfiguration().isThreadWatch()) {
            new RuleRegistryThreadWatcher().startWatch();
        } else {
            new RuleRegistryFileWatcher().startWatch();
        }
    }

    void startWatch();


}