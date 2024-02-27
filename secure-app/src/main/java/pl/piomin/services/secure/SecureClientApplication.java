package pl.piomin.services.secure;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SecureClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SecureClientApplication.class).run(args);
    }

//    @Bean
//    public RestTemplateDiscoveryClientOptionalArgs discoveryClientOptionalArgs() throws NoSuchAlgorithmException {
//        RestTemplateDiscoveryClientOptionalArgs args = new RestTemplateDiscoveryClientOptionalArgs();
//
//        System.setProperty("javax.net.ssl.keyStore", "src/main/resources/client.jks");
//        System.setProperty("javax.net.ssl.keyStorePassword", "123456");
//        System.setProperty("javax.net.ssl.trustStore", "src/main/resources/client.jks");
//        System.setProperty("javax.net.ssl.trustStorePassword", "123456");
//        EurekaJerseyClientBuilder builder = new EurekaJerseyClientBuilder();
//        builder.withClientName("client");
//        builder.withSystemSSLConfiguration();
//        builder.withMaxTotalConnections(10);
//        builder.withMaxConnectionsPerHost(10);
//        args.setEurekaJerseyClient(builder.build());
//
//        RestTemplateBuilder builder1 = new RestTemplateBuilder();
//        builder1.setSslBundle(S)
//        return args;
//    }

}
