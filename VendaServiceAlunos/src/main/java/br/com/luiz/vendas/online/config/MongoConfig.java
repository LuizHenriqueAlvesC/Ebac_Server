package br.com.luiz.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.luiz.vendas.online.VendaServiceAlunos.repository")
public class MongoConfig {

}
