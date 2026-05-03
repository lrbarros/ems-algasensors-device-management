package com.algaworks.algasensors.device.management;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static final TSID.Factory tsidFactory ;

    static {
        Optional.ofNullable(System.getenv().get("tsid.node"))
                .ifPresent(tsIdNode -> System.setProperty("tsid.node", tsIdNode));

        Optional.ofNullable(System.getenv().get("tsid.node.count"))
                .ifPresent(count -> System.setProperty("tsid.node.count", count));

        tsidFactory =  TSID.Factory.builder().build();
    }

    private IdGenerator() {

    }

    public static TSID generateTSID() {

        return tsidFactory.generate();
    }
}
