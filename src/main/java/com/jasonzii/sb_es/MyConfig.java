package com.jasonzii.sb_es;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @Author : jasonzii @Author
 * @Description :
 * @CreateDate : 18.4.22  14:22
 */
@Configuration
public class MyConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        InetSocketTransportAddress node = new InetSocketTransportAddress(
            InetAddress.getByName("192.168.25.128"),
                9300
        );

        Settings settings = Settings.builder()
                .put("cluster.name","elasticsearch")
                .build();

        TransportClient client =  new PreBuiltTransportClient(Settings.EMPTY);

        client.addTransportAddress(node);

        return client;
    }

}
