/**
 * 
 */
package br.com.luiz.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author rodrigo.pires
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.luiz.vendas.online.ProdutoServiceAlunos.repository")
public class MongoConfig {

}
