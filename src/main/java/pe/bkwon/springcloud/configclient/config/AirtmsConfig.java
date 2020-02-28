package pe.bkwon.springcloud.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.StringJoiner;

@ConfigurationProperties(prefix = "airtms.rabbitmq")
public class AirtmsConfig {
    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AirtmsConfig.class.getSimpleName() + "[", "]")
                .add("host='" + host + "'")
                .add("port=" + port)
                .toString();
    }
}
