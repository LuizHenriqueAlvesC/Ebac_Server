/**
 * 
 */
package br.com.luiz.vendas.online.VendaServiceAlunos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.vendas.online.VendaServiceAlunos.domain.Venda;

/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
