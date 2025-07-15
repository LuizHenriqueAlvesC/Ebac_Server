package br.com.luiz.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author luiz.henrique
 * 
 */

@Configuration
@EnableMongoRepositories(basePackages = "br.com.luiz.vendas.online.repository")
public class MongoConfig {

}
